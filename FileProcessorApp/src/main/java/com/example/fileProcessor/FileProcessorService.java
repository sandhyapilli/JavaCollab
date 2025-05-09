package com.example.fileProcessor;

	import com.fasterxml.jackson.databind.JsonNode;
	import com.fasterxml.jackson.databind.ObjectMapper;
	import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.*;
	import org.springframework.stereotype.Service;
	import org.springframework.web.multipart.MultipartFile;

	import java.io.*;
	import java.util.ArrayList;
	import java.util.List;

	@Service
	public class FileProcessorService {

	  
	    public List<String> processFile(MultipartFile file, int startRow, String ColumnName) throws IOException {
	        String fileName = file.getOriginalFilename();

	        if (fileName == null) {
	            throw new IllegalArgumentException("Invalid file");
	        }

	        if (fileName.endsWith(".xlsx")) {
	            return processExcelFile(file, startRow, ColumnName);
	        } else if (fileName.endsWith(".csv")) {
	            return processCsvFile(file, startRow, ColumnName);
	        } else {
	            throw new IllegalArgumentException("Only CSV or Excel files are supported.");
	        }
	    }

	    private List<String> processExcelFile(MultipartFile file, int startRow, String ColumnName) throws IOException {
	        List<String> output = new ArrayList<>();
	        try (InputStream inputStream = file.getInputStream()) {
	            Workbook workbook = WorkbookFactory.create(inputStream);
	            Sheet sheet = workbook.getSheetAt(0);
	            

	            for (Row row : sheet) {
	                if (row.getRowNum() < startRow) {
	                    continue; 
	                }
	                StringBuilder rowData = new StringBuilder();
	                
	                    
	                    int targetColumnIndex = -1;
                        
	                    for (Cell cell : row) {
	                    	rowData.append(cell.toString()).append(" | ");
	                        if (cell.getStringCellValue().trim().equalsIgnoreCase(ColumnName)){
	                            targetColumnIndex= cell.getColumnIndex(); 
	                            break;
	                        }
	                    }
	                
	                output.add(rowData.toString());
	            }
                      
	        }
	        return output;
	    }

	  
	    private List<String> processCsvFile(MultipartFile file, int startRow, String ColumnName) throws IOException {
	        List<String> output = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
	            String line;
	            int rowNumber = 0;

	            while ((line = br.readLine()) != null) {
	                if (rowNumber >= startRow) {
	                    output.add(line);
	                }
	                rowNumber++;
	            }
	        }
	        return output;
	    }
	  
	    public String convertXmlToJson(MultipartFile file) throws IOException {
	        XmlMapper xmlMapper = new XmlMapper();
	        ObjectMapper jsonMapper = new ObjectMapper();

	      
	        JsonNode jsonNode = xmlMapper.readTree(file.getInputStream());
	        return jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
	    }

		

	  
	}



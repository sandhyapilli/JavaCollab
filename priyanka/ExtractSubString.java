package priyanka;

public class ExtractSubString {
      public static void main(String[] args) {
    	  String str="Sandhya aishu siri";
    	  String result=ExtractOne(str);
    	  System.out.println(result);
		
	}
      public static String ExtractOne(String str) {
    	 // str=str.substring(8, 13);
    	  str=str.substring(14, 18).replace("siri", "sirisha");
    	  return str;
      }
}

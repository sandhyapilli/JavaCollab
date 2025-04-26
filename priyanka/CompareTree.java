package priyanka;


import java.util.TreeMap;
import java.util.Comparator;

public class CompareTree {
public static void main(String[] args) {
	TreeMap<Integer, String> list= new TreeMap<>(new Comparator<Integer>() {
	public int compare(Integer num1, Integer num2) {
		return num2-num1;
	}});
	list.put(1,"Sandhya");
	list.put(3, "Aishu");
	list.put(2, "Sirisha");
	list.put(0, "Rishika");
	System.out.println(list);
	
}}


package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx2 {
	public static void main(String args[]) {
		TreeMap t= new TreeMap();
		t.put("Anand", 205.40);
		t.put("BalaKrishna", 456.35);
		t.put("Harsha", 873.74);
		t.put("Sai", 467.69);
		Set s=t.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry n=(Map.Entry)i.next();
			//System.out.println(n.getKey()+"  "+n.getValue());
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String value=sc.next();
		double val=((Double)t.get(value)).doubleValue();
		val=val+1000;
		t.put("value", val);
		System.out.println("Value after updation"+t.get("value"));
		
	}

}

package practiceCollections;

import java.util.ArrayList;
import java.util.List;

public class Natural {
public static void main(String[] args) {
	List<Integer> squares=new ArrayList<Integer>();
	for(int i=0;i<=10;i++) {
		squares.add(i*i);
	}System.out.println(squares);
}
}

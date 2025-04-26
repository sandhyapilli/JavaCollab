package priyanka;

public class CapitalSmall {
 public static void main(String[] args) {
	String s="JaVa WoRlD";
	String result=s.toLowerCase();
	String[] words=result.split(" ");
	for(String word:words) {
	System.out.print(word.substring(0,1).toUpperCase()+word.substring(1,word.length())+" ");

}}}
 
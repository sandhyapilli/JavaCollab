package sravanthi;

public class Duplicate {
public static void main(String[] args) {
	int arr[]= {2,4,1,4,1,5};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			System.out.println(arr[i]);
		}
	}
}
}}

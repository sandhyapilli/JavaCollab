package arrays;

public class RotateAnArray {
public static void main(String[] args) {
	int[] arr= {1, 2, 3, 4, 5};
	int k=2;
	int n=arr.length;
	k=k%n;
	for(int i=k;i<n;i++) {
		System.out.println(arr[i]);
	}
	for(int i=0;i<k;i++) {
		System.out.println(arr[i]);
	}
}}

package arrays;

public class MoveZerosToEnd {
public static void main(String[] args) {
	int[] arr= {0, 1, 9, 8, 4, 0, 0, 2, 7, 0};
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
		 int temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
		 j++;
		}
	}
	for(int num:arr) {
		System.out.println(num);
	}
}
}

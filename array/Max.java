package array;

public class Max {
	 public static void main(String args[]) {
		 int[] arr=new int[4];
		 arr[0]=10;
		 arr[1]=20;
		 arr[2]=30;
		 arr[3]=40;
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
			 
		 }System.out.println(max);
	 }

}

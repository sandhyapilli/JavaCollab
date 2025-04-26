package priyanka;

public class Stars {
public static void main(String[] args) {
	//for right triangle
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println();
	}
}
	//for left triangle
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" ");
//		}for(int k=1;k<=i;k++) {
//			System.out.print("*");
//		}System.out.println();
//	}
	//for pyramid
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" ");
//		}for(int k=1;k<=2*i-1;k++) {
//			System.out.print("*");
//		}System.out.println();
//	}
}

//real time scenarios for nested for loop is pyramid,right or left triangle or when we use 2d array which is for rows and columns
//outer loop is for rows and
//inner loop is for columns
//comparing elements in two lists

package sravanthi;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			if(i%5==0) {
				continue;
			}else if(i%4==0 && i%8==0) {
				System.out.println("Sandy");
			}else if(i%4==0 && i%6==0) {
				System.out.println("Siri");
			}else if(i%6==0) {
				System.out.println("Aishu");
			}
		}
}}
package com.traning.arrays;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		
		
    int marks1[ ][ ]=new int[ ][ ]{{10,20,30},{60,70,80}};
		
		for (int i=0;i<marks1.length;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(marks1[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
		// TODO Auto-generated method stub
		
		
		  Scanner sc = new Scanner(System.in); System.out.println("Populating");
		  
		  int marks[][] = new int[3][2];
		  
		  for (int i=0;i<marks.length;i++) { for (int j=0;j<2;j++) {
		  marks[i][j]=sc.nextInt(); } }
		  
		  System.out.println("Iterating");
		 
		  for (int i=0;i<marks.length;i++) { for (int j=0;j<2;j++) {
		  
		  System.out.print(marks[i][j]+"\t"); } System.out.println(); }
		  
		  
		  for (int row[]:marks) { for (int value:row) { System.out.println(value); }
		  
		  }
		 
	}

}

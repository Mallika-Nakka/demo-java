package com.traning.arrays;

public class OneDimArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int [] marks=new int[4]; marks[0]=90; marks[1]=80; marks[2]=40; marks[3]=20;
		  int sum=0;
		 
		  for (int i=0;i<marks.length;i++) { //System.out.println(marks[i]);
		  sum+=marks[i]; }
		  
		  System.out.println(sum);
		  
		  for (int number:marks) { System.out.println(number);
		  System.out.println("HI"); }
		 
		
		

	}

}

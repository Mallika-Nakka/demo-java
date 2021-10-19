package com.training.demos;

public class TermDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int k=(a>1)?90:a+1;
		System.out.println(k);
		
		int x=100,y=70,z=40;
		
		String result=(x>y && x>z)?"x is greater" : (y>z) ?"y is greater":"z is greater";
		System.out.println(result);
		

	}

}

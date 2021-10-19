package com.training.demos;

public class TypeCastingDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20;
		//upcasting
		long a=x+y;
		System.out.println(a);
		
		int b= (int)a;
		System.out.println(b);
		float p=(float) 12.7;
		
		System.out.println("Sum "+a+b+p);
		System.out.println("Sum "+(a+b+p));
		
		//Local variable should be initialized before using
		int w=20,z=90;
		System.out.println(w+z);
		
		

	}

}

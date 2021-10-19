package com.training.demos;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=378,y=20;
		
		switch (x+y) {
		case 30:
			System.out.println("Sum: "+(x+y));
			break;
		case 50:
			System.out.println("Sum: "+(x+y));
			break;
		case 90:
			System.out.println("Sum: "+(x+y));	
			break;
		default:
			System.out.println("No Match");
			
			
		}
		
		String day="onday";
		switch (day) {
		case ("Monday"):
			//System.out.println("Monday");
		case ("Tuesday"):
			//System.out.println("Tuesday");
		case ("Wednesday"):
			//System.out.println("Wednesday");
		case ("Thursday"):
			//System.out.println("Thursday");
		case ("Friday"):
			//System.out.println("Friday");
			System.out.println("Working day");
		    break;
		case ("Saturday"):
			//System.out.println("Saturday");
		case ("Sunday"):
			//System.out.println("Sunday");
			System.out.println("Holyday");
		default:
			System.out.println("Not a day");
		}
		

	}

}

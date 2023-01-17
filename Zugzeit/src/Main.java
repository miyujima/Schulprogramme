

import java.util.Scanner;

public class Main {
	
	private static Train zug = new Train();
	
	private static Scanner sc = new Scanner(System.in);
	

	
	public static void main(String[] args) {
		
		System.out.println("Select your destination");
		System.out.println("Ham = Hamburg");
		System.out.println("Han = Hannover");
		System.out.println("B = Braunschweig");
		System.out.println("W = Wolfsburg");
		String s = sc.next();

		switch (s) {
		case "Ham":
			
			System.out.print("Halt in Spandau?");
			if (confirm()) {
				zug.addFahrzeitMax(10);
			}
			zug.addFahrzeitMax(96);
			
			System.out.println("Sie erreichen Hamburg nach: " +zug.getFahrzeitMax()+" Minuten");
			
			break;

		case "Han":
			
			zug.addFahrzeitMax(10);
			System.out.println("Soll Stendal unfahren werden?");
			if (confirm()) {
				zug.addFahrzeitMax(6);
			}
			else {
				zug.addFahrzeitMax(16);
			}
			zug.addFahrzeitMax(62);
			
			System.out.println("Sie erreichen Hannover nach: " +zug.getFahrzeitMax()+" Minuten");
			
			break;
			
		case "B":
			
			zug.addFahrzeitMax(10);
			System.out.println("Soll Stendal unfahren werden?");
			if (confirm()) {
				zug.addFahrzeitMax(6);
			}
			else {
				zug.addFahrzeitMax(16);
			}
			zug.addFahrzeitMax(50);
			
			System.out.println("Sie erreichen Braunschweig nach: " +zug.getFahrzeitMax()+" Minuten");
			
			break;
			
		case "W":
			
			zug.addFahrzeitMax(10);
			System.out.println("Soll Stendal unfahren werden?");
			if (confirm()) {
				zug.addFahrzeitMax(6);
			}
			else {
				zug.addFahrzeitMax(16);
			}
			zug.addFahrzeitMax(29);
			
			System.out.println("Sie erreichen Wolfsburg nach: " +zug.getFahrzeitMax()+" Minuten");
			
			break;
		default:
			System.out.println("Unexpected value: " + s);
			break;
		}
		
		
	}
	
	public static boolean confirm() {
		System.out.println("Input Y/y for yes and N/n for no");
		String s = sc.next();
		
		while(true) {
			if (s.equalsIgnoreCase("Y")) {
				return true;
			}
			if (s.equalsIgnoreCase("N")) {
				return false;
			} else {
				break;
			}
		}
		return false;
	}
	
}
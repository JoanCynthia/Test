package com.redeem;
import java.util.Scanner; 
public class Hungry {

	public static void main(String[] args) {
		System.out.println("Are you hungry?");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		if(input.equals("yes"))
		{
			System.out.println("Eat samosa");
			System.out.println("Eat pizza");
			System.out.println("Eat burger");
		}
		else
		{
			System.out.println("Do your work");
		}

	}

}

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
			System.out.println("Eat fries");
			System.out.println("Eat chips");
			System.out.println("Eat more chips");
		}
		else
		{
			System.out.println("Are you thirsty?");
			Scanner s1 = new Scanner(System.in);
			String input1 = s1.nextLine();
			if(input1.equals("yes"))
			{
				System.out.println("Drink water");
				System.out.println("Drink soda");
				System.out.println("Drink more water");
			}
		}

	}

}

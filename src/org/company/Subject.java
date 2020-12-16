package org.company;
import java.util.Scanner;
public class Subject {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the mail ID");
		String s5 = s.nextLine();
		boolean d = s5.contains("@");
		if(d==true)
		{
			System.out.println("Valid Email ID");
		}
			
		else
		{
			System.out.println("Email is not valid");
		}

}

}




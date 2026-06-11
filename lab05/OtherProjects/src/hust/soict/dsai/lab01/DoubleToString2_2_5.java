package hust.soict.dsai.lab01;

import java.util.Scanner;
public class DoubleToString2_2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num1: ");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.print("enter num2: ");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.println("sum is: " + (num1+num2));
		System.out.println("diff is: " + (num1-num2));
		System.out.println("prod is: " + (num1*num2));
		if (num2 == 0) {
			System.out.println("quot is error (num2=0)");
		}
		else {
			System.out.println("quot is: " + (num1/num2));
		}
	}
}
package hust.soict.dsai.lab01;
import java.util.Scanner;
public class DayofMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = -1;
		int year = -1;
		while(month == -1){
			System.out.print("enter month: ");
			String iMonth = sc.nextLine();
			month = getmonth(iMonth);
			if(month == -1){
				System.out.println("error! enter again");
			}
		}
		while(true){
			System.out.print("enter year: ");
			year = sc.nextInt();
			if(year >= 1000 && year <= 9999){
				break;
			}
			else{
				System.out.println("error! enter again: ");
			}
		}
		int day = getday(month, year);
		System.out.println("number of days: "+day);
	}
	public static int getmonth(String input){
		String s = input.toLowerCase();
		if (s.equals("1") || s.equals("january") || s.equals("jan.") || s.equals("jan")) return 1;
        if (s.equals("2") || s.equals("february") || s.equals("feb.") || s.equals("feb")) return 2;
        if (s.equals("3") || s.equals("march") || s.equals("mar.") || s.equals("mar")) return 3;
        if (s.equals("4") || s.equals("april") || s.equals("apr.") || s.equals("apr")) return 4;
        if (s.equals("5") || s.equals("may")) return 5;
        if (s.equals("6") || s.equals("june") || s.equals("jun")) return 6;
        if (s.equals("7") || s.equals("july") || s.equals("jul")) return 7;
        if (s.equals("8") || s.equals("august") || s.equals("aug.") || s.equals("aug")) return 8;
        if (s.equals("9") || s.equals("september") || s.equals("sept.") || s.equals("sep")) return 9;
        if (s.equals("10") || s.equals("october") || s.equals("oct.") || s.equals("oct")) return 10;
        if (s.equals("11") || s.equals("november") || s.equals("nov.") || s.equals("nov")) return 11;
        if (s.equals("12") || s.equals("december") || s.equals("dec.") || s.equals("dec")) return 12;
		return -1;
	}
	public static boolean check(int year){
		return (year % 4 == 0 && year % 100 != 0)||(year % 400 ==0);
	}
	public static int getday(int month, int year){
		switch (month) {
			case 4: case 6: case 9: case 11:
				return 30; 
			case 2:
				if(check(year)) return 29;
				else return 28;
			default:
				return 31;
		}
	}
}

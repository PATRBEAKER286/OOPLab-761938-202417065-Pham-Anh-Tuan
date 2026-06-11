package hust.soict.dsai.lab01;

import java.util.Arrays;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] default_arr = {1789, 2035, 1899, 1456, 2013};
		int[] my_arr;
		System.out.print("0: select default array or 1: select optional array: ");
		int choose = sc.nextInt();
		if(choose == 0){
			my_arr = default_arr;
		}
		else{
			System.out.print("enter n: ");
			int n  = sc.nextInt();
			my_arr = new int[n];
			for(int i = 0;i < n;i++){
				my_arr[i] = sc.nextInt();
			}
		}
		System.out.println("display array:" + Arrays.toString(my_arr));
		Arrays.sort(my_arr);
		System.out.println("sort array: " + Arrays.toString(my_arr));
		long sum = 0;
		for(int i = 0;i < my_arr.length; i++){
			sum+=my_arr[i];
		}
		System.out.println("sum of array:" + sum);
		double avg = (double)sum / my_arr.length;
		System.out.println("avg of array:" + avg);
	}
}

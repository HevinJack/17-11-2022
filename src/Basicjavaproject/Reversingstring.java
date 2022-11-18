package Basicjavaproject;

import java.util.Scanner;

public class Reversingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner (System.in);
		System.out.println("enter a string");
		
		String a=s.nextLine();
		
		char[] arr=a.toCharArray();
		
		String rev="";
		System.out.println(a);
		
		for (int i= arr.length-1;i>=0;i--) {
			
			rev+=arr[i];
				
		}
		System.out.println(rev);
	}
}

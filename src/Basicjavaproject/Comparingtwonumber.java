package Basicjavaproject;

import java.util.Scanner;

public class Comparingtwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		
		int a=s.nextInt();
		System.out.println("enter second number");
		int b=s.nextInt();
		
		if(a==b){
			System.out.println(a+"is equal to"+b);
		}
		else if (a>b) {
			System.out.println(a+"is greater than"+b);
			
		}
		else {
			System.out.println(a+"smaller than"+b);
		}
		

	}

}

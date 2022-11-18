package Basicjavaproject;

import java.util.Scanner;

public class Areaofpolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the sides of polygon");
		
		int n=s.nextInt();
		
		System.out.println("enter the length of the polygon");
		
		double a=s.nextDouble();
		
		double area=((n*a*a)/(4*Math.tan(Math.PI/n)));
		
		System.out.println(area);
		
		

	}

}

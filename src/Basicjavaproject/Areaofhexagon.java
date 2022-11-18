package Basicjavaproject;

import java.util.Scanner;

public class Areaofhexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner  (System.in);
		
		System.out.println("enter a length of the side of hexagon");
		
		double a=s.nextDouble();
		
		double area=((6*(a*a))/(4*Math.tan(Math.PI/6)));
		
		System.out.println(area);
		
	}

}

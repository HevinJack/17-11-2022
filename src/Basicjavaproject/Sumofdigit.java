package Basicjavaproject;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int sum=0;
		
		while(a>0) {
			sum+=(a%10);
			a/=10;
			
			 
		}
		System.out.println(sum);
		

	}

}

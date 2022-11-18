package Basicjavaproject;

public class Countingstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a=" aimnsdldk  auhu1877834  2h90*&&^&*^";
		char[] ar=a.toCharArray();
		
		int number=0;
		int words=0;
		int space=0;
		int others=0;
		
		for(int i=0;i<a.length();i++) {
			if(Character.isDigit(ar[i])){
				number++;
				
				
			}
			else if(Character.isAlphabetic(ar[i])) {
				
				words++;
			}
			else if(Character.isSpace(ar[i])) {
				
				space++;
			}
			else {
				
				others++;
			}
			
		}
		System.out.println(words);
		System.out.println(number);
		System.out.println(space);
		System.out.println(others);
	}

}

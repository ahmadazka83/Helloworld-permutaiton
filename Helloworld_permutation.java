package projek;
import java.util.Scanner;

public class Helloworld_permutation {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		char alphabet[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int i=0;
		String alphabetTemp="";
		boolean cekString=false;
		System.out.println("input a word : ");
		String input = s.next().toLowerCase();
		
		//make sure if input is only contains String or char and length less than 10
		if(input.length()>10) {	
			System.out.println("length must be less than 10");
		}
		
		for(i=0; i<input.length(); i++) {
			char c = input.charAt(i);
				if(Character.isDigit(c) || !Character.isLetter(c)) {
					cekString=true;
				}
		}
		
		//sorting process
		if(!cekString) {
			for(i=0; i<input.length(); i++) {
			for(int j=0; j<alphabet.length; j++) {
				System.out.println(alphabetTemp+alphabet[j]);
					if(alphabet[j]==input.charAt(i)) {
						alphabetTemp+=alphabet[j];
					break;
					}	
			}
			}	
		}
		else {
			System.out.println("input is only allowed in alphabetic form");
		}
	}
}
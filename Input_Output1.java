package Soal1_Input_Output;

import java.util.Scanner;

public class Input_Output1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert Your Sentence: ");
		String s = scan.nextLine();
		
		String terms[] = s.split("\\s+|\\!|\\,|\\?|\\.|\\_|\\'|\\@");
		
		System.out.println(terms.length);
		
		for(int i = 0; i < terms.length; i++) {
			System.out.println(terms[i]);
		}
		
		scan.close();
	}

}

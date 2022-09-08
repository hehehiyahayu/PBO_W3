package Soal2_Input_Output_2;

import java.util.Scanner;

public class Input_Output2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder first_data;
		StringBuilder temp_second_data;
		
		System.out.println("===========================================");
		
		for(int i = 0; i < 3; i++) {
			System.out.println();
			System.out.println("Insert your data: ");
			String first_column = scan.next();
			
			if(first_column.length() <= 10) {
				first_data = new StringBuilder(first_column);
				first_data.setLength(10);
			}else {
				first_data = new StringBuilder(first_column.substring(0, 10));
			}
			
			int second_column = scan.nextInt();
			
			if(second_column > 999) {
				String temp_number = Integer.toString(second_column); 
				temp_second_data = new StringBuilder(temp_number.substring(0, 3));
				int second_data = Integer.parseInt(temp_second_data.toString());
				
				System.out.printf("%s		%03d\n", first_data, second_data);
			}else {
				System.out.printf("%s		%03d\n", first_data, second_column);
			}
		}
		System.out.println();
		System.out.println("===========================================");
		
		scan.close();
	}

}

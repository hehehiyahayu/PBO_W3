package Soal3_Berhitung;

import java.util.Scanner;

public class Berhitung {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("");
		String hitung = scan.nextLine();
		
		String terms[] = hitung.split("\\s+");
		
		int A = Integer.parseInt(terms[0]);
		int B = Integer.parseInt(terms[2]);
		int total;
		
		if(A >= 1 && B <= 1000) {
			if(terms[1].equals("+")) {
				total = A + B;
				System.out.println("Hasil Perhitungan " + A + " " + terms[1] + " " + B + " = " + total);
			}else if(terms[1].equals("-")) {
				total = A - B;
				System.out.println("Hasil Perhitungan " + A + " " + terms[1] + " " + B + " = " + total);
			}else if(terms[1].equals("*")) {
				total = A * B;
				System.out.println("Hasil Perhitungan " + A + " " + terms[1] + " " + B + " = " + total);
			}else if(terms[1].equals("/")) {
				if(A % B == 0) {
					total = A / B;
					System.out.println("Hasil Perhitungan " + A + " " + terms[1] + " " + B + " = " + total);
				}else {
					System.out.print("Perhitungan tidak dapat diselesaikan karena A tidak habis dibagi B");
				}
			}else if(terms[1].equals("%")) {
				total = A % B;
				System.out.println("Hasil Perhitungan " + A + " " + terms[1] + " " + B + " = " + total);
			}else {
				System.out.println("Tidak ada operator yang dituju");
			}
		}		
		scan.close();
	}

}

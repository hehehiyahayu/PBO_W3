package Soal4_GajiAgent;

import java.util.Scanner;

public class Gaji_Agent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalGaji;
		int gajiPokok = 500000;
		int bonusPenjualanItem = (50000 * 10/100);
		
		System.out.println("Hasil Penjualan: ");
		int hasilPenjualan = scan.nextInt();
		
		if(hasilPenjualan > 80) {
			totalGaji = gajiPokok + ((50000 * 35/ 100) * hasilPenjualan) + (bonusPenjualanItem * hasilPenjualan);
		}else if(hasilPenjualan >= 40 && hasilPenjualan < 80) {
			totalGaji = gajiPokok + ((50000 * 25/ 100) * hasilPenjualan) + (bonusPenjualanItem * hasilPenjualan);
		}else if(hasilPenjualan < 15){
			totalGaji = gajiPokok - ((50000 * 15/ 100) * (15 - hasilPenjualan));
		}else {
			totalGaji = gajiPokok + (bonusPenjualanItem * hasilPenjualan);
		}
		
		System.out.printf("Total gaji yang di dapat agent yaitu = Rp.%d,00", totalGaji);
		
		scan.close();
	}

}

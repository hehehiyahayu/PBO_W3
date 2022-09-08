package Soal5_Buka_Tutup_Jalan;

import java.util.Scanner;

public class Buka_Tutup_Jalan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] plat_nomor = new String[4];
		StringBuilder temp_nomor;
		String nomor;
		String refinedNomor;
		String refinedNomorMobil;
		
		System.out.println("Masukkan plat nomor mobil: ");
		for(int i = 0; i < 4; i++) {
			nomor = scan.nextLine();
			
			refinedNomor = nomor.replaceAll("[^0-9]", "");
			
			if(refinedNomor.length() < 4) {
				refinedNomorMobil = refinedNomor.toString();
				plat_nomor[i] = refinedNomorMobil;
			}else {
				temp_nomor = new StringBuilder(refinedNomor.substring(0, 4));
				refinedNomorMobil = temp_nomor.toString();
				plat_nomor[i] = refinedNomorMobil;
			}
			
		}
		
		String data_plat_nomor = plat_nomor[0] + plat_nomor[1] + plat_nomor[2] + plat_nomor[3];
		
//		System.out.println(data_plat_nomor);
		
		Long total_plat_nomor =  Long.parseLong(data_plat_nomor);
		
		Long Status = (total_plat_nomor - 999999) % 5;
		
		if(Status == 0) {
			System.out.println();
			System.out.println("Berhenti");
		}else {
			System.out.println();
			System.out.println("Jalan");
		}
		
		scan.close();
	}

}

package Soal6_BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger limit = new BigInteger("200");
		
		System.out.println("Input The First Number(a): ");
		BigInteger a = scan.nextBigInteger();
		
		int comparisonA = a.compareTo(limit);
		int negativityA = a.signum();
		if(comparisonA == 1 || negativityA == -1) {
			System.out.println();
			System.out.println("First Number value is too big or negative for the process! ");
		}else {
			System.out.println("Input The Second Number(b): ");
			BigInteger b = scan.nextBigInteger();
			
			int comparisonB = b.compareTo(limit);
			int negativityB = b.signum();
			if(comparisonB == 1 || negativityB == -1) {
				System.out.println();
				System.out.println("Second Number value is too big or negative for the process! ");
			}else {
				System.out.println();
				BigInteger plusProcess = a.add(b);
				System.out.printf("a + b = %d", plusProcess);
				BigInteger multiplyProcess = a.multiply(b);
				System.out.println();
				System.out.printf("a x b = %d", multiplyProcess);
				scan.close();
			}
		}
	}

}

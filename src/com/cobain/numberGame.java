package com.cobain;

import java.util.Scanner;
import java.util.Random;

public class numberGame {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		Random angkaRandom = new Random();
		
		int n = angkaRandom.nextInt(100);
		int input;
		int jumlahTebak = 0; 
		while (true) {
			  jumlahTebak++;
			  System.out.print("Tebakan ke " + jumlahTebak + " : ");
			  input = scan.nextInt();
			  	if (input == n) {
			  		System.out.println("SELAMAT, ANDA MENANG");
			  		System.out.println("Jumlah percobaan : " + jumlahTebak);
			  		break;
			  	} else if (input > n ) {
			  		System.out.println(" COBA LEBIH KECIL");
			  	} else {
			  		System.out.println(" COBA LEBIH BESAR");
			  	}
		 }
		
	}

}

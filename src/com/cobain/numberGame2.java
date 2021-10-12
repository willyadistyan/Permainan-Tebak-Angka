package com.cobain;

import java.util.Random;
import java.util.Scanner;

public class numberGame2 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		Random angkaRandom = new Random();
		
		System.out.println("PERMAINAN TEBAK ANGKA ");
		System.out.println("Cara bermain : ketik angka dalam rentang tertentu untuk menebak angka\n");
		System.out.println("Pilih Mode : ");
		System.out.println("1. Sangat Mudah");
		System.out.println("2. Mudah");
		System.out.println("3. Normal");
		System.out.println("4. Sulit");
		System.out.println("5. Sangat Sulit");
		System.out.print("Masukkan nomor mode : ");
		int opsi = scan.nextInt();
		
		int input,n;
		int jumlahTebak = 0; 

		switch (opsi) {
			case 1 : 
				System.out.println("\nMODE : Sangat Mudah (0-10)");
				n = angkaRandom.nextInt(11);
				while (true) {
					  jumlahTebak++;
					  System.out.print("Tebakan ke " + jumlahTebak + " : ");
					  input = scan.nextInt();
					  	if (input == n) {
					  		System.out.println("\nSELAMAT, ANDA MENANG");
					  		System.out.println("Jumlah percobaan : " + jumlahTebak);
					  		break;
					  	} else if (input > n ) {
					  		System.out.println("COBA LEBIH KECIL");
					  	} else {
					  		System.out.println("COBA LEBIH BESAR");
					  	}
				 }
				break;
				
			case 2 : 
				System.out.println("\nMODE : Mudah (0-100)");
				n = angkaRandom.nextInt(101);
				while (true) {
					  jumlahTebak++;
					  System.out.print("Tebakan ke " + jumlahTebak + " : ");
					  input = scan.nextInt();
					  	if (input == n) {
					  		System.out.println("\nSELAMAT, ANDA MENANG");
					  		System.out.println("Jumlah percobaan : " + jumlahTebak);
					  		break;
					  	} else if (input > n ) {
					  		System.out.println("COBA LEBIH KECIL");
					  	} else {
					  		System.out.println("COBA LEBIH BESAR");
					  	}
				 }
				break;
			case 3 : 
				System.out.println("\nMODE : Normal (0-1000)");
				n = angkaRandom.nextInt(1001);
				while (true) {
					  jumlahTebak++;
					  System.out.print("Tebakan ke " + jumlahTebak + " : ");
					  input = scan.nextInt();
					  	if (input == n) {
					  		System.out.println("\nSELAMAT, ANDA MENANG");
					  		System.out.println("Jumlah percobaan : " + jumlahTebak);
					  		break;
					  	} else if (input > n ) {
					  		System.out.println("COBA LEBIH KECIL");
					  	} else {
					  		System.out.println("COBA LEBIH BESAR");
					  	}
				 }
				break;
				
			case 4 : 
				System.out.println("\nMODE : Sulit (0-10000)");
				n = angkaRandom.nextInt(10001);
				while (true) {
					  jumlahTebak++;
					  System.out.print("Tebakan ke " + jumlahTebak + " : ");
					  input = scan.nextInt();
					  	if (input == n) {
					  		System.out.println("\nSELAMAT, ANDA MENANG");
					  		System.out.println("Jumlah percobaan : " + jumlahTebak);
					  		break;
					  	} else if (input > n ) {
					  		System.out.println("COBA LEBIH KECIL");
					  	} else {
					  		System.out.println("COBA LEBIH BESAR");
					  	}
				 }
				break;
			case 5 : 
				System.out.println("\nMODE : Sangat Sulit (0-100000)");
				n = angkaRandom.nextInt(100001);
				while (true) {
					  jumlahTebak++;
					  System.out.print("Tebakan ke " + jumlahTebak + " : ");
					  input = scan.nextInt();
					  	if (input == n) {
					  		System.out.println("\nSELAMAT, ANDA MENANG");
					  		System.out.println("Jumlah percobaan : " + jumlahTebak);
					  		break;
					  	} else if (input > n ) {
					  		System.out.println("COBA LEBIH KECIL");
					  	} else {
					  		System.out.println("COBA LEBIH BESAR");
					  	}
				 }
				break;
				
				default :
					System.out.println("MASUKKAN NOMOR MODE DENGAN BENAR!");
					System.out.println("Silahkan mulai ulang program.");
		}
		
	}

} //follow instagram : @willyadistyan

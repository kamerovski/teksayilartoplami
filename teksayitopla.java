package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class teksayitopla {

	public static void main(String[] args) {
		int a;
		int total =0;  // veri girilecegi icin 0 a esitledik
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("bir sayi giriniz: ");
			a = scan.nextInt();
			
			if(a%2==0 && a%4==0) {
				total += a;
			}
		}while(a%2==0);
		
		System.out.println("toplam = " + total);
		

	}

}

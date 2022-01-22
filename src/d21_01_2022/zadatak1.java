package d21_01_2022;

import java.util.ArrayList;

public class zadatak1 {
	/*Zadatak  
	Kreirati klasu Sektor koja ima:
	 naziv sektora
	 platu koja je za taj sektor

	Kreirati abstraktnu klasu Radnik koja ima:
	 ime i prezime
	 niz sektora u kojima radi
	 abstraktnu metodu koja vraca platu radnika
	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
	 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
	 suma plata svih sektor / broj sektora * 0.5
	 override uje metodu za platu, tako da se plata racuna po formuli:
	(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog
*/
	//	NISAM SIGURAN DA SAM LEPO SKONTAO OVO OKO PLATA
	
	public static void main(String[] args) {
		ArrayList<Sektor> sektori=new ArrayList <Sektor>();
		Sektor s1=new Sektor("maloprodaja", 35000);
	//	sektori.add(s1);
		Sektor s2=new Sektor("finansije", 75000);
	//	sektori.add(s2);
		Radnik r1=new Menadzer("Zika Zikic", sektori);
		
		Radnik r2= new Magacioner("Pera Peric", sektori);
		ArrayList<Radnik>radnici=new ArrayList<Radnik>();
	
		r1.zaposliUSektor(s2);
		r2.zaposliUSektor(s1);
	
		
		radnici.add(r1);
		radnici.add(r2);
		double plata= r1.plata();
		System.out.println(plata);
		for(int i =0;i<radnici.size();i++) {
			System.out.println(radnici.get(i).getImeIPrezime() +" " + radnici.get(i).plata());
		}
	
	}

}

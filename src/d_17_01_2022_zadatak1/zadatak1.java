package d_17_01_2022_zadatak1;

import java.util.ArrayList;

public class zadatak1 {

	public static void main(String[] args) {
	/*	Zadatak
		Kreirati klasu ZeleniKarton koja ima:
		ime i prezime studenta 
		broj indeksa 
		naziv predmeta
		ime i prezime profesora
		ocenu - od 5 do 10
		gettere i settere
		konstruktore
		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
		metodu stampaj koja stampa podatke u formatu:
				(naziv predmeta) - (ocena)
				Student: ime i prezime, broj indeksa
				Profesor: ime i prezime

			U glavnoj klasi:
		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
		(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
*/
		ArrayList<ZeleniKarton> spisakIspita= new ArrayList<ZeleniKarton>();
		ZeleniKarton uvodIst=new ZeleniKarton("Mika Mikic",  "is31312", "Uvod", "Pera Peric", 6);
		spisakIspita.add(uvodIst);
		ZeleniKarton ist1=new ZeleniKarton("Mika Mikic",  "is31312", "ist1", "Pera Mitic", 8);
		spisakIspita.add(ist1);
		ZeleniKarton ist2=new ZeleniKarton("Mika Mikic",  "is31312", "ist2", "Zika Peric", 9);
		spisakIspita.add(ist2);
		ZeleniKarton ist3=new ZeleniKarton("Mika Mikic",  "is31312", "ist3", "Srecko Vasic", 7);
		spisakIspita.add(ist3);
		ZeleniKarton ist4=new ZeleniKarton("Mika Mikic",  "is31312", "ist4", "Mirko Palibrk", 6);
		spisakIspita.add(ist4);
		ZeleniKarton ist5=new ZeleniKarton("Mika Mikic",  "is31312", "ist5", "Stevica Matic", 5);
		spisakIspita.add(ist5);
		ZeleniKarton ist6=new ZeleniKarton("Mika Mikic",  "is31312", "ist6", "Borisa Simanic", 6);
		spisakIspita.add(ist6);
		ZeleniKarton ist7=new ZeleniKarton("Mika Mikic",  "is31312", "ist7", "Pera Peric", 6);
		spisakIspita.add(ist7);
		ZeleniKarton ist8=new ZeleniKarton("Mika Mikic",  "is31312", "ist8", "Pera Peric", 6);
		spisakIspita.add(ist8);
		ZeleniKarton ist10=new ZeleniKarton("Mika Mikic",  "is31312", "ist10", "Pera Peric", 6);
		spisakIspita.add(ist10);
		ZeleniKarton ist9=new ZeleniKarton("Mika Mikic",  "is31312", "ist9", "Pera Peric", 6);
		spisakIspita.add(ist9);
		
		for (int i =0; i<spisakIspita.size();i++) {
			spisakIspita.get(i).print();
		}
		
	/*	for (int i =0; i<spisakIspita.size();i++) {
			double prosecnaOcena=0;
			spisakIspita.get(i).getOcena();
			prosecnaOcena=spisakIspita.get(i).prosecnaOcena()+ prosecnaOcena;
			System.out.println("Prosecna ocena je: " + spisakIspita.get(i).prosecnaOcena());
		}*/
		
	}

}

package d_18_01_2022;

import java.util.ArrayList;

public class zadatak1 {

	public static void main(String[] args) {
	/*	Napisati klasu Student koja ima
		broj indeksa
		ime i prezime
		tip studija (osnovne, master, doktorske)
		niz ispita
		konstuktore koje mislite da ce vam trebati
		gettere i settere za indeks, ime i prezime, tip studija
		getter za niz predmeta
		metodu dodaj ispit u niz ispita
		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
		metodu stampaj koja stampa u formatu:
		(broj indeksa) - (ime i prezime) - (tip studija)
		Predmeti:
		(naziv predmeta) - (profesor) - (ocena)
		(naziv predmeta) - (profesor) - (ocena)
		(naziv predmeta) - (profesor) - (ocena)
		Prosecna ocena: (prosecna ocena)


		Napisati klasu Ispit koja ima
		naziv predmeta
		ocenu (u rasponu od 5 do 10)
		Ime i prezime profesora koji predaje predmet
		konstuktore koje mislite da ce vam trebati
		gettere i settere za sve atribute
		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
		metodu koja stampa ispit u formatu:
		(naziv predmeta) - (profesor) - (ocena)

*/
		ArrayList<Ispiti>ispiti=new ArrayList<Ispiti>();
		Ispiti ist1=new Ispiti("ist1", 8, "Mika");
		ispiti.add(ist1);
		Ispiti ist2=new Ispiti("ist2", 9, "Mika");
		ispiti.add(ist2);
		Ispiti ist3=new Ispiti("ist3", 10, "Mika");
		ispiti.add(ist3);
		Ispiti ist4=new Ispiti("ist4", 5, "Mika");
		ispiti.add(ist4);
		Ispiti ist5=new Ispiti("ist5", 5, "Mika");
		ispiti.add(ist5);
		
		
		Student pera=new Student("Pera Peric", "da414", "master", ispiti);
		pera.print();
	}

}

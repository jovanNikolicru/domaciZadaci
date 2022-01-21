package d_20_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		/*
		 * Kreirati klasu Osoba koja ima: ime i prezime jmbg godinu rodjenja default-ni
		 * konstuktor konstuktor sa parametrima gettere i settere metodu stampaj koja
		 * stampa u formatu: (ime i prezime), (jmbg), (godina rodjenja)
		 * 
		 * Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima: broj (broj koji
		 * igrac nosi) poziciju koju igra (odbrambeni, napadac, … ) kapiten (promenljiva
		 * koja kaze da li je igrac kapiten tima, i tipa je boolean) default-ni
		 * konstuktor konstuktor sa parametrima gettere i settere za broj, kapiten i
		 * poziciju metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve
		 * informacije o igracu
		 * 
		 * Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima: godine iskustva
		 * tip trenera (kondicioni, za igru, pomocni, personalni) metodu stampaj, koju
		 * prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
		 * 
		 * U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
		 * 
		 * 
		 * (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju
		 * programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi
		 * korisnik sa tastature.
		 * 
		
		 */
		/*
		 * Igrac i1= new Igrac("Mika Mikic", "4213494112339", 1990, 9, "napadac",
		 * false); Igrac i2 = new Igrac("Pera Peric", "412412412412", 1989, 10, "vezni",
		 * true); Trener t1= new Trener("Zika ZIkic", "1434214141541", 1961, 30,
		 * "kondicioni"); Trener t2=new Trener("Mile MIlic", "4432421441", 1953,55,
		 * "glavni"); i1.print(); i2.print(); t1.print(); t2.print();
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj igraca koji zelite u nizu");

		int n = s.nextInt();
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		for (int i = 0; i < n; i++) {

			System.out.println("Dodaj Igraca");
			System.out
					.println("Ime i prezime, jmbg, godinu rodjenja, broj dresa, poziciju, da li je kapiten true/false");
			Igrac i1 = new Igrac(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next(), s.nextBoolean());
			igraci.add(i1);
		}
		System.out.println("Zavrsen je unos igraca");
		System.out.println();

		System.out.println("Unesite broj trenera koji zelite u nizu");
		int n1 = s.nextInt();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		for (int i = 0; i < n1; i++) {

			System.out.println("Dodaj trenera");
			System.out.println("Ime i prezime, jmbg, godinu rodjenja, godine iskustva, tip trenera");
			Trener t1 = new Trener(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next());
			treneri.add(t1);
		}
		System.out.println("Zavrsen je unos trenera");
		System.out.println();
		for (int i = 0; i < igraci.size(); i++) {
			System.out.println("Igrac:");
			igraci.get(i).print();
		}
		for (int i = 0; i < treneri.size(); i++) {
			System.out.println("Trener:");
			treneri.get(i).print();
		}
	}
}

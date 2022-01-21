package d_20_01_2022_zadatak2;

public class zadatak2 {

	public static void main(String[] args) {
	/*	2. Zadatak
		Kreirati klasu Karton koja ima:
		tip kartona (crveni, zuti)
		konstuktore za koje mislite da ce vam trebati
		gettere i settere za karton
			
		Kreirati klasu Osoba koja ima:
		ime i prezime
		jmbg
		godinu rodjenja
		default-ni konstuktor
		konstuktor sa parametrima
		gettere i settere 
		metodu stampaj koja stampa u formatu:
		(ime i prezime), (jmbg), (godina rodjenja)

		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
		broj (broj koji igrac nosi)
		poziciju koju igra (odbrambeni, napadac, … )
		niz kartona
		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
		default-ni konstuktor
		konstuktor sa parametrima
		gettere i settere za broj, kapiten i poziciju
		metodu dodaj karton, gde se dodaje karton u niz
		metodu koja vraca broj zutih kartona
		metodu koja vraca broj crvenih kartona
		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu


		U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
*/
		Igrac i1=new Igrac("Zivorad Zivkovic", "321312131233", 1990, 10, "napad",  false);
		i1.dodajKarton("crveni");
		i1.dodajKarton("zuti");
		i1.dodajKarton("zuti");
		
		i1.print();
		System.out.println("Zutih kartona:" + i1.brZutih() );
		System.out.println("Crvenih kartona: " + i1.brCrvenih());
	}

}

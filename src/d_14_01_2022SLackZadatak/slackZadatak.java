package d_14_01_2022SLackZadatak;



public class slackZadatak {

	public static void main(String[] args) {
		/*		Kreirati klasu Osoba koja ima:
		Ime i prezime
		godinu rodjenja
		pol
		oca- koji je takodje Osoba
		majku - takodje je Osoba
		Gettere i settere
		difoltni konstruktor
		konstruktor koji postavlja ime i prezime i godinu rodjenja i pol
		metodu za stampu koja stampa ovako:
		Ime i prezime, godina rodjenja [pol]
		(ako je cale setovan)
		OTAC: 
		Stampamo caleta preko njegove metode za stampu
		(Ako je majka setovana)
		MAJKA:
		Stampamo majku preko njene metode za stampu
		U glavom programu kreirajte svoje porodicno stablo bar do babe i dede :grin:
		
			Da vas odmah usmerim, IMAMO SAAAAAMO JEDNU KLASU OSOBA  i imamo main program nista vise od klasa vam ne treba!  (edited) 

*Nisma siguran da li sam lepo razumeo ovo
*
*
*/
	Osoba jovan =new Osoba("Jovan Nikolic", 1990, "m");
	Osoba majka=new Osoba("Slavica Nikolic", 1962, "z");
	Osoba otac=new Osoba("Lazar Nikolic", 1966, "m");

	Osoba njegovOtac= new Osoba("Jovan Nikolic", 1936, "m");
	
	Osoba njegovaMajka=new Osoba("Danica Nikolic", 1933, "z");

	Osoba njenOtac=new Osoba("Sava Veselinovic", 1928, "m");

	Osoba njenaMajka=new Osoba("Olga Veselinovic", 1931, "z");

	
	jovan.setOtac(otac);
	jovan.setMajka(majka);
	jovan.print();
	jovan.printO();
	jovan.printM();
	System.out.println();
	otac.print();
	otac.setMajka(njegovaMajka);
	otac.setOtac(njegovOtac);
	otac.printO();
	otac.printM();
	System.out.println();
	majka.print();
	majka.setMajka(njenaMajka);
	majka.setOtac(njenOtac);
	majka.printO();
	majka.printM();
}

}

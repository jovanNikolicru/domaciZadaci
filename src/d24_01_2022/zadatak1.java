package d24_01_2022;

public class zadatak1 {

	public static void main(String[] args) {
	/*	Kreirati abstraktnu klasu Ambalaza koja ima:
			barkod (primer: 328232-2823)
			naziv artikla
			neto tezinu
			bruto tezinu
			konstuktore (default-ni i sa parametrima)
			gettere i settere
			metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
			abstraktnu metodu koja vraca cenu artikla
			abstraktnu metodu stampaj

			Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
			atribut koji kaze da li se moze reciklirati
			osnovna cena
			gettere i setter za atribute
			konstuktori koji su vam potrebni
			racuna cenu tako da ispunjava uslova:
			ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
			ako nije u cenu ulazi samo osnovna cena
			metoda stampaj stampa sve podatke iz klase tetrapak.

			Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
			kaucija za flasu
			atribut koji kaze da li se za flasu placa kaucija
			osnovna cena
			gettere i setter za atribute
			konstuktori koji su vam potrebni
			racuna cenu
			ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
			ako se ne placa, (osnovna cena) * 1.2
			metoda stampaj stampa sve podatke iz klase staklena flasa.

			Kreirati klasu SuperKartica koja ima:
			broj kartice
			ime i prezime vlasnika
			popust (200, 500, … )
			konstuktore (default-ni i sa parametrima)
			gettere i settere 
			metodu stampaj koja stampa karticu u formatu:
			(broj kartice), (ime i prezime)






			Kreirati klasu Korpa koja ima:
			niz ambalaza
			metodu dodaj ambalazu
			metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
			privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
			metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.

			U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
*/
		Korpa k1= new Korpa();
		Ambalaza t1=new Tetrapak("12341234", "Sok", 1000, 1100, false, 50);
		Ambalaza t2=new Tetrapak("3213123123", "Mleko", 400, 450, true, 60);
		Ambalaza s1= new StaklenaAmbalaza("21312", "Pivo", 500, 700,60,false,100);
		Ambalaza s2= new StaklenaAmbalaza("2132", "Sok", 1000, 1200,60,true,100);
		Ambalaza s3= new StaklenaAmbalaza("63535635", "Kisela voda", 700, 900,60,false,100);
		SuperKartica sk1=new SuperKartica("312312312", "Mika Mikic", 200);
		k1.dodajAmbalazu(t1);
		k1.dodajAmbalazu(t2);
		k1.dodajAmbalazu(s1);
		k1.dodajAmbalazu(s2);
		k1.dodajAmbalazu(s3);
		
		k1.izbaciAmbalazu("12341234");
		System.out.println("U korpi su sledece ambalaze");
		for(int i =0;i<k1.getAmbalaze().size();i++) {
			System.out.println();
		k1.getAmbalaze().get(i).print();
		}
		System.out.println();
		System.out.println("Super kartica");
		sk1.print();
		double ukupnaCena=k1.cenaKorpe(sk1);
		System.out.println("Ukupna cena je " +ukupnaCena); 
		
		
		

	}

}

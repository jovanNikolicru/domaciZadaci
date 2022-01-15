package d_14_01_2022;

public class zadatak1 {

	public static void main(String[] args) {
/*		Kreirati klasu Autor koja ima
		-ime i prezime
		-konstuktore koje mislite da su vam potrebni
		-gettere i settere za atribute
		-metodu print koja stampa u formatu:
		(ime autora) (prezime autora)

		Kreirati klasu Knjiga koji ima:
		-ISBN
		-naziv
		-godina izdanja
		-autor
		-konstuktore koje mislite da su vam potrebni
		-gettere i settere za atribute
		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
		(ISBN)
		(naziv) - (godina izdanja)
		autor: (ime autora) (prezime autora) 

			U glavnom programu napraviti vise autora sa vise knjiga.
*/
		Autor asimov = new Autor("Isak", "Asimov");
		Knjiga zaduzbina = new Knjiga("123-54654INM-32", "Zaduzbina", 1951, asimov);
		zaduzbina.print();
		System.out.println();
		Autor jen = new Autor("Mo", "Jen");
		Knjiga smrt = new Knjiga("5465465kgh56", "Smrt na sandalovom kocu", 1999, jen);
		smrt.print();
		System.out.println();
		Autor uelbek= new Autor("Misel", "Uelbek");
		Knjiga cestice= new Knjiga("465465kjhjh", "Elementarne cestice", 2009, uelbek);
		cestice.print();
		
	}

}

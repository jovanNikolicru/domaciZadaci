package d_11_01_2022;

import d_11_01_2022.Proizvod;

public class zadatak1 {

	public static void main(String[] args) {
		
		Proizvod prvi= new Proizvod();
		prvi.naziv ="Televizor";
		prvi.cena=13999.99;
		prvi.tezina=2040;
		prvi.povecajCenu(2000);
		System.out.println("Cena sa popustom je " + prvi.cenaSaPopustom(10));
	System.out.println("Postarina za ovaj proizvod je " +prvi.postarina() );	
		prvi.stampaj();
		Proizvod drugi= new Proizvod();
		drugi.naziv ="Telefon";
		drugi.cena=19999.99;
		drugi.tezina=150;
		drugi.povecajCenu(-1000);
		System.out.println("Postarina za ovaj proizvod je " +drugi.postarina() );
		System.out.println("Cena sa popustom je " + drugi.cenaSaPopustom(50));
		drugi.stampaj();


	}

}

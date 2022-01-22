package d21_01_2022_ZaVezbanje;

import java.util.ArrayList;



public class zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		5. Zadatak
		Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
		Npr: Ice point vanila sa dodacima: plazma, cokolada
		Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez

		Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
		 naziv dodatka
		 cenu dodatka
		 konstruktore, gettere i settere koji su vam potrebni
		 metodu stampaj koja stampa u formatu:
		(dodatak)  (cena)

		Kreirati abstraktnu klasu Proizvod koja ima:
		 niz dodataka
		 metodu ubaciDodatak koja dodaje dodatak u niz
		 metodu koja vraca cenu svih dodataka koje ima proizvod
		 abstraktnu metodu ukupnu racunaj cenu 
		 abstraktnu metodu stampaj



		Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
		 tip sladoleda (vanila, cokolada)
		 atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
		 override uje metodu koja ukupnu cenu racuna:
		ako je mali ice point na cenu svih dodataka doda 100
		ako je veliki ice point cenu svih dodataka doda 130
		override uje metodu stampaj da stampa sve podatke
			
		Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
		 cena podloge
		 override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
		override uje metodu stampaj da stampa sve podatke
			
		U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.
*/		
		//ArrayList<Dodatak>dodaci=new ArrayList<Dodatak>();
		Dodatak s1 =new Dodatak("Cokoladne mrvice", 50);
		Dodatak s2 =new Dodatak("Plazma", 20);
		Dodatak s3 =new Dodatak("Toping", 60);
		Dodatak s4 =new Dodatak("Sumsko voce", 80);
		Dodatak s5 =new Dodatak("Seckani bademi", 80);
		
		Dodatak p1 =new Dodatak("Kackavalj", 200);
		Dodatak p2 =new Dodatak("Masline", 100);
		Dodatak p3 =new Dodatak("Prsuta", 300);
		

		ArrayList<Proizvod>proizvodi=new ArrayList<Proizvod>();
		Proizvod icp1= new IcePoint( "vanila", false);
		icp1.ubaciDodatak(s2);
		icp1.ubaciDodatak(s5);
		proizvodi.add(icp1);
		Proizvod icp2= new IcePoint( "cokolada", true);
		icp2.ubaciDodatak(s3);
		icp2.ubaciDodatak(s2);
		icp2.ubaciDodatak(s5);
		proizvodi.add(icp2);
		Proizvod icp3= new IcePoint( "cokolada", false);
		icp3.ubaciDodatak(s3);
		icp3.ubaciDodatak(s2);
		icp3.ubaciDodatak(s5);
		proizvodi.add(icp3);
		
		Proizvod pica1=new Pica(300);
		pica1.ubaciDodatak(p1);
		pica1.ubaciDodatak(p3);
		Proizvod pica2=new Pica(300);
		pica2.ubaciDodatak(p1);
		pica2.ubaciDodatak(p3);
		pica2.ubaciDodatak(p2);
		proizvodi.add(pica1);
		proizvodi.add(pica2);
		
		double ukupnaCena=0;
		for(int i =0;i<proizvodi.size();i++) {
			proizvodi.get(i).print();
			ukupnaCena=ukupnaCena +proizvodi.get(i).ukupnaCena();
		}System.out.println("Ukupna cena porudzbine je " + ukupnaCena);
		System.out.println("bla bla");
		
	}

}

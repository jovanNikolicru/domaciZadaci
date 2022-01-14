package d_13_01_2022;

public class zadatak1 {

	public static void main(String[] args) {
//		1.Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od gettera i settera:
//			korisnik moze da procita bilo koji atribut 
//			ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove atribute)
//			 Konstruktore:
//				konstruktori koji su potrebni i logicni
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
		
		
		
		FacebookPost jovan= new FacebookPost("Jovan Nikolic", "Nikola Jovanovic", "Pravda za Novaka");
		
		jovan.getWhoPosted();
		jovan.getPostedTo();
		jovan.getPostText();
		jovan.like();
		jovan.like();
		jovan.share();
		jovan.print();
		System.out.println();
		System.out.println(jovan.getWhoPosted()+" dobio je  " + jovan.getLikes()+" lajka na ovu objavu");
		System.out.println();
		FacebookPost nikola= new FacebookPost("Nikola Jovanovic", "Jovan Nikolic", "Pravda za Australiju");
		nikola.dislike();nikola.dislike();nikola.dislike();nikola.dislike();
		nikola.share();nikola.share();nikola.share();nikola.share();
		nikola.setPostedTo("Everyone");
		nikola.print();
		System.out.println();
		if (nikola.getLikes()<0) {
			System.out.println(nikola.getWhoPosted()+" dobio je  " + (nikola.getLikes()*-1) +" dislajka na ovu objavu");
		}else {
			System.out.println(nikola.getWhoPosted()+" dobio je  " +nikola.getLikes() +" lajka na ovu objavu");
		}
	}

}

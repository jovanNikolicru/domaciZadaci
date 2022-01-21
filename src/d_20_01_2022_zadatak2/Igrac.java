package d_20_01_2022_zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba {
	private int broj;
	private String pozicija;
	private ArrayList<Karton> kartoni= new ArrayList<Karton>();
	boolean kapiten;
	public Igrac() {
		super();
		
	}
	public Igrac(String imeIPrezime, String jmbg, int godinaR,int broj,
			String pozicija, /*ArrayList<Karton> kartoni,*/ boolean kapiten) {
		super(imeIPrezime, jmbg, godinaR);
		this.broj=broj;
		this.pozicija=pozicija;
		//this.kartoni=kartoni;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void dodajKarton(String tip) {
		Karton k1=new Karton(tip);
		kartoni.add(k1);
		
	}
	public int brZutih() {
		int brojacZutih=0;
		for(int i=0;i<kartoni.size();i++) {
		if(kartoni.get(i).getTip().equals("zuti")) {
			brojacZutih=brojacZutih+1;
		}
	}return brojacZutih;
	}
	public int brCrvenih() {
		int brojacCrvenih=0;
		for(int i=0;i<kartoni.size();i++) {
		if(kartoni.get(i).getTip().equals("crveni")) {
			brojacCrvenih=brojacCrvenih+1;
		}
	}return brojacCrvenih;
	}
	public void print() {
		super.print();
		System.out.println("Broj dresa: " + broj +"  i igra na poziciji " + pozicija);
		if(kapiten==true) {
			System.out.println("Igrac je kapiten tima");
		}
	}
}

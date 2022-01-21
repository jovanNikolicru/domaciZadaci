package d_20_01_2022;

public class Igrac extends Osoba {
	private int broj;
	private String pozicija;
	private boolean kapiten;
	public Igrac() {
		super();
		
	}
	public Igrac(String imeIPrezime, String jmbg, int godinaR,int broj, String pozicija, boolean kapiten) {
		super(imeIPrezime, jmbg, godinaR);
		this.broj=broj;
		this.pozicija=pozicija;
		this.kapiten=kapiten;
		
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
	
	public void print() {
		super.print();
		System.out.println(this.broj+" " +this.pozicija );
		if(kapiten==true) {
			System.out.println("Igrac je kapiten tima");
		}else {
			System.out.println("Igrac nije kapiten");
		}System.out.println();
	}

}

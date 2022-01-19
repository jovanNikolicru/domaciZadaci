package d_17_01_2022_zadatak2;

public class Racun {
	private String broj;
	private String vlasnik;
	private double stanje;
	
	public Racun(String broj, String vlasnik, double stanje) {
		super();
		this.broj = broj;
		this.vlasnik = vlasnik;
		this.stanje = stanje;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public double getStanje() {
		return stanje;
	}
	public void uplataIsplata(double prosledjeno) {
		this.stanje=this.stanje-prosledjeno;
		if(this.stanje<0) {
			this.stanje=0;
		
		}
	}
	public void print() {
		System.out.println(this.vlasnik + " " +this.broj);
		System.out.println("Stanje na racunu je " + this.stanje +"rsd");
	}
	
}

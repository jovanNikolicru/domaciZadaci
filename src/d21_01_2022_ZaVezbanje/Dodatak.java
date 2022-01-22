package d21_01_2022_ZaVezbanje;

public class Dodatak {
	private String naziv;
	private int cena;
	public Dodatak(String naziv, int cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getCena() {
		return cena;
	}
	public void print() {
		System.out.println(this.naziv+" " +this.cena);
	}
	
}

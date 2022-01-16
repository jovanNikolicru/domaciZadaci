package d_14_01_2022_zaVezbanje;

public class Proizvod {
	private String sifra;
	private String naziv;
	private double cenaKg;
	
	public Proizvod(String sifra, String naziv, double cenaKg) {
		this.sifra=sifra;
		this.naziv=naziv;
		this.cenaKg=cenaKg;
		
	}
	public void setSifra(String sifra) {
		this.sifra=sifra;
	}
	public String getSifra() {
		return this.sifra;
	}
	public void setNaziv(String naziv) {
		this.naziv=naziv;
	}
	public String getNaziv() {
		return this.naziv;
	}
	public void setCenaKg(double cenaKg) {
		this.cenaKg=cenaKg;
	}
	public double getCenaKg() {
		return this.cenaKg;
	}
	public double getCenaIb() {
		double cenaIb;
		cenaIb= this.cenaKg / 2.2046 ;
		return cenaIb;
	}
	public void print() {
		System.out.println(this.sifra+" - "+this.naziv);
	}
}

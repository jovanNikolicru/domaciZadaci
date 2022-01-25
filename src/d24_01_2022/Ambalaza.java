package d24_01_2022;

public abstract class Ambalaza {
	protected String barKod;
	protected String naziv;
	protected double netoTezina;
	protected double brutoTezina;
	public Ambalaza(String barKod, String naziv, double netoTezina, double brutoTezina) {
		super();
		this.barKod = barKod;
		this.naziv = naziv;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}
	public Ambalaza() {
		super();
	}
	public String getBarKod() {
		return barKod;
	}
	public void setBarKod(String barKod) {
		this.barKod = barKod;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getNetoTezina() {
		return netoTezina;
	}
	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}
	public double getBrutoTezina() {
		return brutoTezina;
	}
	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}
	public double tezinaPakovanja() {
		return  this.brutoTezina-this.netoTezina;
	}
	public abstract double cena();
	public abstract void print();
	
}

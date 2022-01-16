package d_14_01_2022_zaVezbanje;

public class Vaga {
	private String jedinica;
	private Proizvod proizvod;
	
	public Vaga() {
		
	}
	public void setJedinica(String jedinica) {
		this.jedinica=jedinica;
	}
	public String getJedinica() {
		return this.jedinica;
	}
	public void setProizvod(Proizvod proizvod) {
		this.proizvod=proizvod;
	}
	public Proizvod getProizvod() {
		return this.proizvod;
	}
	public double izracunajCenu(double tezina) {
	
		this.proizvod.getCenaIb();
		this.proizvod.getCenaKg();
		if (this.jedinica.equals("kg")) {
			
			return this.proizvod.getCenaKg()*tezina;
		}else {
			return this.proizvod.getCenaIb()*tezina;
		}
	}
	public void print (double tezina) {
		
		System.out.println(this.proizvod.getSifra() + " - " + this.proizvod.getNaziv());
		if (this.jedinica.equals("kg")) {
			System.out.println("Cena po " +this.jedinica+ " je " + this.proizvod.getCenaKg()+"x " + tezina);
		System.out.println("Ukupno cena = "+ izracunajCenu(tezina) );
	}else {
		System.out.println("Cena po " +this.jedinica+ " je " + this.proizvod.getCenaIb()+"x " + tezina);
		System.out.println("Ukupno cena = "+ izracunajCenu(tezina) );
	}
	}
}

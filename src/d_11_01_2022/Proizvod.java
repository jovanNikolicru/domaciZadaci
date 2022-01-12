package d_11_01_2022;

public class Proizvod {
	String naziv;
	double cena;
	double tezina;
	public void stampaj() {
		System.out.println("Naziv  " + this.naziv);
		System.out.println("Cena  " + this.cena);
		System.out.println("Tezina  " + this.tezina);
		System.out.println();
		
	}
	public void povecajCenu (double povecanje) {
		this.cena=cena+povecanje;
	}
	public double cenaSaPopustom(int popust) {
		double cenaSaPopustom=0;
		return cenaSaPopustom= cena-(cena*popust/100);
	}
	public double postarina() {
		double postarina=0;
		if (this.tezina<=100) {
			postarina=200;
		}else if (this.tezina>100&&this.tezina<=500) {
			postarina=400;
		}else {
			postarina=1000;
		}return postarina;
	}
}
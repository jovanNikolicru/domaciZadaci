package d24_01_2022;

public class Tetrapak extends Ambalaza {
	private boolean daLiSeReciklira;
	private double osnovnaCena;
	
	
	
	public Tetrapak(String barKod, String naziv, double netoTezina,
			double brutoTezina, boolean daLiSeReciklira,double osnovnaCena) {
		super(barKod, naziv, netoTezina, brutoTezina);
		this.daLiSeReciklira=daLiSeReciklira;
		this.osnovnaCena=osnovnaCena;
	}

	public boolean isDaLiSeReciklira() {
		return daLiSeReciklira;
	}

	public void setDaLiSeReciklira(boolean daLiSeReciklira) {
		this.daLiSeReciklira = daLiSeReciklira;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cena() {
		if(this.daLiSeReciklira==true) {
			return this.tezinaPakovanja()*1.5+this.osnovnaCena;
		}else {
			return this.osnovnaCena;
		}
	}

	@Override
	public void print() {
		System.out.println(this.barKod+" " + this.naziv+" Bruto tezina: "+ this.brutoTezina +" Neto tezina: " +this.netoTezina);
		System.out.println("Osnovna cena je " +this.osnovnaCena);
		if(this.daLiSeReciklira== true) {
			System.out.println("Ambalaza moze da se reciklira");
		}else {
			System.out.println("Ambalaza ne moze da se reciklira");
		}
	}

}

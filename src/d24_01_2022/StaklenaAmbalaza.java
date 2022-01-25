package d24_01_2022;

public class StaklenaAmbalaza extends Ambalaza {
	private double kaucija;
	private boolean daLiSePlacaKaucija;
	private double osnovnaCena;
	
	public StaklenaAmbalaza() {
		super();
		
	}
	
	public StaklenaAmbalaza(String barKod, String naziv, double netoTezina, double brutoTezina) {
		super(barKod, naziv, netoTezina, brutoTezina);
		
	}

	public StaklenaAmbalaza(String barKod, String naziv, double netoTezina, double brutoTezina,double kaucija,
			boolean daLiSePlacaKaucija, double osnovnaCena) {
		super(barKod, naziv, netoTezina, brutoTezina);
		this.kaucija=kaucija;
		this.daLiSePlacaKaucija=daLiSePlacaKaucija;
		this.osnovnaCena=osnovnaCena;
	}

	@Override
	public double cena() {
		if(daLiSePlacaKaucija==true) {
			return this.osnovnaCena*1.2+this.kaucija;
		}else {
			return this.osnovnaCena*1.2;
		}
	}

	@Override
	public void print() {
		System.out.println(this.barKod+" " + this.naziv+" Bruto tezina: "+ this.brutoTezina +" Neto tezina: " +this.netoTezina);
		System.out.println("Osnovna cena je " +this.osnovnaCena);
		if(this.daLiSePlacaKaucija== true) {
			System.out.println(" Kaucija je: "+this.kaucija);
		}else {
			System.out.println("Za ambalazu se ne placa kaucija");
		}
	}

}

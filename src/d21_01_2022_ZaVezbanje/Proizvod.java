package d21_01_2022_ZaVezbanje;

import java.util.ArrayList;

public abstract class Proizvod {
	protected ArrayList<Dodatak>dodaci=new ArrayList<Dodatak>();
	
	
	public Proizvod(ArrayList<Dodatak> dodaci) {
		super();
		this.dodaci = dodaci;
	}
	public Proizvod() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void ubaciDodatak(Dodatak dodaci) {
		this.dodaci.add(dodaci);
	}
	public double cenaSvihDodataka() {
		double cena=0;
		for(int i =0;i<dodaci.size();i++) {
		 cena=dodaci.get(i).getCena();
	}return cena;
	}
	public abstract double ukupnaCena();
	public abstract void print();
}
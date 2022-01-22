package d21_01_2022_ZaVezbanje;

import java.util.ArrayList;

public class IcePoint extends Proizvod {
	private String sladoled;
	private boolean velicina;
	
	public IcePoint( String sladoled, boolean velicina) {
		super();
		this.sladoled = sladoled;
		this.velicina = velicina;
	}

	public IcePoint(ArrayList<Dodatak> dodaci, String sladoled, boolean velicina) {
		super(dodaci);
		this.sladoled = sladoled;
		this.velicina = velicina;
	}
	

	public String getSladoled() {
		return sladoled;
	}


	public void setSladoled(String sladoled) {
		this.sladoled = sladoled;
	}


	public boolean isVelicina() {
		return velicina;
	}


	public void setVelicina(boolean velicina) {
		this.velicina = velicina;
	}


	@Override
	public double ukupnaCena() {
		double cena=0;
		for(int i =0;i<dodaci.size();i++) {
			cena=cena+dodaci.get(i).getCena();
			
		}if(velicina==true) {
			cena+=100;
		}else {
			cena+=130;
		}return cena;
	}

	@Override
	public void print() {
	System.out.println("Sladoled je od " +this.sladoled);
	if (this.velicina==true) {
		System.out.println("mali sladoled");
	}else {
		System.out.println("veliki sladoled");
	}
	System.out.println("Izabrali ste sledece dodatke");
	
	for(int i =0;i<dodaci.size();i++) {
		System.out.println(dodaci.get(i).getNaziv());
	}System.out.println("Ukupna cena je " +ukupnaCena());
	System.out.println();
		
	}

}

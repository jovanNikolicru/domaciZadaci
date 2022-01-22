package d21_01_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik {
	 public Magacioner(String imeIPrezime) {
			super(imeIPrezime);
			
		}

	
	 public Magacioner(String imeIPrezime, ArrayList<Sektor> sektori) {
		super(imeIPrezime, sektori);
		// TODO Auto-generated constructor stub
	}

	private double plataMagacioner() {
			double plata=0;
			double brojac=0;
			for(int i=0;i<sektori.size();i++) {
				if (sektori.get(i).getNaziv().equals(this.sektori.get(i).getNaziv())){
					brojac++;
				plata=plata + sektori.get(i).getPlata();
			}
	 }return plata=plata/brojac*0.5;
	 }

	@Override
	public double plata() {
		double plata=plataMagacioner();
		double brojac=0;
		for(int i=0;i<this.sektori.size();i++) {
			brojac++;
		}return plata=plata/brojac*brojac;
	}
	

}


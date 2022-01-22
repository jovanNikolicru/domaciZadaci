package d21_01_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {
	
	public Menadzer(String imeIPrezime) {
		super(imeIPrezime);
		
	}

	public Menadzer(String imeIPrezime, ArrayList<Sektor> sektori) {
		super(imeIPrezime, sektori);
		
	}

	@Override
	public double plata() {
	double plata=0;
	for(int i=0;i<sektori.size();i++) {
		plata=plata+ sektori.get(i).getPlata();
	}return plata;
	}

	

}

package d21_01_2022;

import java.util.ArrayList;

public abstract class  Radnik {
	protected String imeIPrezime;
	protected ArrayList<Sektor>sektori=new ArrayList<Sektor>();
	
	public Radnik(String imeIPrezime, ArrayList<Sektor> sektori) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.sektori = sektori;
	}

	public Radnik(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	
	}
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

	public void setSektori(ArrayList<Sektor> sektori) {
		this.sektori = sektori;
	}

	public abstract double plata ();
	public void zaposliUSektor(Sektor sektori) {
		
		this.sektori.add(sektori);
		
	}
}


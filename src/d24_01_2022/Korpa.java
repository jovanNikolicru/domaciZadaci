package d24_01_2022;

import java.util.ArrayList;

public class Korpa {
	private ArrayList<Ambalaza>ambalaze=new ArrayList<Ambalaza>();
	
	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}
	public void dodajAmbalazu(Ambalaza a) {
		this.ambalaze.add(a);
	}
	public void izbaciAmbalazu(String barKod) {
		for(int i =0;i<ambalaze.size();i++) {
			if(this.ambalaze.get(i).getBarKod().equals(barKod)) {
				this.ambalaze.remove(i);
			}
		}
	}
	private double cenaSvihAmbalazaPopust(double popust) {
		double cenaAmbSaPopustom=0;
		for(int i = 0; i < ambalaze.size();i++) {
			cenaAmbSaPopustom=cenaAmbSaPopustom +this.ambalaze.get(i).cena();
		}return cenaAmbSaPopustom-popust;
	}
	
	public double cenaKorpe(SuperKartica s1) {
		return cenaSvihAmbalazaPopust(s1.getPopust());
	}
		
	}


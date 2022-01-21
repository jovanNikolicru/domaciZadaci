package d_20_01_2022_zadatak2;

public class Osoba {
	protected String imeIPrezime;
	protected String jmbg;
	protected int godinaR;
	
	public Osoba() {
	
	}

	public Osoba(String imeIPrezime, String jmbg, int godinaR) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
		this.godinaR = godinaR;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaR() {
		return godinaR;
	}

	public void setGodinaR(int godinaR) {
		this.godinaR = godinaR;
	}
	public void print() {
		System.out.println(this.imeIPrezime+" " + this.jmbg+" " +this.godinaR);
	}
	
}


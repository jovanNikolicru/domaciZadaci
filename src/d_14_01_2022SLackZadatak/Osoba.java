package d_14_01_2022SLackZadatak;



public class Osoba {

	private String imeIPrezime;
	private int godinaRodjenja;
	private String pol;
	private Osoba otac;
	private Osoba majka;
	
	public Osoba() {
		
	}
	public Osoba(String imeIPrezime, int godinaRodjenja, String pol) {
		this.imeIPrezime=imeIPrezime;
		this.godinaRodjenja=godinaRodjenja;
		this.pol=pol;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime=imeIPrezime;
	}
	public String getImeIPrezime() {
		return this.imeIPrezime;
	}
	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja=godinaRodjenja;
	}
	public int getGodinaRodjenja() {
		return this.godinaRodjenja;
	}
	public void setPol(String pol) {
		this.pol=pol;
	}
	public String getPol() {
		return this.pol;
	}
	public void setOtac(Osoba otac) {
		this.otac=otac;
	}
	public Osoba getOtac() {
		return this.otac;
	}
	public void setMajka(Osoba majka) {
		this.majka=majka;
	}
	public Osoba getMajka() {
		return this.majka;
	}
	public void print () {
		System.out.println(this.imeIPrezime+" rodjen(a) " +this.godinaRodjenja +" pol:"+this.pol);
		

}
	public void printO () {
		System.out.println("Otac:");
		System.out.println(this.otac.getImeIPrezime()+" rodjen(a) " +this.otac.getGodinaRodjenja()+" pol:"+this.otac.getPol());
	}
	public void printM() {
		System.out.println("Majka:");
		System.out.println(this.majka.getImeIPrezime()+" rodjen(a) " +this.majka.getGodinaRodjenja()+" pol:"+this.majka.getPol());
	}
	}
	
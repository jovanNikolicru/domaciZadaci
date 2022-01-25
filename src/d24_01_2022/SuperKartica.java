package d24_01_2022;

public class SuperKartica {
	private String broj;
	private String imeIPrezime;
	private double popust;
	
	public SuperKartica() {
		
	}

	public SuperKartica(String broj, String imeIPrezime, double popust) {
		super();
		this.broj = broj;
		this.imeIPrezime = imeIPrezime;
		this.popust = popust;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}
	public void print() {
		System.out.println(this.broj + " " +this.imeIPrezime);
	}
}

package d_18_01_2022;

public class Ispiti {
	private String naziv;
	private double ocena;
	private String profesor;
	public Ispiti() {
	
	}
	public Ispiti(String naziv, double ocena, String profesor) {
		super();
		this.naziv = naziv;
		this.ocena = ocena;
		this.profesor = profesor;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getOcena() {
		return ocena;
	}
	public void setOcena(double ocena) {
		this.ocena = ocena;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public boolean polozen() {
		return this.ocena>5;
	}
	public void print() {
		System.out.println(this.naziv + " "+ this.profesor+" " + this.ocena);
	}
}

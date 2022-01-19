package d_17_01_2022_zadatak1;

public class ZeleniKarton {
	private String student;
	private String brIndexa;
	private String predmet;
	private String profesor;
	private int ocena;
	public ZeleniKarton() {
		
	}
	public ZeleniKarton(String student, String brIndexa, String predmet, String profesor, int ocena) {
		super();
		this.student = "Mika Mikic";
		this.brIndexa = "is31312" ;
		this.predmet = predmet;
		this.profesor = profesor;
		this.ocena = ocena;
	}
	public String getStudent() {
		return student;
	}
	
	public String getBrIndexa() {
		return brIndexa;
	}
	
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public boolean polozen () {
		return this.ocena>5;
	}
	public void print() {
		System.out.println(this.predmet + " " + this.ocena);
		System.out.println("Student: " + this.student + " " + this.brIndexa);
		System.out.println("Profesor: " + this.profesor);
		if(this.ocena>5) {
			System.out.println("Polozen ispit");
		}else {
			System.out.println("Nije polozio ispit");
		}
		System.out.println();
	
	
	}

	
}

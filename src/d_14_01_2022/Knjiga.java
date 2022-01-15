package d_14_01_2022;

public class Knjiga {
	private String ISBN;
	private String naziv;
	private int godina;
	private Autor autor;
	
	public Knjiga() {
		
	}
	public Knjiga(String ISBN, String naziv, int godina, Autor autor) {
		this.ISBN=ISBN;
		this.naziv=naziv;
		this.godina=godina;
		this.autor=autor;
	}
	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}
	public String getISBN() {
		return this.ISBN;
	}
	public void setNaziv(String naziv) {
		this.naziv=naziv;
	}
	public String getNaziv() {
		return this.naziv;
	}
	public void setGodina(int godina) {
		this.godina=godina;
	}
	public int getGodina() {
		return this.godina;
	}
	public void setAutor(Autor autor) {
		this.autor=autor;
	}
	public Autor getAutor() {
		return this.autor;
	}
	public void print() {
		System.out.println(this.ISBN);
		System.out.println(this.naziv +" " +this.godina);
		System.out.println(this.autor.getIme() + " " + this.autor.getPrezime());
	}
}

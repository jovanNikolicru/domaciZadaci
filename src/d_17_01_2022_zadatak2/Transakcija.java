package d_17_01_2022_zadatak2;

public class Transakcija {
	private String id;
	private Racun racunSaKogSePrenosi;
	private Racun racunNaKojiSePrenosi;
	
	public Transakcija() {
		
	}

	public Transakcija(String id, Racun racunSaKogSePrenosi, Racun racunNaKojiSePrenosi) {
		super();
		this.id = id;
		this.racunSaKogSePrenosi = racunSaKogSePrenosi;
		this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getRacunSaKogSePrenosi() {
		return racunSaKogSePrenosi;
	}

	public void setRacunSaKogSePrenosi(Racun racunSaKogSePrenosi) {
		this.racunSaKogSePrenosi = racunSaKogSePrenosi;
	}

	public Racun getRacunNaKojiSePrenosi() {
		return racunNaKojiSePrenosi;
	}

	public void setRacunNaKojiSePrenosi(Racun racunNaKojiSePrenosi) {
		this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
	}
	private double provizija(double prosledjeno) {
		if (prosledjeno<4500) {
			return 45;
		}else {
			return prosledjeno/100;
		}
		
	}
	public void izvrsiTransakciju(double prosledjeno) {
	this.racunSaKogSePrenosi.uplataIsplata(prosledjeno+provizija(prosledjeno));
		this.racunNaKojiSePrenosi.uplataIsplata(prosledjeno*(-1));
		if (this.racunSaKogSePrenosi.getStanje()<prosledjeno+provizija(prosledjeno)) {
			System.out.println("Nema dovoljno sredstava");
			this.racunSaKogSePrenosi.getStanje();
		}

	}
	public void print() {
		System.out.println(this.id);
		this.racunSaKogSePrenosi.print();
		this.racunNaKojiSePrenosi.print();
	}
}

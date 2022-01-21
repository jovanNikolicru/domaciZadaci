package d_20_01_2022;

public class Trener extends Osoba{
	private int iskustvo;
	private String tip;
	public Trener() {
		super();
		
	}
	public Trener(String imeIPrezime, String jmbg, int godinaR,int iskustvo, String tip) {
		super(imeIPrezime, jmbg, godinaR);
		this.iskustvo=iskustvo;
		this.tip=tip;
	}
	
	public void print () {
		super.print();
		System.out.println(this.iskustvo+" " +this.tip);
		System.out.println();
	}
}

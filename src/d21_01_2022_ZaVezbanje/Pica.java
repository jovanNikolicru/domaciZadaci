package d21_01_2022_ZaVezbanje;

public class Pica extends Proizvod {
	private int cenaPodloge;

	

	public Pica( int cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
	}

	public int getCenaPodloge() {
		return cenaPodloge;
	}

	public void setCenaPodloge(int cenaPodloge) {
		this.cenaPodloge = cenaPodloge;
	}
	@Override
	public double ukupnaCena() {
		double cena=0;
		for(int i =0;i<dodaci.size();i++) {
			cena = cena +dodaci.get(i).getCena();
		}return cena + this.cenaPodloge;
	}

	@Override
	public void print() {
	System.out.println("Narucili ste picu sa sledecim dodacima");
	
	for(int i =0;i<dodaci.size();i++) {
		System.out.println(dodaci.get(i).getNaziv());
	}System.out.println("Ukupna cena je " +ukupnaCena());
	System.out.println();
		
	}
}

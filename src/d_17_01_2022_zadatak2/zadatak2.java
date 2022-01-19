package d_17_01_2022_zadatak2;

public class zadatak2 {

	public static void main(String[] args) {
		Racun uplatilac =new Racun("947324", "Mika", 4000);
		Racun primalac= new Racun("2356", "Pera", 50);
		Transakcija a1= new Transakcija("qeha92320", uplatilac, primalac);
		
		a1.izvrsiTransakciju(4500);
		/*uplatilac.print();
		primalac.print();*/
		a1.print();
		
	}

}

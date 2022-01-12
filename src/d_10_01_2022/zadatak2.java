package d_10_01_2022;

public class zadatak2 {

	public static void main(String[] args) {
		SmartAirConditioning a=new SmartAirConditioning();
		a.brand="Samsung";
		a.temperature=19;
		a.mode="Cool";
		a.print();
		SmartAirConditioning b=new SmartAirConditioning();
		b.brand="Gree";
		b.temperature=32;
		b.mode="Heat";
		b.print();
		

	}

}
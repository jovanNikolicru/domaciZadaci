package d_11_01_2022;

public class SmartAirConditioning {
	String brand;
	int temperature;
	String mode;
	double electricityUsageCooling;
	double electricityUsageHeat;
	public void print() {
		System.out.println(this.brand);
		System.out.println(this.temperature);
		System.out.println(this.mode);
	
	}
	public double monthlyUsage() {
		double monthlyUsage=0;
		if (this.mode.equals("Cool")) {
		return	 monthlyUsage =30*15*this.electricityUsageCooling;
			
		}else if  (this.mode.equals("Heat")) {
			return monthlyUsage =30*15*this.electricityUsageHeat;
		
		}return monthlyUsage;
	}
	public void monthlyCost() {
		double monthlyCost=0;
				if (this.monthlyUsage()<+350) {
					monthlyCost=this.monthlyUsage()*6;
					System.out.println("Mesecna cena je " + monthlyCost +"rsd");
				}else {
					monthlyCost=350*6 + (this.monthlyUsage()-350)*9;
					System.out.println("Mesecna cena je " + monthlyCost +"rsd");
				}
		
	}
}

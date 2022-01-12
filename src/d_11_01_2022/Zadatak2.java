package d_11_01_2022;

import d_11_01_2022.SmartAirConditioning;

public class Zadatak2 {

	

		public static void main(String[] args) {
			SmartAirConditioning a=new SmartAirConditioning();
			a.brand="Samsung";
			a.temperature=19;
			a.mode="Cool";
			a.electricityUsageCooling=0.5;
			a.print();
			System.out.println("Mesecna potrosnja je " + a.monthlyUsage()); 
			a.monthlyCost();
			 System.out.println();
			 
			SmartAirConditioning b=new SmartAirConditioning();
			b.brand="Gree";
			b.temperature=32;
			b.mode="Heat";
			b.electricityUsageHeat=2.6;
			
			b.print();
			System.out.println("Mesecna potrosnja je " + b.monthlyUsage()); 
			b.monthlyCost();
		}
		

	}

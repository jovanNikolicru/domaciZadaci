package d_18_01_2022;

import java.util.ArrayList;

public class Student {
	private String student;
	private String indeks;
	private String tipStudija;
	private ArrayList<Ispiti>ispiti=new ArrayList<Ispiti>();
	public Student() {
	
	}
	public Student(String student, String indeks, String tipStudija, ArrayList<Ispiti> ispiti) {
		super();
		this.student = student;
		this.indeks = indeks;
		this.tipStudija = tipStudija;
		this.ispiti = ispiti;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getIndeks() {
		return indeks;
	}
	public void setIndeks(String indeks) {
		this.indeks = indeks;
	}
	public ArrayList<Ispiti> getIspiti() {
		return ispiti;
	}
	public void setIspiti(ArrayList<Ispiti> ispiti) {
		this.ispiti = ispiti;
	}
	public String getTipStudija() {
		return tipStudija;
	}
	public void dodajIspit(Ispiti ispiti) {
		this.ispiti.add(ispiti);
	}
	public double prosek() {
		double zbirPolozenih=0;
		int brojacPolozenih=0;
		for(int i=0;i<ispiti.size();i++) {
		if (ispiti.get(i).polozen()==true) {
			zbirPolozenih=zbirPolozenih+ispiti.get(i).getOcena();
			brojacPolozenih=brojacPolozenih +1;
		}
			
		}return zbirPolozenih/brojacPolozenih;
	}
	public void print() {
		System.out.println(this.indeks +" " +this.student+" " +this.tipStudija);
		for (int i = 0;i<ispiti.size();i++) {
			ispiti.get(i).print();
		}System.out.println("Prosecna ocena je " + prosek());
	}
}

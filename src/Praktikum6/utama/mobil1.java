package Praktikum6.utama;
import Praktikum6.rangka;
public class mobil1 {
	
	public rangka rangka;
	public Praktikum6.mesin mesin;
	private int nomer;
	protected String nama;
	
	public mobil1(){
		rangka= new rangka();
		mesin=new Praktikum6.mesin();
		System.out.println("Konstruktor mobil");
	}
	
	public void stater(){
		System.out.println("Stater Mobil");
	}

}

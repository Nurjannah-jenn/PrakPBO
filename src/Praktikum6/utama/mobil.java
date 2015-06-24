package Praktikum6.utama;
import Praktikum6.rangka;

public class mobil {
	private rangka rangka;
	
	private Praktikum6.mesin mesin;
	public mobil(){
		rangka = new rangka();
		mesin = new Praktikum6.mesin();
	}

	public static void main(String args[]){
		new mobil();
	}
}

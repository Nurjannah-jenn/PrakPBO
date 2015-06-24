package Praktikum6.mobil;

import Praktikum6.mesin;
import Praktikum6.rangka;
import Praktikum6.utama.mobil1;


public class truk extends mobil1 {
	
	public truk() {	
}
	public void tongkang(){
		mesin=new mesin();
		stater();
		nama="truk";
		System.out.println("tongkang");
	}

	
	public static void main(String args[]){
		truk truk=new truk();
		truk.tongkang();
	}

}

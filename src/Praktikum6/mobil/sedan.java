package Praktikum6.mobil;
import Praktikum6.utama.mobil2;

public class sedan extends mobil2{
	
	public static String nama;
	
	public sedan(){
		super(nama);
	}

	public sedan (String nama){
		super(nama);
	}
	
	public void cetak(String nama){
		super.nama=nama;
		this.nama="sedan lokal";
		
		System.out.println(nama);
		System.out.println(this.nama);
	}
	
	public static void main(String args[]){
		sedan sedan=new sedan();
		sedan.cetak("sedan");
		
	}
}


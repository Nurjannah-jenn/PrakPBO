package Praktikum5;

public class orang {
	public  static void  main(String[] args) {
		orang objekOrang = new orang();
		hewan objekHewan = null;
		if (objekOrang instanceof orang){
			System.out.println("objek orang adalah instan dari kelas"+"orang");
		}
		if (objekHewan == null) {
			System.out.println("objek hewan belum diinstansiasi");
		}
	}

}
class hewan {
	
}

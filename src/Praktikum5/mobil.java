package Praktikum5;

public class mobil {
	public static int JUMLAH_MOBIL = 0;
	public String merek;

	public static void tambahMobil() {
		JUMLAH_MOBIL++;
	}

	public static void main(String[] args) {
		mobil objekMobil = new mobil();
		objekMobil.JUMLAH_MOBIL = 0;
		objekMobil.merek = "AVANZA";
		mobil.tambahMobil();
		System.out.println(mobil.JUMLAH_MOBIL);
		mobil objekMobil2 = new mobil();
		objekMobil2.merek = "XENIA";
		mobil.tambahMobil();
		System.out.println(mobil.JUMLAH_MOBIL);
		mobil.tambahMobil();
		objekMobil.JUMLAH_MOBIL = 0;
		System.out.println(mobil.JUMLAH_MOBIL);
		objekMobil.JUMLAH_MOBIL = 2;
		mobil.tambahMobil();
		System.out.println(mobil.JUMLAH_MOBIL);

	}

	}
	
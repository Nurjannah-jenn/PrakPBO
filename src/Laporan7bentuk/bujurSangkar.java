package Laporan7bentuk;

public class bujurSangkar extends model {
	private float sisi;

	public bujurSangkar() {
		sisi = 5;
	}

	public float hitungLuas() {
		return sisi * sisi;
	}

	public void tulis() {
		System.out.println("Bujur Sangkar");
	}
}
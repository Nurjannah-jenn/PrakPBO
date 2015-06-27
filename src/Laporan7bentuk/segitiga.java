package Laporan7bentuk;

public abstract class segitiga extends model {
	protected float alas;
	protected float tinggi;

	public segitiga() {
		alas = 5;
		tinggi = 5;
	}

	public float hitungLuas() {
		return (alas * tinggi / 2);
	}
}
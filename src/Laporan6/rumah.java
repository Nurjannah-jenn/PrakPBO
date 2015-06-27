package Laporan6;

public class rumah {
	private pondasi pondasi;

	public rumah() {
		pondasi = new pondasi();
		System.out.println("Konstruktor pondasi");
	}

	class pondasi {
		public pondasi() {
			System.out.println("Konstruktor pondasi");
		}
	}
}
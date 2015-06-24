package praktikum8;

public class CobaCallStack {
	public void metodeSatu() {
		int a[] = new int[2];
		System.out.println("Akses elemen ketiga :"+ a[3]);
		System.out.println("ini tidak tercetak"); 
	}
	public void metodeDua() {
		try {
			metodeSatu();
			System.out.println("ini tidak tercetak");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException terjadi");
		}
		System.out.println("Setelah eksepsi");
	}
		public static void main (String args[]) {
			new CobaCallStack().metodeDua();

	}

}

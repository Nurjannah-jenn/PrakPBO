package praktikum8;

public class CobaFinally {
	public static void cobaMetode(){
		int a[] = new int[2];
		try {
			System.out.println("Akses elemen keempat :"+ a[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException terjadi");
		}finally {
			a[0]=6;
			System.out.println("Nilai elemen pertama :"+ a[0]);
		}
	}
	public static void main (String args[]) {
		cobaMetode();
	}

}

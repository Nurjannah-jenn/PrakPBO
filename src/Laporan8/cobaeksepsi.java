package Laporan8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class cobaeksepsi {
	public static void main (String args[]) {
		try {
			FileInputStream file = new FileInputStream ("c:/coba.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException terjadi");
		}
	}

}

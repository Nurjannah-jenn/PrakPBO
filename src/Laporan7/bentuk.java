package Laporan7;

import Laporan7bentuk.model;
import Laporan7bentuk.bujurSangkar;
import Laporan7bentuk.samakaki;
import Laporan7bentuk.samasisi;

public class bentuk {
	public static void cetakBangun(model b) {
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}

	public static void main(String args[]) {
		cetakBangun(new bujurSangkar());
		cetakBangun(new samakaki());
		cetakBangun(new samasisi());
	}
}
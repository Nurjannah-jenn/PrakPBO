package Laporan1;

public class laporan1 {
public static void main(String[] args){
		
		System.out.println("Laporan1 \n");
		data();
		hitung();
	}
	public static void hitung()
	{
		int a=3,b=4,c=5;
		double d=1;
		
		System.out.println("\n operasi aritmatika \n");
		c=a+b;
		System.out.println("\n hasil penjumlahan "+a+"+"+b+"="+c);
		c=b-a;
		System.out.println("\n hasil pengurangan "+b+"-"+a+"="+c);
		c=a*b;
		System.out.println("\n hasil perkalian "+a+"*"+b+"="+c);
		d=(double)b/a;
		System.out.println("\n hasil pembagian "+b+"/"+a+"="+d);
		
		}
		public static void data(){
			
		System.out.println(" Nama 			: Nurjannah");
		System.out.println(" TTL 			: Luwu Timur, 03 Oktober 1994");
		System.out.println(" Alamat 		: Bukit Baruga Antang, Jl. Losari No. 4");
		System.out.println(" Jenis Kelamin		: Perempuan");
		System.out.println(" Pekerjaan		: Mahasiswa");
		System.out.println(" Nama Ayah	 	: Sahlan");
		System.out.println(" Nama Ibu 		: Maryati");
		System.out.println(" Apa Lagi?	 	: dan lain-lain :D");
	
	}

}

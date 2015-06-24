package Praktikum6;

public class rangka {
	private Ban ban;
	public rangka(){
		ban = new Ban();
		System.out.println("Konstruktor Rangka");
	}
}
class Ban {
	public Ban(){
		System.out.println("Konstruktor Ban");
	}
}
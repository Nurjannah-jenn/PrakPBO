package Praktikum4;

public class kondisional2 {
	public static void main(String[] args) {
		int skor = 76;
		char grade;
		
		if (skor >= 90) {
			grade = 'A';
		}
		else if (skor >= 80) {
			grade = 'B';
		}
		else if (skor >= 70) {
			grade = 'C';
		}
		else {grade = 'F'; 
		}
		System.out.println ("Grade = "+ grade);
	}
}

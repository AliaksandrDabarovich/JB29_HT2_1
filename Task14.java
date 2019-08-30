package by.ad.les03.main;

public class Task14 {

	public static void main(String[] args) {
		double alf;
		double bet;
		double gam;
		
		alf=80;
		bet=10;
		gam=180-alf-bet;
		
		if (gam>0) {
			System.out.println("Такой треугольник существует");
			if (alf==90 || bet==90||gam==90) {
				System.out.println("Данный треугольник прямоуголный");
				
			}
			else {
				System.out.println("Данный треугольник НЕ прямоуголный");
			}
		}
		else {
			System.out.println("Такого треугольника не существует");
		}

	}

}

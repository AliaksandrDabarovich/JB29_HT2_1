package by.ad.les03.main;
/*
 * 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие. 
 */
public class Task31 {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int y;
		int z;
		
		a=10;
		b=15;
		x=15;
		y=15;
		z=20;
		
		if ((x<=a && y<=b) || (y<=a && x<=b)) {
			System.out.println("Кирпич проходит стороной x-y");
		} else if ((x<=a && z<=b) || (z<=a && x<=b)) {
			System.out.println("Кирпич проходит стороной x-z");
		} else if ((y<=a && z<=b) || (z<=a && y<=b)) {
			System.out.println("Кирпич проходит стороной y-z");
		} else {
			System.out.println("Кирпич НЕ проходит");
		}

	}

}

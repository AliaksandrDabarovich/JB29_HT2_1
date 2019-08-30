package by.ad.les03.main;
/*
 * 10. Составить программу, которая определит площадь какого круга меньше. 
 */
import java.util.Random;
import java.lang.Math;

public class Task10 {

	public static void main(String[] args) {

		double R1;
		double R2;
		double S1;
		double S2;
			
		
		Random random = new Random();
		R1 = random.nextInt(10);
		R2 = random.nextInt(10);
		
		S1=Math.PI*R1*R1;
		S2=Math.PI*R2*R2;
		
		if (R2==0 || R1==0) {System.out.println("Ошибка!"); }
		else if (R1<R2) {System.out.println("Наименьший круг с радиусом R1 с площадью: " + S1);}
		else if (R2<R1) {System.out.println("Наименьши круг с радиусом R2 с площадью: " + S2);}
		else if (R2==R1) {System.out.println("Круги равны"); }
		else {System.out.println("Ошибка!");}
		
		
		

	}

}

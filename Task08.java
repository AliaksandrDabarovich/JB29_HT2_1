package by.ad.les03.main;

import java.util.Random;

/*
 * 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */
public class Task08 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		
		
		Random random = new Random();
		a = random.nextInt(10);
		b = random.nextInt(10);
		
		a*=a;
		b*=b;
		if (a<b) {System.out.println("Наименьший квадрат числа: " + a);}
		else if (b<a) {System.out.println("Наименьший квадрат числа: " + b);}
		else if (a==b) {System.out.println("Квадраты чисел равны"); }
		else {System.out.println("Ошибка!");}
		
		System.out.println("Число a:"+ a+"\n"+ "Число b:"+b);
		

	}

}

package by.ad.les03.main;

import java.util.Random;
/*
 * 7. Составить программу нахождения модуля выражения a*x*x + b*x + c 
 * при заданных значениях a, b, c и х
 */
public class Task07 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
		int y;
		
		Random random = new Random();
		
		a = -500;
		b = random.nextInt(10);
		c = random.nextInt(10);
		x = random.nextInt(10);
		
		
		y=a*x*x+b*x+c;
		
		if(y>0) {
			System.out.println("Модуль выражения: "+ y);
			
		} else if (y<0) {
			y=y*(-1);
			System.out.println("Модуль выражения: "+ y);
		} else
		{
			System.out.println("Выражение равно: "+ y);
		}
		
		

	}

}

package by.ad.les03.main;

import java.util.Random;

/*
 * 6. Составить программу: определения наибольшего из двух чисел а и b.
 */
public class Task06 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int a = random.nextInt(10);
		int b = random.nextInt(10);
		
		if (a>b) {
			
			System.out.println("Наибольшее число a: " + a);
		} else if (b>a) 
		{
			
			System.out.println("Наибольшее число b: " + b);
		}
		else {
			System.out.println("Наибольшее число не выявлено." );
		
		
		}
		System.out.println("Число a:"+ a+"\n"+ "Число b:"+b);

	}

}

package by.ad.les03.main;

import java.util.Random;

/*
 * 9. Составить программу, которая определит по трем введенным сторонам, 
 * является ли данный треугольник равносторонним. 
 */
public abstract class Task09 {

	public static void main(String[] args) {
		
		
		int a;
		int b;
		int c;
		
		
		
		Random random = new Random();
		a = random.nextInt(10);
		b = random.nextInt(10);
		c = random.nextInt(10);
		
		if (a==b && b==c && a==c) {
			System.out.println("Сторона a:"+ a+"\n"+ "Сторона b:"+b+"\n"+ "Сторона c:"+c+"\n"+
							"Треугольник является равносторонним");
		} else if (a==0 || b==0 || c==0) {
			System.out.println("Сторона a:"+ a+"\n"+ "Сторона b:"+b+"\n"+ "Сторона c:"+c+"\n"+
					"Фигура не является треугольником");
}
				
		else {
			System.out.println("Сторона a:"+ a+"\n"+ "Сторона b:"+b+"\n"+ "Сторона c:"+c+"\n"+
					"Треугольник НЕ является равносторонним");
		}
		

	}

}

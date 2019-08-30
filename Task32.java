package by.ad.les03.main;
/*
 * 32. Написать программу, которая по заданным 
 * трем числам определяет, является ли сумма каких-либо двух из них положительной.
 */
public class Task32 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		a=-20;
		b=5;
		c=-5;
		
		if (a+b>0) {System.out.println("Сумма a+b является положительной");}
		else if (a+c>0) {System.out.println("Сумма a+c является положительной");}
		else if (b+c>0) {System.out.println("Сумма b+c является положительной");}
		else {System.out.println("Ни одна сумма НЕ является положительной");}

	}

}

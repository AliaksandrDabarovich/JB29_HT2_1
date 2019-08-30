package by.ad.les03.main;
import java.util.Scanner;
/*
 * 34. Составить программу, реализующую эпизод 
 * применения компьютера в книжном магазине. 
 * Компьютер запрашивает стоимость книг, сумму денег, 
 * внесенную покупателем; если сдачи не требуется, 
 * печатает на экране «спасибо»; если денег внесено больше, 
 * чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег 
 * недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы. 
 */

public class Task34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int value;
		int money;
		
		System.out.println("Введите стоимость >");
		while (sc.hasNextInt()==false) {
			sc.next();
			System.out.println("Введите стоимость >");
		}
		value=sc.nextInt();
		
		System.out.println("Введите внесённую сумму денег >");
		while (sc.hasNextInt()==false) {
			sc.next();
			System.out.println("Введите внесённую сумму денег >");
		}
		money=sc.nextInt();
		
		if (value==money) {
			System.out.println("спасибо");
		} else if(value<money) {System.out.println("возьмите сдачу "+(money-value));}
		else {
			System.out.println("недостаточно денег "+(value-money));
		}
		

	}

}

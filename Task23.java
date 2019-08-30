package by.ad.les03.main;
import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int month;
		int day;
		int year;
		
		System.out.println("Введите год >");
		while (sc.hasNextInt()==false) {
			sc.next();
			System.out.println("Введите год >");
		}
		year=sc.nextInt();
		
		
		System.out.println("Введите месяц >");
		while (sc.hasNextInt()==false) {
			sc.next();
			System.out.println("Введите месяц >");
		}
		month=sc.nextInt();
		System.out.println("Введите день >");
		while (sc.hasNextInt()==false) {
			sc.next();
			System.out.println("Введите день >");
		}
		day=sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5: 
		case 7: 
		case 8:
		case 10:
		case 12: System.out.println("Месяц " + month + " введён корректно"); 
			if (day>=1 && day <=31) {
				System.out.println("День " + day + " введён корректно");}
				else {System.out.println("День " + day + " введён НЕкорректно!");}
			break;
		case 4:
		case 6:
		case 9: 
		case 11: System.out.println("Месяц " + month + " введён корректно");
			if (day>=1 && day <=30) {
			System.out.println("День " + day + " введён корректно");}
			else {System.out.println("День " + day + " введён НЕкорректно!");}
		break;
		case 2: System.out.println("Месяц " + month + " введён корректно");
			if ((year%4==0 && year%100!=0)|| ((year%100==0 && year%400==0))) {
			if (day>=1 && day <=29) {
				System.out.println("День " + day + " введён корректно");}
				else {System.out.println("День " + day + " введён НЕкорректно!");}
		} else {if (day>=1 && day <=28) {
			System.out.println("День " + day + " введён корректно");}
			else {System.out.println("День " + day + " введён НЕкорректно!");}}
		break;
		default: System.out.println("Месяц " + month + " введён НЕкорректно!");
			
		
		}
		

	}

}

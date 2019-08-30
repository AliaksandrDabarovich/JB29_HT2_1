package by.ad.les03.main;



/*
 * 11. Составить программу, которая определит площадь какого треугольника больше. 
 */
public class Task11 {

	public static void main(String[] args) {
		double a1;
		double b1;
		double c1;
		
		double a2;
		double b2;
		double c2;
		
		double P1;
		double P2;
		double S1;
		double S2;
		
		
		a1 = 3;
		b1 = 2;
		c1 = 4;
		
		a2 = 5;
		b2 = 6;
		c2 = 10;
		
		P1=(a1+b1+c1)/2;
		P2=(a2+b2+c2)/2;
		
		S1=Math.sqrt(P1*(P1-a1)*(P1-b1)*(P1-c1));
		S2=Math.sqrt(P2*(P2-a2)*(P2-b2)*(P2-c2));
		
		if (S2==0 || S1==0) {System.out.println("Ошибка!"); }
		else if (S1>S2) {System.out.println("Наибольший треуголник с площадью S1: " + S1);}
		else if (S2>S1) {System.out.println("Наибольший треуголник с площадью S2: " + S2);}
		else if (S2==S1) {System.out.println("Круги равны"); }
		else {System.out.println("Ошибка!");}
		
		/*
		 * System.out.println(a1+"\n"+b1+"\n"+c1+"\n"+a2+"\n"+b2+"\n"+c2+"\n");
		*/
		

	}

}

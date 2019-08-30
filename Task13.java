package by.ad.les03.main;
/*
 * 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, 
 * которая из точек находится ближе к началу координат.
 */

public class Task13 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double L1;
		double L2;
		
		x1=1;
		y1=10;
		
		x2=3;
		y2=1;
		
		L1=Math.sqrt(x1*x1+y1*y1);
		L2=Math.sqrt(x2*x2+y2*y2);
		
		if (L2==0 || L1==0) {System.out.println("Ошибка!"); }
		else if (L1>L2) {System.out.println("Прямая L2 ближе к началу координат");}
		else if (L2>L1) {System.out.println("Прямая L1 ближе к началу координат");}
		else if (L2==L1) {System.out.println("Прямые равны"); }
		else {System.out.println("Ошибка!");}
		
		
		
		
		

	}

}

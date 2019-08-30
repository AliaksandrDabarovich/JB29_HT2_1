package by.ad.les03.main;
/*
 * 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой.  
 */
public class Task29 {

	public static void main(String[] args) {
			int x1;
			int y1;
			int x2;
			int y2;
			int x3;
			int y3;
			int a;
			int b;
			x1=1;
			y1=1;
			x2=2;
			y2=2;
			x3=3;
			y3=4;
			
			a=(y2-y1)/(x2-x1);
			b=y1-a*x1;
			
			if (y3==(a*x3+b)) {System.out.println("Точки лежат на одной прямой");}
			else {System.out.println("Точки НЕ лежат на одной прямой");}
			

	}

}

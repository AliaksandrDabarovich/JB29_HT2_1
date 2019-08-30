package by.ad.les03.main;
/*
 * 28. Даны три числа a, b, с. Определить, какое из них равно d. 
 * Если ни одно не равно d, то найти max(d — a, d — b, d —c). 
 */
public class Task28 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		
		a=1;
		b=2;
		c=3;
		d=9;
		
		
		
		if (a==d) {
			System.out.println("a равно d");
			if (b==d) {	System.out.println("b равно d");
						if (c==d) {System.out.println("c равно d");}
			} else if (c==d) {System.out.println("c равно d");}
			
		}
		else if (b==d) {	System.out.println("b равно d");
		if (c==d) {System.out.println("c равно d");}
		} else if (c==d) {System.out.println("c равно d");}
		else {System.out.println(Math.max((Math.max((d-a), (d-b))), (d-c)));}
	
		

		
		
	}

}
	

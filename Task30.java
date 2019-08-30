package by.ad.les03.main;
/*
 * 30. Даны действительные числа а,b,с. 
 * Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
 */
public class Task30 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		a=20;
		b=4;
		c=-6;
				
		if (a>b && b>c) {
			a*=2;
			b*=2;
			c*=2;
			System.out.println("а > b > с верно"+"\n"+"a="+a+"\n"+"b="+b+"\n"+"c="+c);
		}
		else {
			a=Math.abs(a);
			b=Math.abs(b);
			c=Math.abs(c);
			System.out.println("а > b > с НЕ верно"+"\n"+"a="+a+"\n"+"b="+b+"\n"+"c="+c);
		}
	}

}

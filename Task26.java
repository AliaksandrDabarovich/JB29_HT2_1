package by.ad.les03.main;
/*
 * 26. Написать программу нахождения суммы большего и меньшего из трех чисел
 */
public class Task26 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int res;
		
		a=5;
		b=20;
		c=1;
		
		if (a>b) {
			if (a>c) {
				if (c<b) {
					res=a+c;
					System.out.println("a+c="+res);}
				else {res=a+b;
				System.out.println("a+b="+res);}
			} else {
				res=c+b;
				System.out.println("c+b="+res);
			}
		} else {if (a>c) {
			if (b>c) {
				res=a+c;
			System.out.println("a+c="+res);
				
			} else {
				res=a+b;
				System.out.println("a+b="+res);
			}
			
		} else {if (c>b) {
			res=a+c;
			System.out.println("a+c="+res);
		} else {
			res=a+b;
			System.out.println("a+b="+res);
		}
		}
			
		}
		

	}

}

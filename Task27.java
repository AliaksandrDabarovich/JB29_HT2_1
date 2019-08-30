package by.ad.les03.main;
/*
 * 27. Найти max{min(a, b), min(c, d)}. 
 */
public class Task27 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int min1;
		int min2;
		int max;
		a=1;
		b=2;
		c=3;
		d=4;
		
		if (a<b) {
			min1=a;
		} else {min1=b;}
		
		if (c<d) {
			min2=c;
		} else {min2=d;}
		if (min1>min2) {max=min1;}
		else {max=min2;}
		System.out.println(max);

	}

}

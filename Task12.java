package by.ad.les03.main;
/*12. Даны три действительных числа. Возвести в квадрат те из них, 
 * значения которых неотрицательны, и в четвертую степень — отрицательные. 
 * 
 */
public class Task12 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		
		a=-3;
		b=4;
		c=0;
		
		if (a>0) {System.out.println("a положительное и в 3 степени: " + Math.pow(a, 3));}
		else if (a<0) {System.out.println("a отрицательное и в 4 степени: " + + Math.pow(a, 4));}
		else if (a==0) {System.out.println("a равно нулю");}
		else {System.out.println("Ошибка!");}
		
		if (b>0) {System.out.println("b положительное и в 3 степени: " + Math.pow(b, 3));}
		else if (b<0) {System.out.println("b отрицательное и в 4 степени: " + + Math.pow(b, 4));}
		else if (b==0) {System.out.println("b равно нулю");}
		else {System.out.println("Ошибка!");}
		
		if (c>0) {System.out.println("c положительное и в 3 степени: " + Math.pow(c, 3));}
		else if (c<0) {System.out.println("c отрицательное и в 4 степени: " + + Math.pow(c, 4));}
		else if (c==0) {System.out.println("c равно нулю");}
		else {System.out.println("Ошибка!");}
		

	}

}

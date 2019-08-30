package by.ad.les03.main;
/*
 * 18. Подсчитать количество отрицательных среди чисел а, b, с. 
 */
public class Task18 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int i;
		
		i=0;
		a=-1;
		b=-2;
		c=-3;
		
		if (a<0) {
			i++;
		} 
		if (b<0) {
			i++;
		}
		if (c<0) {
			i++;
		}
		
		System.out.println("Количество отрицательных чисел: "+ i);
	}

}

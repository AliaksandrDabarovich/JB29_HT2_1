package by.ad.les03.main;
/*
 * 19. Подсчитать количество положительных среди чисел а, b, с. 
 */
public class Task19 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int i;
		
		i=0;
		a=1;
		b=2;
		c=3;
		
		if (a>0) {
			i++;
		} 
		if (b>0) {
			i++;
		}
		if (c>0) {
			i++;
		}
		
		System.out.println("Количество отрицательных чисел: "+ i);

	}

}

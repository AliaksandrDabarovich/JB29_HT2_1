package by.ad.les03.main;
/*
 * 22. Перераспределить значения переменных х и у так, 
 * чтобы в х оказалось большее из этих значений, а в y - меньшее.
 */
public class Task22 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		x=5;
		y=10;
		z=0;
		
		if (y>x) {
			z=x;
			x=y;
			y=z;
		}
		System.out.println("X: "+x+"\n"+"Y: "+y);

	}

}

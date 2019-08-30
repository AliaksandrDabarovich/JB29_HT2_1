package by.ad.les03.main;
/*39. Вычислить значение функции: 
 * 
 */
public class Task39 {

	public static void main(String[] args) {
		double x;
		double y;
		
		x=2;
		
		if (x>=8) {
			y=-x*x+x-9;
		} else {
			y=1/(Math.pow(x, 4)-6);
		}
		
		System.out.println(y);

	}

}

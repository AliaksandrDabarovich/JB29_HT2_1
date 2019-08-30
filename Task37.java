package by.ad.les03.main;
/*37. Вычислить значение функции: 
 * 
 */
public class Task37 {

	public static void main(String[] args) {
		double x;
		double y;
		
		x=2;
		
		if (x>=3) {
			y=-x*x+3*x+9;
		} else {
			y=1/(Math.pow(x, 3)-6);
		}
		
		System.out.println(y);

	}

}

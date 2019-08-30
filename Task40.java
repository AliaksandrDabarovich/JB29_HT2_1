package by.ad.les03.main;
/*40. Вычислить значение функции: 
 * 
 */
public class Task40 {

	public static void main(String[] args) {
		double x;
		double y;
		
		x=2;
		
		if (x<=13) {
			y=-x*x*x+x+9;
		} else {
			y=-3/(x+1);
		}
		
		System.out.println(y);

	}

}

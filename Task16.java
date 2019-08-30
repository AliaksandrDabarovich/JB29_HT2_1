package by.ad.les03.main;
/*
 * 16. На плоскости ХОY задана своими 
 * координатами точка А.
 *  Указать, где она расположена 
 * (на какой оси или в каком координатном угле). 
 */
public class Task16 {

	public static void main(String[] args) {
		double x;
		double y;
		
		x=0;
		y=0;
		
		if (x>0 && y>0) {
			System.out.println("Точка находится в 1 координатном угле");
		} else if (x<0 && y>0) {
			System.out.println("Точка находится во 2 координатном угле");
		} else if (x<0 && y<0) {
			System.out.println("Точка находится в 3 координатном угле");		
			
		} else if (x>0 && y<0) {
			System.out.println("Точка находится в 4 координатном угле");
		
	} else if (x==0 && y==0) {
		System.out.println("Точка находится в начале координат");
		
	} else if (x==0) {
		System.out.println("Точка находится на оси X");
		
} else if (y==0) {
	System.out.println("Точка находится на оси Y");
	
} 
		

	}

}

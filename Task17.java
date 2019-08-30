package by.ad.les03.main;
/*
 * 17. Даны целые числа т, п. Если числа не равны, 
 * то заменить каждое из них одним и тем же числом, 
 * равным большему из исходных, 
 * а если равны, то заменить числа нулями.
 */
public class Task17 {

	public static void main(String[] args) {
		int m;
		int n;
		
		m=6;
		n=6;
		
		if(m!=n) {
			if (m>n) {
				n=m;				
			}
			if (n>m) {
				m=n;
			}
		} else {
			m=0;
			n=0;
			
		}
		
		System.out.println("Число m: "+m+"\n"+"Число n: "+n);

	}

}

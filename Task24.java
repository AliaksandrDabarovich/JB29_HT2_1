package by.ad.les03.main;
/*
 * 24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», 
 * взяв за исходное данное количество лепестков п.
 */
public class Task24 {

	public static void main(String[] args) {
		int n=5;
		do {n--;
			if (n%2==0) {System.out.println(n+" Не любит!");}
			else {System.out.println(n+" Любит!!!)");}
			
		} while (n>0);
		
		
	}

}

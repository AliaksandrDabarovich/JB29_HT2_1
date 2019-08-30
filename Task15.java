package by.ad.les03.main;
/*
 * 15. Даны действительные числа х и у, 
 * не равные друг другу. Меньшее из этих двух 
 * чисел заменить половиной их суммы, 
 * а большее — их удвоенным произведением. 
 */
public class Task15 {

	public static void main(String[] args) {
		
		double x;
		double y;
		double add;
		double mult;
		
		x=5;
		y=17;
		add=(x+y)/2;
		mult=2*x*y;
		
		
		if (x<y) {
			x=add;
			y=mult;
			
		}
		else {
			y=add;
			x=mult;
		}
		System.out.println("Число x: "+x+"\n"+"Число y: "+y);
		

	}

}

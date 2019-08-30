package by.ad.les03.main;

public class Task35 {

	public static void main(String[] args) {
		int day;
		day=1;
		
		for (int i=1; i<=12;i++) {
			if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
				
				if (day>0&&day<=31) {System.out.println("День " +day+" Месяц "+i);
									break;}
				else {day-=31;}
			} else if (i==4 || i==6 || i==9 || i==11) {
				
				if (day>0&&day<=30) {System.out.println("День " +day+" Месяц "+i);
				break;}
				else {day-=30;}
			} else if (i==2) {				
				if (day>0&&day<=29) {System.out.println("День " +day+" Месяц "+i);
				break;}
				else {day-=29;}
			} else {System.out.println("Введены некорректные дни");
			break;}
		}

	}

}

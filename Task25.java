package by.ad.les03.main;
/*
 * 25. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение 
 * «Пожароопасная ситуация », если температура в комнате превысила 60° С. 
 */
public class Task25 {

	public static void main(String[] args) {
		
		for (int temp=0;temp<65; temp++) {
			if (temp>60) {System.out.println(temp+ " Внимание! Пожароопасная ситуация ");}
			else {System.out.println(temp+ " Всё хорошо ");}
		}

	}

}

package by.ad.les03.main;
/*
 * 21. Программа — льстец. На экране высвечивается вопрос 
 * «Кто ты: мальчик или девочка? Введи Д или М». 
 * В зависимости от ответа на экране должен появиться текст 
 * «Мне нравятся девочки!» или «Мне нравятся мальчики!». 
 */
import java.util.Scanner;
public class Task21 {
	

	public static void main(String[] args) {
		
		int per;
		Scanner in= new Scanner(System.in);
		System.out.println("Введите букву Д или М >");
		String ch1 = in.nextLine();
        per=(int)ch1.charAt(0);
              
        if (per==1044) {
        	System.out.println("Мне нравятся мальчики!");
        } else if(per==1052) {
        	System.out.println("Мне нравятся девочки!");
        } else {System.out.println("Введена некорректная буква");}
        
        

	}

}

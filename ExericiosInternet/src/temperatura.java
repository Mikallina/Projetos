import java.util.Locale;
import java.util.Scanner;

import entities.Temperatura;

public class temperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.println("Digite a temperatura: ");
		Temperatura temp = new Temperatura();
		temp.c = sc.nextDouble();
				
		System.out.print (temp.toString());
	}

}

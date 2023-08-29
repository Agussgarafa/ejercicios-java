
package Ejercicios;

import java.util.Scanner; 

public class ejercicio2 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in); 
		int numero;
		do
		{			
			System.out.print("ingrese un numero entre el 50 y el 100: "); 
			numero = scanner.nextInt();
			if (numero <= 50 || numero >= 100)
			{
				System.out.println("Numero invalido (50-100)");
			}
		} while (numero <= 50 || numero >= 100);
		
		var primo = true;
		
		for(int i = 2; i * i <= numero; i++)
		{
			if (numero % i != 0)
			{
				primo = false;   
			}
		}
		if(primo)
		{
			System.out.print ("el numero " + numero + " es primo"); 
		}
		else 
		{
			for(int i = 2; i * i <= numero; i++)
			{
				if (numero % i == 0)
				{
						System.out.print(i + " ");
				}
			}
		}
				
	}

}

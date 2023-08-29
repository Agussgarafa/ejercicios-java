//Realizar una calculadora con operaciones aritméticas simples (+, - , *, /)
package Ejercicios;
import java.util.Scanner; 
public class ejercicio4 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("--CALCULADORA-- "); 
		do
		{
			System.out.print("ingrese un numero: \n "); 
			var numero1 = scanner.nextInt();  
			System.out.print("ingrese el segundo numero: \n "); 
			var numero2 = scanner.nextInt();  
			
			
			System.out.print("elija que operacion aritmetica desea reliazar (+,-,*,/) ");
			var op = scanner.next().charAt(0);
			
			switch(op)
			{
				case '+':
					System.out.print("el resulado de la suma es:   " + (numero1 + numero2) +"\n"); 
					break;
				case '-':
					System.out.print("el resulado de la resta es:   " + (numero1 - numero2)+"\n"); 
					break; 
					
				case '*':
					System.out.print("el resulado de la resta es:   " + (numero1 * numero2)+"\n"); 
					break; 
					
				case '/':
					System.out.print("el resulado de la resta es:   " + (numero1 / numero2)+"\n"); 
					break; 
			}
		} while (true);
	}
	
}

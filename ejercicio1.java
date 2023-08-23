
package ejercicios;

import java.util.Scanner; 
public class ejercicio1 {

	public static void main(String[] args)
	
	{
		
Scanner scanner = new Scanner(System.in); 
System.out.print ("ingrese un numero entre el 1 y el 100:\n"); 

int  numero = scanner.nextInt(); 
if (numero>100 || numero<1)   
{
System.out.print ("el numero ingresado no esta dentro de los parametros");
}
else
{
if (numero%2==0)
{
    System.out.print("el numero ingresado " + numero + " es par");
}
else 
{
     System.out.print("el numero  " + numero + " no es par"); 
}
   

}
	}

}



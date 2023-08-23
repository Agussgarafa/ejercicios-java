package ejercicios;
import java.util.Scanner; 
public class ejercicio3 {

	
	public static void main(String[] args)
	{
			boolean num = false;
			while(num == false) {
			Scanner scanner = new Scanner(System.in); 
			System.out.print ("ingrese un numero:\n"); 
			int  numero = scanner.nextInt(); 
			boolean primo = false;
			
			if (numero <=1)
			{
				primo= true; 
			}else {
				for(int i = 2; i * i <= numero; i++)
				{
					if (numero % i == 0)
					{
						primo = true;    
					}
				}
			}
			
			if(numero>100 && primo==true)
			{
				num = true;
				System.out.print("el numero que ingresaste es mayor a 100 y es primo");
			}
			
			}
	}
}



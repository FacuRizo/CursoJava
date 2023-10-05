package introduccion;

import java.util.Scanner;

public class Ejercicio1C 
{

	public static void main(String[] args) 
	{
		int numeroInicio=1;
		int numeroFinal=55;
		int counter =numeroInicio;		
		Scanner input = new Scanner(System.in);
		System.out.println("Seleccione:");
		System.out.println("a:Pares:");
		System.out.println("b:Impares:");			
		char c= input.next().charAt(0);
		switch (c)
		{
		case 'a':
			while(counter<=numeroFinal)
			{
			    boolean par = esPar(counter);
				if (par)
				{
					System.out.println(counter);
				}
				counter++;
			}
		break;		
		case 'b':
			while(counter<=numeroFinal)
			{
			    boolean par = esPar(counter);
				if (!par)
				{
					System.out.println(counter);
				}
				counter++;
			}
		break;	
		}
	input.close();	
	}
	
	private static boolean esPar (int num)
	{
		if (num % 2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}

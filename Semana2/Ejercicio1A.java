import java.util.Scanner;


public class Ejercicio1A 

{
    
    public static void  main (String[] args )
    {
        String palabra;
		char letra;
		char c[];
		int contador=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese palabra");
		palabra= input.nextLine();
		c= palabra.toCharArray();
		System.out.println("Ingrese letra");			
		letra= input.next().charAt(0);
		input.close();
		for (int i = 0; i < palabra.length(); i++) 
		{
			if (letra==c[i])
			{
				contador++;
			}
				
		}
		System.out.println("Se repite la letra " + letra + " en la Palabra " + palabra +" "+ contador + " veces");
	
	}
	


}

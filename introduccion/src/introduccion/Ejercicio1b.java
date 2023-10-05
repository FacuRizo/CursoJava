package introduccion;

public class Ejercicio1b 
{

	public static void main(String[] args) 
	{
		int numeroInicio =1;
		int numeroFinal = 25;
		int counter = numeroInicio;

		while (counter<= numeroFinal)
		{
			int modulo =counter % 2;
			if (modulo==0)
			{				
				System.out.println(counter);

			}
		counter++;

		}

	}

}
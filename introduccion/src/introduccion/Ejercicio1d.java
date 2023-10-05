package introduccion;

public class Ejercicio1d {

	public static void main(String[] args) 
	{
		int numeroInicio=1;
		int numeroFinal=55;
		boolean par;
		for  (int numeroFinal1=numeroFinal; numeroFinal1>numeroInicio; numeroFinal1--)
			
		{
			par=esPar(numeroFinal1);
			if (par)
				{
					System.out.println(numeroFinal1);
				}

		}
		

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

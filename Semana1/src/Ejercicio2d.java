

public class Ejercicio2d 
{

	public static void main(String[] args) 
	{
		float ingresos=490000;
		int cantVehic=0;
		int cantInmuebles=0;
		int activosSocietarios=0;	
		if ( (ingresos>=489083) || (cantVehic>=3) || 
				(cantInmuebles>=3) || (activosSocietarios>=1) )
		{
			System.out.println("Es Categoria IV");
		}
		else 
		{
			System.out.println("Pertenece a otra categoria");
		}
	}
		
}

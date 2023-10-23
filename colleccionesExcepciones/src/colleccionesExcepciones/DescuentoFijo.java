package colleccionesExcepciones;

public class DescuentoFijo extends Carrito

{

	public DescuentoFijo()
	{
		super();
		
	}
	
	@Override
	
	public float costoFinalConDesc (float costoFinal)
	{
		float res=0;
		try
		{
			if (costoFinal==0)
				{
				throw new IllegalArgumentException("No hay descuento, el precio final es 0");
				}
			else
			{
			
				res=costoFinal-this.getDescuento();			
				if (res<0)
				{
					throw new IllegalArgumentException("El costo debe ser positivo");
				}
				else
				{
					return res;
				}
			}
		}
			
		
		catch (Exception e)
		{
			System.err.println("hubo un error al calcular el costo final " + e.getMessage());
			return costoFinal;
		}
		

	}
	

}

package colleccionesExcepciones;

public class DescuentoPorcentual extends Carrito
{

	public DescuentoPorcentual() 
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
				res = costoFinal- (costoFinal* (this.getDescuento())/100);
			}
			if (res<0)
			{
				throw new IllegalArgumentException("El costo debe ser positivo");
			}
			else
			{
				return res;
			}		
		
		}
		catch (Exception e)
		{
			System.err.println("hubo un error al calcular el costo final " + e.getMessage());
			return costoFinal;
		}
	}
	


}

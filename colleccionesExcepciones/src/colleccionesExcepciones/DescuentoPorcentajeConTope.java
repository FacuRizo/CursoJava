package colleccionesExcepciones;

public class DescuentoPorcentajeConTope extends Carrito
{
	private int tope;
	
	public DescuentoPorcentajeConTope(int tope)
	{
		super();
		this.tope=tope;
		
	}
	public int getTope() 
	{
		return tope;
	}

	public void setTope(int tope)
	{
		this.tope = tope;
	}
	
	@Override
	
	public float costoFinalConDesc(float costoFinal)
	{
		
		try
		{
			if (costoFinal==0)
			{
				throw new IllegalArgumentException("No hay descuento, el precio final es 0");
			}
			else
			{
				float res=costoFinal- (costoFinal* (this.getDescuento())/100);
				int top=this.getTope();
					if ((costoFinal-res)<top)
						{
							return res;
						}
					else if (res<0)
					{				
						throw new IllegalArgumentException("El costo debe ser positivo");
					}
					else
					{
						return costoFinal-top;
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

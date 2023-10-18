package herencia;

public class DescuentoPorcentajeConTope extends Carrito
{
	private int tope;
	
	public DescuentoPorcentajeConTope(Producto producto1, Producto producto2, Producto producto3, int tope)
	{
		super(producto1, producto2, producto3);
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
		float res=costoFinal- (costoFinal* (this.getDescuento())/100);
		int top=this.getTope();
			if ((costoFinal-res)<top)
				{
					return res;
				}
			else
				return costoFinal-top;
		
		
	}

	

}

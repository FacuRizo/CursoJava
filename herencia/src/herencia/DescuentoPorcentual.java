package herencia;

public class DescuentoPorcentual extends Carrito
{

	public DescuentoPorcentual(Producto producto1, Producto producto2, Producto producto3) 
	{
		super(producto1, producto2, producto3);
		
	}
	
	@Override
	public float costoFinalConDesc (float costoFinal)
	{
		return costoFinal- (costoFinal* (this.getDescuento())/100);
	}
	


}

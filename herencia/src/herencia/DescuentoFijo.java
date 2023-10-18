package herencia;

public class DescuentoFijo extends Carrito

{

	public DescuentoFijo(Producto producto1, Producto producto2, Producto producto3)
	{
		super(producto1, producto2, producto3);
		
	}
	
	@Override
	
	public float costoFinalConDesc (float costoFinal)
	{
		return costoFinal-this.getDescuento();
	}
	

}

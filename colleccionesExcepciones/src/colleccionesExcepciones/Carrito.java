package colleccionesExcepciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
	

public class Carrito

{

	private List<Producto> prod;	
	private Date fechaCompra;
	private float descuento;
	//private boolean tieneDescuento;
	
	public Carrito ()
	{
		this.prod=new ArrayList<Producto>();
		this.fechaCompra=new Date();
		
	}
	
	public float getDescuento()
	{
		return descuento;
	}
	public Date getFechaCompra() 
	{
		return fechaCompra;
	}
	public List<Producto> getProductos()
	{
		return prod;
	}
	
	public void setDescuento (float desc)
	{
		this.descuento=desc;
	}
	
	public void agregarProducto (Producto producto)
	{
		this.prod.add(producto);
	}
	public void quitarProducto (Producto producto)
	{
		this.prod.remove(producto);
	}
	

	

	public float costoFinalSinDesc ()
	{		
		 float precioFinal=0;
		 float precioIndividual=0;
		 for(Producto prodt:this.prod)
		 {
			 precioIndividual=prodt.getPrecio();
			 precioFinal+=precioIndividual;
		 }	
		 
		 return precioFinal;
		 
		 
	}	
	
	public float costoFinalConDesc (float costoFinal)
	{
		 return costoFinal;
		 
	}	
	
	
	

}

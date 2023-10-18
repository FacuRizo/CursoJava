package herencia;

import java.util.Date;

public class Carrito

{

	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private Date fechaCompra;
	private float descuento;
	//private boolean tieneDescuento;
	
	public Carrito (Producto producto1, Producto producto2 , Producto producto3)
	{
		this.producto1=producto1;
		this.producto2=producto2;
		this.producto3=producto3;
		this.fechaCompra=new Date();
		
	}
	
	public float getDescuento()
	{
		return descuento;
	}
	
	
	
	public Producto getProducto1() 
	{
		return producto1;
	}

	
	public Producto getProducto2() 
	{
		return producto2;
	}

	
	public Producto getProducto3()
	{
		return producto3;
	}


	public Date getFechaCompra() 
	{
		return fechaCompra;
	}
	public void setDescuento (float desc)
	{
		this.descuento=desc;
	}
	
	
	public void setProducto1(Producto producto1) 
	{
		this.producto1 = producto1;
	}
	
	public void setProducto2(Producto producto2) 
	{
		this.producto2 = producto2;
	}

	public void setProducto3(Producto producto3)
	{
		this.producto3 = producto3;
	}

	public void setFechaCompra(Date fechaCompra) 
	{
		this.fechaCompra = fechaCompra;
	}
	
	public float costoFinal ()
	{		
		  
		 float precio1=this.producto1.getPrecio();
		 float precio2=this.producto2.getPrecio();
		 float precio3=this.producto3.getPrecio();
		 
		 return (precio1+precio2+precio3);
		 
		 
	}	
	
	public float costoFinalConDesc (float costoFinal)
	{
		 return costoFinal;
		 
	}	
	
	

}

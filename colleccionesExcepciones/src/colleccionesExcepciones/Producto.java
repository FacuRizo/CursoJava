package colleccionesExcepciones;

public class Producto 

{

	private String nombre;
	private String codigo;
	private float precio;
	
	public Producto (String nombre, String codigo, float precio)
	{
		this.nombre=nombre;
		this.codigo=codigo;
		this.precio=precio;
		
	}
	
	public  String getNombre()
	{
		return nombre;
	}
	
	public String getCodigo()	
	{
		return codigo;
	}
	
	public float getPrecio()
	{
		return precio;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}

	
	public void setCodigo(String codigo)
	{
		this.codigo=codigo;
	}
	
	public void setPrecio(float precio)
	{
		this.precio=precio;
	}
}
	
	
	/*public float costoFinal (float IVA)
	{
		float imp= IVA /100;
		
		return (precio * (1+imp));
	}*/

package testing;

public class CalculadoraOO 

{
	

	private double unNumero;
	private double  otroNumero;
	
	
	
	public CalculadoraOO ()
	{
		this.unNumero=0;
		this.otroNumero=0;
	}
	
	// Getter
	
	public double getUnNumero ()
	{
		return unNumero;
	}
	
	public double getOtroNumero ()
	{
		return otroNumero;
	}
	
	//Setter
	
	public void setUnNumero (double unNumero)
	{
		this.unNumero=unNumero;
	}
	
	public void setOtroNumero (double otroNumero)
	{
		this.otroNumero=otroNumero;
	}
	
	//Methods
	
	public double sumar (double unNumero , double otroNumero)
	{
		setUnNumero(unNumero);
		setOtroNumero(otroNumero);
		return this.unNumero+this.otroNumero;
	}
	
	public double restar (double unNumero , double otroNumero)
	{
		setUnNumero(unNumero);
		setOtroNumero(otroNumero);
		return this.unNumero-this.otroNumero;
	}
	
	public double multiplicar (double unNumero , double otroNumero)
	{
		setUnNumero(unNumero);
		setOtroNumero(otroNumero);
		return this.unNumero*this.otroNumero;
	}
	
	public double dividir (double unNumero , double otroNumero)
	{
		setUnNumero(unNumero);
		setOtroNumero(otroNumero);
		return this.unNumero/this.otroNumero;
	}







}

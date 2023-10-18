package herencia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestDescuentoFijo 
{
    private DescuentoFijo carro;
	private Producto prod1;
	private Producto prod2;
	private Producto prod3;
	private float val;
	
	public TestDescuentoFijo()
	{
		prod1=new Producto ("Jabon","123f",40);
		prod2=new Producto ("Esponja","124f",10);
		prod3=new Producto ("Chocolate","125f",100);
		carro= new DescuentoFijo(prod1,prod2,prod3);	
		val= carro.costoFinal();

		
		
	}
	@Test
	// con costo final sin desc equivalente a  150 y un descuento fijo de 20
	// resultado deberia dar 130
	void test1() 
	{
		carro.setDescuento(20);
		assertEquals(130,carro.costoFinalConDesc(val));
	}
	
	// Descuento fijo de 35, resultado deberia ser de 115, testeando de forma incorrecta
	@Test
	void test2()
	{
		carro.setDescuento(35);
		assertEquals(120,carro.costoFinalConDesc(val));
	}
	
	

}

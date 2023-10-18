package herencia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDescuentoPorcentaje
{
    private DescuentoPorcentual carro;
	private Producto prod1;
	private Producto prod2;
	private Producto prod3;
	private float val;
	
	public TestDescuentoPorcentaje()
	{
		prod1=new Producto ("Jabon","123f",40);
		prod2=new Producto ("Esponja","124f",10);
		prod3=new Producto ("Chocolate","125f",100);
		carro= new DescuentoPorcentual(prod1,prod2,prod3);	
		val= carro.costoFinal();

		
		
	}
	@Test
	// con costo final sin desc equivalente a  150 y un descuento  de 20 %
	// resultado deberia dar 120
	void test1() 
	{
		carro.setDescuento(20);
		assertEquals(120,carro.costoFinalConDesc(val));
	}
	
	// Descuento de 35%, resultado deberia ser de 97.5, testeando de forma incorrecta
	@Test
	void test2()
	{
		carro.setDescuento(35);
		assertEquals(100,carro.costoFinalConDesc(val));
	}
	
	

}
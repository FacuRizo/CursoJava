package herencia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDescuentoPorcentajeConTope {
    private DescuentoPorcentajeConTope carro;
	private Producto prod1;
	private Producto prod2;
	private Producto prod3;
	private float val;
	//private int tope;
	
	public TestDescuentoPorcentajeConTope()
	{
		prod1=new Producto ("Jabon","123f",40);
		prod2=new Producto ("Esponja","124f",10);
		prod3=new Producto ("Chocolate","125f",100);
		
		carro= new DescuentoPorcentajeConTope (prod1,prod2,prod3,0);	
		val= carro.costoFinal();

		
		
	}
	@Test
	// con costo final sin desc equivalente a  150 y un descuento de 20 % con tope max de 35
	// resultado deberia dar 120
	void test1() 
	{
		carro.setTope(35);
		carro.setDescuento(20);
		assertEquals(120,carro.costoFinalConDesc(val));
	}
	
	// Tope max de 22,con desc de 45% resultado deberia ser de 128, testeando de forma incorrecta
	@Test
	void test2()
	{
		carro.setTope(22);
		carro.setDescuento(45);
		assertEquals(100,carro.costoFinalConDesc(val));
	}
	
	

}

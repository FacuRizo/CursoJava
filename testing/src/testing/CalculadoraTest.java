package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest 
{
	@Test
	// 1. El resultado de multiplicar 80 por 3 da 240
	void test1() 
	{
		assertEquals(Calculadora.multiplicar(80, 3),240);
	}
	
	@Test
	// 2. El resultado de sumar 150 y 180, dividido por 3, da 110
	void test2()
	{
		assertEquals(Calculadora.dividir(Calculadora.sumar(150,180), 3),110);
	}
	
	@Test
	// 3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
	void test3()
	{
		double res=Calculadora.multiplicar(Calculadora.restar(90, 50), 15);
		
		assertFalse(res==605);
	}
	
	@Test
	//4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
	void test4()
	{
		double res= Calculadora.multiplicar(Calculadora.sumar(70,40),25);
		assertFalse(res==2700);
	}
	


}
	
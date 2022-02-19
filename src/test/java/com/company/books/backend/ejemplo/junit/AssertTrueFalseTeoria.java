package com.company.books.backend.ejemplo.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertTrueFalseTeoria {
	
	@Test
	public void test1() {
		assertTrue(true);
		assertFalse(false);
	}
	
	@Test
	public void test2() {
		
		boolean expresion = 4 == 4;
		boolean expresion2 = 4 == 3;
		assertTrue(expresion);
		assertFalse(expresion2);
	}
	
	
	@Test
	public void calculadoraTrueFalse() {
		
		Calculadora calc = new Calculadora();
		
		assertTrue(calc.sumar(1,1) == 2);
		assertTrue(calc.restar(4, 1) == 3);
		assertFalse(calc.multiplicar(3, 3)== 8);
		assertFalse(calc.dividir(4, 2) == 1);
		
	} 
	

}

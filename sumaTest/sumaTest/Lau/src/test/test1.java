package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import mipaquete.Resultado;

public class test1 {

	 Resultado r = new Resultado();
	   
	 @Before
	 public void setUp() {
		r.setNumeroUno(5);
		r.setNumeroDos(15);
	 }

	 @Test
	 public void testSuma() {
	   Assert.assertEquals(20, r.suma());
	   System.out.print( "lau está feliiz");

	 }

	}
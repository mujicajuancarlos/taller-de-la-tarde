package drcasa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EnfermedadTest {
	
	private Infecciosa malaria;
	private Persona frank;
	
	@Before
	public void inicializarEscenario(){
		//precondiciones
		Infecciosa malaria = new Infecciosa();
		Persona frank = new Persona();
		malaria.setCantidadDeCelulasAmenazadas(101);
		frank.setCantidadDeCelulasTotales(1000);
		
	}
	
	@Test
	public void unaEnfermedadInfecciosaEsAgresiva(){
		
		//se hace algo
		Boolean esAgresiva = malaria.esAgresiva(frank);
		//post condiciones
		Assert.assertTrue(esAgresiva);
	}
	@Test
	public void unaEnfermedadInfecciosaNoEsAgresiva(){
		malaria.setCantidadDeCelulasAmenazadas(100);
		//se hace algo
		Boolean esAgresiva = malaria.esAgresiva(frank);
		//post condiciones
		Assert.assertFalse(esAgresiva);
	}
}

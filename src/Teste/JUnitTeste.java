package Teste;
import Classes.Operacao;
import JSON.JSON;
import junit.framework.TestCase;

public class JUnitTeste extends TestCase{
	
	Operacao op = new Operacao();
	JSON json = new JSON();
	
	public void testMedia() {
		assertEquals(2.5, op.media(json.importa()));
	}
	
	public void testModa() {
		assertEquals(0.0, op.moda(json.importa()));
	}
	
	public void testMediana() {
		assertEquals(2.5, op.mediana(json.importa()));
	}
	
	public void testVariancia() {
		assertEquals(1.67, op.variancia(json.importa()));
		
	}
	
	public void testDesvio() {
		assertEquals(1.29, op.desvioPadrao(json.importa()));
	}

}

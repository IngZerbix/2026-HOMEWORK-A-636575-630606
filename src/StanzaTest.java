import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StanzaTest {

	@Test
	void testStanza() {
		Stanza aula = new Stanza("N11");
		assertEquals("N11", aula.getNome());
		
	}
	
	
	@Test
	void testAttrezzo() {
		Stanza aula = new Stanza("N11");
		Attrezzo banco = new Attrezzo("Banco",1);
		assertTrue(aula.addAttrezzo(banco));
	}



    @Test
    void testAdiacenza() {
    	Stanza aula = new Stanza("N11");
		Stanza corridoio = new Stanza("Corridoio");
		aula.impostaStanzaAdiacente("nord", corridoio);
		assertEquals(corridoio, aula.getStanzaAdiacente("nord"));
    } 
    
}
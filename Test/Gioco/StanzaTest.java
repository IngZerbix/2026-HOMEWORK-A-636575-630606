package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StanzaTest {

	@Test
	void testStanza() {
		//Stanza è la classe, aula è l'oggetto d tipo stanza
		Stanza aula = new Stanza("N11");
		assertEquals("N11", aula.getNome());
	}
	
	@Test
	void testAttrezzo() {
		//l'attrezzo lo crei per metterlo nella stanza
		Stanza aula = new Stanza("N11");
		Attrezzo banco = new Attrezzo("Banco", 1);
		aula.addAttrezzo(banco); // aggiungo nell'aula l'oggetto di classe attrezzo che è banco
		assertTrue(aula.addAttrezzo(banco)); //verifico se l'oggetto banco è stato aggiunto nell'aula
	}
	
	@Test
	void testStanzaAdiacente() {
		Stanza aula = new Stanza("N11");
		Stanza corridoio = new Stanza("Corridoio");
		aula.impostaStanzaAdiacente("nord", corridoio);
		assertEquals(corridoio, aula.getStanzaAdiacente("nord"));
								//riferimento all'oggetto.metodo
	}
	

}




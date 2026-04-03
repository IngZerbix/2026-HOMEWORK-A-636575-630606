package it.uniroma3.diadia;


import java.util.Scanner;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Classe principale di diadia, un semplice gioco di ruolo ambientato al dia.
 * Per giocare crea un'istanza di questa classe e invoca il metodo gioca
 *
 * Questa e' la classe principale crea e istanzia tutte le altre
 *
 * @author  docente di POO 
 *         (da un'idea di Michael Kolling and David J. Barnes) 
 *          
 * @version base
 */

public class DiaDia {

	static final private String MESSAGGIO_BENVENUTO = ""+
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chissa!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi raccoglierli, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ingraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";
	
	static final private String[] elencoComandi = {"vai", "aiuto", "fine"};

	private Partita partita;
	private Giocatore giocatore;

    
	public DiaDia() {
		this.partita = new Partita();
		this.giocatore=new Giocatore();
	}

	public void gioca() {
		String istruzione; 
		Scanner scannerDiLinee;

		System.out.println(MESSAGGIO_BENVENUTO);
		scannerDiLinee = new Scanner(System.in);		
		do		
			istruzione = scannerDiLinee.nextLine();
		while (!processaIstruzione(istruzione));
	}   
	
	//gli attrezzi presi vengono rimossi dalla stanza e aggiunti alla borsa
	public void prendi(String nomeAttrezzo) {
			Stanza stanzaCorrente = this.partita.getStanzaCorrente();
			Attrezzo attrezzoDaPrendere = stanzaCorrente.getAttrezzo(nomeAttrezzo);
			if(attrezzoDaPrendere!=null) {
				Borsa borsa = this.giocatore.getBorsa();
				if(borsa.addAttrezzo(attrezzoDaPrendere)) {
					//Se l'aggiunta ha successo (true), lo rimuovo dalla stanza
					stanzaCorrente.removeAttrezzo(attrezzoDaPrendere);
					System.out.println("Abbiamo raccolto l'attrezzo " + attrezzoDaPrendere);
				}
				else {
					System.out.println("Non puoi prendere questo attrezzo la borsa  è già piena!");
				}
			} else {
				//Se getAttrezzo aveva restituito null
				System.out.println("Attrezzo non presente in questa stanza.");
				
			}
	}
	
	//gli attrezzi posati vengono rimossi dalla borsa e aggiunti alla stanza
	public void posa(String nomeAttrezzo) {
		Stanza stanzaCorrente = this.partita.getStanzaCorrente();
		Borsa borsa = this.giocatore.getBorsa();
		Attrezzo attrezzoDaPosare = borsa.getAttrezzo(nomeAttrezzo);
		if(attrezzoDaPosare!=null) {
			
			if(stanzaCorrente.addAttrezzo(attrezzoDaPosare)) {
				borsa.removeAttrezzo(nomeAttrezzo);
				System.out.println("Hai posato: " + nomeAttrezzo);
			} else {
				System.out.println("Non c'é più spazio in questa stanza per posare oggetti!");
			}
		}
		else {
			System.out.println("L'attrezzo " + nomeAttrezzo + " non è nella borsa!");
		}
	}
	
	
	
	
	

	/**
	 * Processa una istruzione 
	 *
	 * @return true se l'istruzione e' eseguita e il gioco continua, false altrimenti
	 */
	private boolean processaIstruzione(String istruzione) {
		Comando comandoDaEseguire = new Comando(istruzione);

		if (comandoDaEseguire.getNome().equals("fine")) {
			this.fine(); 
			return true;
		} else if (comandoDaEseguire.getNome().equals("vai"))
			this.vai(comandoDaEseguire.getParametro());
		else if (comandoDaEseguire.getNome().equals("aiuto"))
			this.aiuto();
		else
			System.out.println("Comando sconosciuto");
		if (this.partita.vinta()) {
			System.out.println("Hai vinto!");
			return true;
		} else
			return false;
	}   

	// implementazioni dei comandi dell'utente:

	/**
	 * Stampa informazioni di aiuto.
	 */
	private void aiuto() {
		for(int i=0; i< elencoComandi.length; i++) 
			System.out.print(elencoComandi[i]+" ");
		System.out.println();
	}

	/**
	 * Cerca di andare in una direzione. Se c'e' una stanza ci entra 
	 * e ne stampa il nome, altrimenti stampa un messaggio di errore
	 */
	private void vai(String direzione) {
		if(direzione==null)
			System.out.println("Dove vuoi andare ?");
		Stanza prossimaStanza = null;
		prossimaStanza = this.partita.getStanzaCorrente().getStanzaAdiacente(direzione);
		if (prossimaStanza == null)
			System.out.println("Direzione inesistente");
		else {
			this.partita.setStanzaCorrente(prossimaStanza);
			int cfu = this.giocatore.getCfu();
			this.giocatore.setCfu(cfu-1);
		}
		System.out.println(partita.getStanzaCorrente().getDescrizione());
	}

	/**
	 * Comando "Fine".
	 */
	private void fine() {
		System.out.println("Grazie di aver giocato!");  // si desidera smettere
	}

	public static void main(String[] argc) {
		DiaDia gioco = new DiaDia();
		gioco.gioca();
	}
}
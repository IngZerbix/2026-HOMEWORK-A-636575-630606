package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

public class ComandoGuarda implements Comando {
	@Override
    public void esegui(Partita partita) {
        System.out.println(partita.getStanzaCorrente().getDescrizione());
        // Richiede che Partita abbia getGiocatore() e Giocatore abbia getCfu() e getBorsa()
        System.out.println("CFU rimanenti: " + partita.getGiocatore().getCfu());
        System.out.println(partita.getGiocatore().getBorsa().toString());
    }

    @Override
    public void setParametro(String parametro) { } // Nessun parametro per guarda

    @Override
    public String getNome() { return "guarda"; }

    @Override
    public String getParametro() { return null; }

}

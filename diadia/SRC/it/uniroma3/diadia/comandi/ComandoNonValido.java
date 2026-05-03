package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando {
	@Override
	public void esegui(Partita partita) {
		System.out.println("Comando sconosciuto o non valido!");
	}
	
	@Override
	public void setParametro(String Parametro) {
		
	}
	
	@Override
	public String getNome() {
		return "non valido";
	}
	
	@Override
	public String getParametro() {
		return null;
	}
}

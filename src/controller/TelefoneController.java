package controller;

import model.Fila;

public class TelefoneController {

	public TelefoneController() {
		super();
	}

	public void InsereLigacao(Fila f, String numero) {
		f.insert(numero);
	}

	public void ConsultaLigacoes(Fila f) {
		try {
			String telefone = (String) f.remove();
			System.err.println(telefone);
		} catch (Exception e) {
			System.err.println("Não há chamadas na fila");
		}
		
	}
}

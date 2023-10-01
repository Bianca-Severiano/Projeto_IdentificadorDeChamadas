package view;

import javax.swing.JOptionPane;

import controller.TelefoneController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		int r = 0;
		String numero;
		TelefoneController c = new TelefoneController();
		Fila<String> f = new Fila<>();
		
		do {
			r = Integer.parseInt(JOptionPane.showInputDialog("1- Incluir número \n 2 -Consulta Ligações \n 9- Sair"));

			switch (r) {
			case 1:{
				numero = JOptionPane.showInputDialog("Insira telefone para adicionar a fila: ");
				c.InsereLigacao(f, numero);
				break;
			}
			case 2: {
				c.ConsultaLigacoes(f);
				break;
			}
			}

		} while (r != 9);

	}

}

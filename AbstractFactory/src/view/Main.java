package view;

import javax.swing.JOptionPane;
import model.FactorySaudacao;
import model.Saudacao;

public class Main {

	public static void main(String[] args) {
				
		String nome;
		String genero;
		
		nome = JOptionPane.showInputDialog("Nome: ");
		genero = JOptionPane.showInputDialog("Gênero [M/F]: ").toUpperCase();
		
		FactorySaudacao fabrica = new FactorySaudacao();
		
		Saudacao msg = fabrica.getSaudacao(genero);
		
		JOptionPane.showMessageDialog(null, msg.mensagem() + nome);
		
		

	}

}

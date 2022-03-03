package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.FabricaNome;
import model.Nome;

public class Main {
	
	public static void Main(String[] args) {
		
		String entrada;
		
		ArrayList<String> listaEntrada = new ArrayList<String>();
		ArrayList<String> listaSaida = new ArrayList<String>();
				
		int continua = 0;
		
		while (continua == 0){
	
			entrada = JOptionPane.showInputDialog("Digite o nome: ");
			
			listaEntrada.add(entrada);
			
			FabricaNome fabrica = new FabricaNome(entrada);
			
			Nome n = fabrica.getNome(entrada);
			
			listaSaida.add(n.nome());
									
			Object[] options = { "Sim", "N�o" };
			
			
			
			continua = JOptionPane.showOptionDialog(null, "Deseja informar outro nome?", "Informa��o", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			}
				
		String registros = "";
		
		registros +="ENTRADA:"+"\n";
		for(String nome : listaEntrada){
			registros += nome+"\n";
			}
		
		registros +="\n"+"SA�DA:"+"\n";
		for(String nome : listaSaida){
			registros += nome+"\n";
			}
		JOptionPane.showMessageDialog(null, registros);
				
		}		
	}


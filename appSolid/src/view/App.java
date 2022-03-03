package view;

import model.*;

import javax.swing.*;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Professor professor = new Professor("Francisco José", "Rua 13 de maio, 100",
                "123.456.789-00", 5000.00,"Professor", new String[]{"Estrutura de Dados"});

        double salario = professor.getSalarioBase();

        CalculaAcrescimos acrescimos = new CalculaAcrescimos();
        double valorAcrescimo = acrescimos.calcAcrescimos(salario, 8, 120);

        CalculaDescontos descontos = new CalculaDescontos();
        double valorDesconto = descontos.calcDescontos(salario, 2, 30);

        CalculaSalarioMes salarioLiquido = new CalculaSalarioMes();
        double valorSalario = salarioLiquido.calcSalario(salario,valorAcrescimo, valorDesconto);

        DecimalFormat df = new DecimalFormat("#.##");

        JOptionPane.showMessageDialog(null,"Nome: "+professor.getNome()+"\n"+
                "Salario : "+df.format(valorSalario));

    }
}

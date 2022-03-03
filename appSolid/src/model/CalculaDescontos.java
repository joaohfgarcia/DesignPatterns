package model;

public class CalculaDescontos implements I_CalculaDescontos {

    @Override
    public double calcDescontos(double salarioBruto, int faltas, double adiantamento){
        float inss = (float)0.08;
        float irpf = (float)0.15;
        double descontosCaculados = 0;

        descontosCaculados = (salarioBruto*inss) + (salarioBruto*irpf) + (salarioBruto/30*faltas) + (adiantamento);

        return descontosCaculados;

    }

}

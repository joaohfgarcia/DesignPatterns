package model;

public class CalculaAcrescimos implements I_CalculaAcrescimos{

    @Override
    public double calcAcrescimos(double salarioBruto, int horasExtras, double gratificacoes){
        double acrescimosCaculados = 0;

        acrescimosCaculados = (salarioBruto/220*horasExtras) + (gratificacoes);

        return acrescimosCaculados;

    }
}

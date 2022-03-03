package model;

public class CalculaSalarioMes implements I_CalculaSalarioMes{

    @Override
    public double calcSalario(double salario, double acrescimos, double descontos){
        double salarioCalculado = 0;

        salarioCalculado = salario + acrescimos - descontos;

        return salarioCalculado;

    }

}

package model;

public class Funcionario {
    String nome;
    String endereco;
    String CPF;
    double salarioBase;
    String cargo;

    public Funcionario(String nome, String endereco, String CPF, double salarioBase, String cargo) {
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}

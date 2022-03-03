package model;

public class Professor extends Funcionario{
    String[] disciplinas;

    public Professor(String nome, String endereco, String CPF, double salarioBase, String cargo, String[] disciplinas) {
        super(nome, endereco, CPF, salarioBase, cargo);
        this.disciplinas = disciplinas;
    }

    public Professor(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }
}

package com.mycompany.matricula;

public class Funcionario extends Pessoa {

    private boolean trabalhando;
    private String setor;

    public Funcionario(String setor, String nome, int idade, String sexo, int numeroMatricula) {
        super(nome, idade, sexo, numeroMatricula);
        this.trabalhando = false;
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void baterPonto() {
        this.setTrabalhando(true);
        System.out.println(this.getNome() + " começou a trabalhar");
    }

    public void finalizarExpediente() {
        this.setTrabalhando(false);
        System.out.println(this.getNome() + " finalizou seu expediente");
    }
}

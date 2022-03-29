package com.mycompany.matricula;

public class Funcionario implements Pessoa {

    private String nome;
    private int idade;
    private boolean matricula;
    private int numeroMatricula;
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, int numeroMatricula, String setor) {
        this.nome = nome;
        this.idade = idade;
        this.setMatricula(true);
        this.numeroMatricula = numeroMatricula;
        this.setor = setor;
        this.setTrabalhando(false);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void baterPonto() {
        this.setTrabalhando(true);
        System.out.println("O funcionario começou a trabalhar!");
    }

    public void finalizarExpediente() {
        if (this.isTrabalhando() == true) {
            this.setTrabalhando(false);
            System.out.println(this.getNome() + " finalizou seu expediente");
        } else {
            System.out.println("Este funcionario não está trabalhando!");
        }
    }

    @Override
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
        System.out.println("Parabens, muitos anos de vida");
    }

}

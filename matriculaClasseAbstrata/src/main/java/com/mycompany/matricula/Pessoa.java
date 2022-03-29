package com.mycompany.matricula;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;
    private boolean matricula;
    private int numeroMatricula;

    public Pessoa(String nome, int idade, String sexo, int numeroMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.numeroMatricula = numeroMatricula;
        this.setMatricula(true);
    }

    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
        System.out.println("Parabens, muitos anos de vida!");
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean getMatricula() {
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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", matricula=" + matricula + ", numeroMatricula=" + numeroMatricula + '}';
    }

}

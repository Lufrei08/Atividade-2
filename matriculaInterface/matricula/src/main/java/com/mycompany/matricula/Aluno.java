package com.mycompany.matricula;

public class Aluno implements Pessoa {

    private String nome;
    private int idade;
    private boolean matricula;
    private int numeroMatricula;
    private String curso;
    private String periodo;

    public Aluno(String nome, int idade, int numeroMatricula, String curso, String periodo) {
        this.nome = nome;
        this.idade = idade;
        this.setMatricula(true);
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
        this.periodo = periodo;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
        System.out.println("Parabens, muitos anos de vida");
    }

    public void cancelarMatricula() {
        this.setMatricula(false);
        System.out.println("Matricula cancelada com sucesso!");
    }

    public void renovarMatricula() {
        this.setMatricula(true);
        System.out.println("Matricula renovada com sucesso!");
    }

}

package com.mycompany.matricula;

public class Aluno extends Pessoa {

    public String curso;
    public String periodo;

    public Aluno(String curso, String periodo, String nome, int idade, String sexo, int numeroMatricula) {
        super(nome, idade, sexo, numeroMatricula);
        this.curso = curso;
        this.periodo = periodo;
    }

    public void cancelarMatricula() {
        this.setMatricula(false);
        System.out.println("Matricula cancelada!");
    }

    public void renovarMatricula() {
        this.setMatricula(true);
        System.out.println("Matricula renovada com sucesso!");
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

}

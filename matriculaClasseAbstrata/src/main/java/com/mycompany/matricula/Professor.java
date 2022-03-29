package com.mycompany.matricula;

public class Professor extends Pessoa {

    private float salario;
    private String especialidade;

    public Professor(float salario, String especialidade, String nome, int idade, String sexo, int numeroMatricula) {
        super(nome, idade, sexo, numeroMatricula);
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public void consultarAluno(Aluno a1) {
        if (a1.getMatricula()==true) {
            System.out.println("Aluno:" + a1.getNome());
        System.out.println("Idade:" + a1.getIdade());
        System.out.println("Curso:" + a1.getCurso());
        System.out.println("Período:" + a1.getPeriodo());
        System.out.println("Status Matricula:" + a1.getMatricula());
        }
        else{
            System.out.println("Este aluno cancelou a matricula!");
        }
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

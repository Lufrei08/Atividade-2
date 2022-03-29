package com.mycompany.matricula;

public class Professor implements Pessoa {

    private String nome;
    private int idade;
    private boolean matricula;
    private int numeroMatricula;
    private float salario;
    private String especialidade;

    public Professor(String nome, int idade, int numeroMatricula, float salario, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.setMatricula(true);
        this.numeroMatricula = numeroMatricula;
        this.salario = salario;
        this.especialidade = especialidade;
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

    public void consultarAluno(Aluno a1) {
        if (a1.isMatricula() == true) {
            System.out.println("Aluno:" + a1.getNome());
            System.out.println("Idade:" + a1.getIdade());
            System.out.println("Curso:" + a1.getCurso());
            System.out.println("Período:" + a1.getPeriodo());
            System.out.println("Status Matricula:" + a1.isMatricula());
        } else {
            System.out.println("Este aluno cancelou a matricula!");
        }
    }

    public void aumentarSalario(float aumento) {
        this.setSalario(this.getSalario() + aumento);
        System.out.println("O professor " + this.getNome() + " teve seu salario aumentado para " + this.getSalario());
    }

    @Override
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
        System.out.println("Parabens, muitos anos de vida");
    }
}

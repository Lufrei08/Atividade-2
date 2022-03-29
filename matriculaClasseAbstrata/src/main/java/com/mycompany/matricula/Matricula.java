package com.mycompany.matricula;

public class Matricula {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("TSI", "3º", "Fulano", 20, "Masculino", 11111);
        Professor p1 = new Professor(20.000f, "Redes", "Ciclano", 40, "Masculino", 555555);
        Funcionario f1 = new Funcionario("RH", "Filisbina", 25, "Feminina", 33333);
        /*
        a1.cancelarMatricula();
        System.out.println(a1.toString());
        a1.renovarMatricula();
        System.out.println(a1.toString());
        *//*
        a1.cancelarMatricula();
        p1.consultarAluno(a1);
        a1.renovarMatricula();
        p1.consultarAluno(a1);
        *//*
        f1.baterPonto();
        f1.finalizarExpediente();
       */
    }
}

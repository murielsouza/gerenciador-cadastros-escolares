/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author lulves
 */
public class Matricula {
 protected Aluno aluno;
 protected Turma turma;
 
public Matricula (){

}
public Matricula(Aluno aluno, Turma turma) {
    this.aluno = aluno;
    this.turma = turma;
 }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Matricula{" + "aluno=" + aluno + ", turma=" + turma + '}';
    }
   
   

}

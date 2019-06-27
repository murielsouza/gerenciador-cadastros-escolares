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
public abstract class Turma {
 private int numero, qtVagas, qtAlunos;
 private Disciplina disciplina; 
 private String semestre;
 private Professor professor;
 private String horario;

    public Turma() {
        qtAlunos = 0;
    }

    public Turma(int numero, int qtVagas, Disciplina disciplina, String semestre, Professor professor, String horario) {
        this.numero = numero;
        this.qtVagas = qtVagas;
        qtAlunos = 0;
        this.disciplina = disciplina;
        this.semestre = semestre;
        this.professor = professor;
        this.horario = horario;
    }

    public int getNumero() {
        return numero;
    }

    public int getQtVagas() {
        return qtVagas;
    }

    public int getQtAlunos() {
        return qtAlunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getSemestre() {
        return semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getHorario() {
        return horario;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setQtVagas(int qtVagas) {
        this.qtVagas = qtVagas;
    }

    public void setQtAlunos(int qtAlunos) {
        this.qtAlunos = qtAlunos;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public abstract int verQuantVagasLivres();

    public abstract String cabecalhoDoDiario();


    @Override
    public String toString() {
        return "Turma "+ numero + " [" + semestre + "] -- Disciplina: " +disciplina.getNome() + ", Professor: " + professor.getNome() + ", Horário: " + horario + ", Qtd Vagas: " + qtVagas + ", Qtd Matriculados: " + qtAlunos;
    }
 

}

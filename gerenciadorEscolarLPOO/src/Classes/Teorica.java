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
public class Teorica extends Turma {
    protected int numSala;

    public Teorica() {
     }

    public Teorica(int numero, int qtVagas,  Disciplina disciplina, String semestre, Professor professor, String horario, int numSala) {
        super(numero, qtVagas, disciplina, semestre, professor, horario);
        this.numSala = numSala;
     }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }
    
    public int verQuantVagasLivres(){
        return getQtVagas() - getQtAlunos();
    }
    public String cabecalhoDoDiario(){
        return "Turma: " + getNumero() + " Disciplina: " + getDisciplina().getNome() + " Professor: " + getProfessor().getNome()
                + " Semestre: " + getSemestre() + " Horário: " + getHorario() + " Nº sala: " + numSala;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nº Sala: " + numSala ;
    }
    
    

  
    
    
}

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
public class Pratica extends Turma {
 protected String nomeLab;

    public Pratica() {
    }

    public Pratica(int numero, int qtVagas, Disciplina disciplina, String semestre, Professor professor, String horario, String nomeLab) {
        super(numero, qtVagas, disciplina, semestre, professor, horario);
        this.nomeLab = nomeLab;
    }

    public String getNomeLab() {
        return nomeLab;
       // ACHO EU QUE NOA PRECISA RETORNAR AS PARADAS E HERDADAS, CONFERIR COM MURIEL 
    }

    public void setNomeLab(String nomeLab) {
        this.nomeLab = nomeLab;
    }
    
 @Override
     public int verQuantVagasLivres(){
        return getQtVagas() - getQtAlunos();
    }
    public String cabecalhoDoDiario(){
        return "Turma: " + getNumero() + " Disciplina: " + getDisciplina().getNome() + " Professor: " + getProfessor().getNome()
                + " Semestre: " + getSemestre() + " Horário: " + getHorario() + " Nome Labin: " + nomeLab;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nome Laboratorio: " + nomeLab ;
    }
// ACREDITO EU QUE FALTE UM SUPER AQUI, MAS NÃO TO LEMBRANDO COMO É A FORMA CERTA DE COLOCAR E TO COM PREGUIÇA DE 
    // ABRIR OUTROS PROJETOS PRA VER, VEJO ISSO MAIS TARDE *** NAO ESQUECER 
    
}

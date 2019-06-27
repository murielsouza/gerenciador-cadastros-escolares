/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Muriel
 */
public class Aluno extends Pessoa{
    private String tipoIngresso;
    private int anoIngresso;

    public Aluno() {
    }

    
    public Aluno(long cgu, String nome, Curso curso, String tipoIngresso, int anoIngresso) {
        super(cgu, nome, curso);
        this.tipoIngresso = tipoIngresso;
        this.anoIngresso = anoIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public String toString() {
        return  super.toString() + " Tipo de Ingresso: " + tipoIngresso + " Ano do Ingresso: " + anoIngresso ;
    }
    
    
    
    
    
}
   
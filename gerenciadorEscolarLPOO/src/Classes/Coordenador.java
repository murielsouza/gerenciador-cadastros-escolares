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
public class Coordenador extends Professor{
    private double gratificacao;

    public Coordenador() {
    }

    public Coordenador(long cgu, String nome, Curso curso,int cargaHoraria, double gratificacao) {
        super(cgu, nome, curso, cargaHoraria);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + gratificacao;
    }

    @Override
    public String toString() {
        return "Coordenador{" + super.toString() + " Gratificacao: " + gratificacao + '}';
    }
    
    
    
    
    
    
}

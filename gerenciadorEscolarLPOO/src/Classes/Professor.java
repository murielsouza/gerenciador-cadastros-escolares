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
public class Professor extends Pessoa{
    private int cargaHoraria;
    private static double valorHoraAula;

    public Professor() {
    }

    public Professor(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor(long cgu, String nome, Curso curso,int cargaHoraria) {
        super(cgu, nome, curso);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public static double getValorHoraAula() {
        return valorHoraAula;
    }

    public static void setValorHoraAula(double valorHoraAula) {
        Professor.valorHoraAula = valorHoraAula;
    }
    
    public double calcularSalario(){
        return valorHoraAula*cargaHoraria;
    }

    @Override
    public String toString() {
        return "Professor: " + super.toString() + " - Carga Horaria: " + cargaHoraria ;
    }
    
    
      

  
    
    
}

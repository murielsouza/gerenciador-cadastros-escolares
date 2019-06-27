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
public class Curso {
    private int codigo;
    private double valorCredito;
    private String nome, areaConhecimento;
/** -----------------------------------------CONSTRUTORES----------------------------------------------------------------*/
    public Curso(){
    }

    public Curso(int codigo, double valorCredito, String nome, String areaConhecimento) {
        this.codigo = codigo;
        this.valorCredito = valorCredito;
        this.nome = nome;
        this.areaConhecimento = areaConhecimento;
    }
    
/** -----------------------------------------GETS----------------------------------------------------------------*/
    public int getCodigo() {
        return codigo;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public String getNome() {
        return nome;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }
    
/** -----------------------------------------SETS----------------------------------------------------------------*/
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    @Override
    public String toString() {
        return  "Codigo: " + codigo + " Valor do Credito: " + valorCredito + " Nome: " + nome + " Area de Conhecimento: " + areaConhecimento ;
    }
    
}


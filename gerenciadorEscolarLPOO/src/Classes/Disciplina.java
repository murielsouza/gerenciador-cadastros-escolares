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
public class Disciplina implements IDisciplina {
 private int codigo, QTCredito;
 private String nome;
 private Curso curso;
 
public Disciplina(){
}
 public Disciplina(int Codigo, int QTCredito, String nome, Curso curso) {
    this.codigo = Codigo;
    this.QTCredito = QTCredito;
    this.nome = nome;
    this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQTCredito() {
        return QTCredito;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCodigo(int Codigo) {
        this.codigo = Codigo;
    }

    public void setQTCredito(int QTCredito) {
        this.QTCredito = QTCredito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public double verValorPagar(){
        return (curso.getValorCredito())*QTCredito;
    }

    @Override
    public String toString() {
        return "Disciplina " + codigo +"-- " + " Nome: " + nome + ", Curso: " + curso.getNome() + ", Qtd Créditos: " + QTCredito;
    }
    

}

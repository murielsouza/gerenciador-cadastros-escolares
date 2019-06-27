/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


public class Pessoa {
    private long cgu;
    private String nome;
    private Curso curso;

    public Pessoa() {
    }

    public Pessoa(long cgu, String nome, Curso curso) {
        this.cgu = cgu;
        this.nome = nome;
        this.curso = curso;
    }

    public long getCgu() {
        return cgu;
    }

    public void setCgu(int cgu) {
        this.cgu = cgu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "CGU:" + cgu + " Nome:" + nome + " Curso:" + curso.getNome() ;
    }
    
}

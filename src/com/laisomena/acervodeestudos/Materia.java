package com.laisomena.acervodeestudos;

import java.util.ArrayList;

public class Materia {
    private int codigo;
    private String nome;
    private String sigla;
    private ArrayList<Assunto> listaAssuntos;

    public Materia() {

    }

    public Materia(int codigo, String nome, String sigla) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
        listaAssuntos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Assunto> getListaAssuntos() {
        return listaAssuntos;
    }

    public void setListaAssuntos(ArrayList<Assunto> listaAssuntos) {
        this.listaAssuntos = listaAssuntos;
    }

    public void addAssunto(Assunto A) {
        A.setMateria(this);
        listaAssuntos.add(A);
    }
}

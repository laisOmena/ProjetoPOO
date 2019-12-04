package com.laisomena.acervodeestudos.model;

import com.laisomena.acervodeestudos.model.Assunto;

import java.util.ArrayList;

public class Materia {
    private int codigo;
    private String nome;
    private ArrayList<Assunto> listaAssuntos;

    public Materia() {
        listaAssuntos = new ArrayList<Assunto>();
    }

    public Materia(String nome) {
        this.nome = nome;
        listaAssuntos = new ArrayList<Assunto>();
    }

    public Materia(int codigo, String nome) {
        this.setCodigo(codigo);
        this.nome = nome;
        listaAssuntos = new ArrayList<Assunto>();
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return this.nome;
    }
}

package com.laisomena.acervodeestudos.model;

public class Assunto {
    private String titulo;
    private Materia materia;

    public Assunto (String titulo, Materia materia) {
        this.titulo = titulo;
        this.setMateria(materia);
    }

    public Assunto () {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setNome(String titulo) {
        this.titulo = titulo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }


}
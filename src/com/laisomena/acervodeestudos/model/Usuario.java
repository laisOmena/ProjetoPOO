package com.laisomena.acervodeestudos.model;

public class Usuario extends Pessoa {
    private String senha;

    public Usuario() {

    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public String logar(String email, String senha) {
        if (this.email.equals(email) & this.senha.equals(senha)) {
            return " ";
        } else {
            return "Email ou senha incorreto, tente novamente!";
        }
    }

    public String cadastrar(String email, String senha) {
        this.email = email;
        this.senha = senha;
        return "Cadastro completo";
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

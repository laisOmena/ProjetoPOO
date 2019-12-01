package com.laisomena.acervodeestudos;

public class Main {
    public static void main(String[] args) {
        Usuario a = new Usuario();

        String cadastrado = a.cadastrar("david@email.com", "123");

        System.out.println(a.toString());

        System.out.println(cadastrado);
    }
}

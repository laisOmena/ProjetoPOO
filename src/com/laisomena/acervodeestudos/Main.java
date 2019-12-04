package com.laisomena.acervodeestudos;

import com.laisomena.acervodeestudos.controller.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario a = new Usuario();

        String cadastrado = a.cadastrar("david@email.com", "123");

        System.out.println(a.toString());

        System.out.println(cadastrado);
    }
}

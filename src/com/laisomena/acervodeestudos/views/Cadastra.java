package com.laisomena.acervodeestudos.views;

import com.laisomena.acervodeestudos.controller.Usuario;

import javax.swing.*;

public class Cadastra {

    public static void main(String[] args) {

        String user = "";
        String password = "";

        Usuario usuarioMock = new Usuario();
        usuarioMock.setEmail("admin");
        usuarioMock.setSenha("kaka");

        do {
            int opcao = 0;
            if (opcao == JOptionPane.YES_OPTION) {
                String lista = "";
                //SEGUNDA TELA de escolha (MATERIA)
                Object[] opcoes2 = {"Cadastrar", "Logar"};
                opcao = JOptionPane.showOptionDialog(null, "Escolha uma opcao:", "Acervo de Estudos",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes2, null);

                if (opcao == JOptionPane.YES_OPTION) {
                    String cadastroLogin = (String) JOptionPane.showInputDialog(null, "Digite o seu email:", "CADASTRANDO --- CADASTRO",
                            JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (cadastroLogin == null) {
                        System.exit(0);
                    }
                    password = (String) JOptionPane.showInputDialog(null, "Digite sua senha:", "CADASTRANDO  |  senha",
                            JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (password == null) {
                        System.exit(0);
                    }
                }
            }

        } while (!user.equals(usuarioMock.getEmail()) || !password.equals(usuarioMock.getSenha()));

    }
}
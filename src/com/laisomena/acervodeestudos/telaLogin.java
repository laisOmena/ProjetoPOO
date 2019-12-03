package com.laisomena.acervodeestudos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Label;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class telaLogin extends JFrame {

    private JPanel contentPane;
    private JTextField c_usuario;
    private JTextField c_senha;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    telaLogin frame = new telaLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public telaLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
            }
        });
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel t_usuario = new JLabel("Usu\u00E1rio");
        t_usuario.setBounds(98, 82, 69, 20);
        contentPane.add(t_usuario);

        c_usuario = new JTextField();
        c_usuario.setBounds(161, 79, 170, 26);
        contentPane.add(c_usuario);
        c_usuario.setColumns(10);

        JLabel t_senha = new JLabel("Senha");
        t_senha.setBounds(98, 121, 69, 20);
        contentPane.add(t_senha);

        c_senha = new JTextField();
        c_senha.setBounds(161, 115, 170, 26);
        contentPane.add(c_senha);
        c_senha.setColumns(10);

        JButton btn_login = new JButton("Login");
        btn_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn_login.setBounds(216, 188, 115, 29);
        contentPane.add(btn_login);

        JButton btn_cadastrar = new JButton("Cadastrar");
        btn_cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btn_cadastrar.setBounds(86, 188, 115, 29);
        contentPane.add(btn_cadastrar);

        JLabel lblBemvindoAoPrograma = new JLabel("Bem-Vindo ao programa!");
        lblBemvindoAoPrograma.setBounds(121, 16, 186, 20);
        contentPane.add(lblBemvindoAoPrograma);
    }
}


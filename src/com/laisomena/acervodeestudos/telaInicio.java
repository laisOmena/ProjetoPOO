package com.laisomena.acervodeestudos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class telaInicio extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    telaInicio frame = new telaInicio();
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
    public telaInicio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnMatria = new JMenu("Mat\u00E9ria");
        menuBar.add(mnMatria);

        JMenuItem mntmCadastra = new JMenuItem("Cadastrar");
        mntmCadastra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        mnMatria.add(mntmCadastra);

        JMenuItem mntmNewMenuItem = new JMenuItem("Listar");
        mnMatria.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Excluir");
        mnMatria.add(mntmNewMenuItem_1);

        JMenu mnAssunto = new JMenu("Assunto");
        menuBar.add(mnAssunto);

        JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
        mnAssunto.add(mntmCadastrar);

        JMenuItem mntmListar = new JMenuItem("Listar");
        mnAssunto.add(mntmListar);

        JMenuItem mntmExcluir = new JMenuItem("Excluir");
        mnAssunto.add(mntmExcluir);

        JMenu mnUsurio = new JMenu("Usu\u00E1rio");
        menuBar.add(mnUsurio);

        JMenuItem mntmAlterarDados = new JMenuItem("Alterar Dados");
        mnUsurio.add(mntmAlterarDados);

        JMenuItem mntmVerDados = new JMenuItem("Ver Dados");
        mnUsurio.add(mntmVerDados);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel t_acervo_estudos = new JLabel("ACERVO DE ESTUDOS");

        JLabel t_desenvolvido_por = new JLabel("desenvolvido por Jamile e La\u00EDs");
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(133, Short.MAX_VALUE)
                                .addComponent(t_desenvolvido_por)
                                .addContainerGap())
                        .addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
                                .addGap(126)
                                .addComponent(t_acervo_estudos)
                                .addContainerGap(129, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(81, Short.MAX_VALUE)
                                .addComponent(t_acervo_estudos)
                                .addGap(66)
                                .addComponent(t_desenvolvido_por)
                                .addContainerGap())
        );
        contentPane.setLayout(gl_contentPane);
    }
}


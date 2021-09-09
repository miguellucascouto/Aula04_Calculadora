/*

MIGUEL LUCAS COUTO - 6° TADS | POO_2
Calculadora

 */




package br.com.pitagoras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class Calculadora {
    private JTextField jLabelResultado;
    private JLabel jLabelValorA;
    private JLabel jLabelValorB;

    private JTextField jTextFieldValorA;
    private JTextField jTextFieldValorB;

    private JButton jButtonAdd;
    private JButton jButtonSub;
    private JButton jButtonMul;
    private JButton jButtonDiv;
    private JButton jButtonClear;

    public Calculadora() {
        JFrame jFrameTelaPrincipal = new JFrame("Calculadora Simples");
        jFrameTelaPrincipal.setLayout(null);
        jFrameTelaPrincipal.setSize(300, 400);

        // Componentes Layout
        jLabelResultado = new JTextField("Informe os valores para realizar a operação");
        jLabelResultado.setEditable(false);
        jLabelValorA = new JLabel("1° Num:");
        jLabelValorB = new JLabel("2° Num:");

        jTextFieldValorA = new JTextField();
        jTextFieldValorB = new JTextField();

        jButtonAdd = new JButton("+");
        jButtonSub = new JButton("-");
        jButtonMul = new JButton("*");
        jButtonDiv = new JButton("/");
        jButtonClear = new JButton("Limpar");

        jLabelResultado.setBounds(10, 10, 390, 20);
        jLabelResultado.setBackground(new Color(100, 231, 212, 168));

        jLabelValorA.setBounds(10, 30, 50, 20);
        jTextFieldValorA.setBounds(65, 30, 190, 20);


        jLabelValorB.setBounds(10, 55, 50, 20);
        jTextFieldValorB.setBounds(65, 55, 190, 20);


        jButtonAdd.setBounds(60,  80, 45, 45);
        jButtonSub.setBounds(110, 80, 45, 45);
        jButtonMul.setBounds(160, 80, 45, 45);
        jButtonDiv.setBounds(210, 80, 45, 45);

        jButtonClear.setBounds(60, 135, 200, 50);

        jButtonClear.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        acaoBotaoLimpar();
                    }
                }
        );

        jButtonAdd.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
//                       acaoBotaoAdd();
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );

        jButtonSub.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
//                        acaoBotaoSub();
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );

        jButtonMul.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
//                        acaoBotaoMult();
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );

        jButtonDiv.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
//                        acaoBotaoDiv();
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );



        jFrameTelaPrincipal.add(jLabelResultado);
        jFrameTelaPrincipal.add(jLabelValorA);
        jFrameTelaPrincipal.add(jTextFieldValorA);
        jFrameTelaPrincipal.add(jLabelValorB);
        jFrameTelaPrincipal.add(jTextFieldValorB);
        jFrameTelaPrincipal.add(jButtonAdd);
        jFrameTelaPrincipal.add(jButtonSub);
        jFrameTelaPrincipal.add(jButtonMul);
        jFrameTelaPrincipal.add(jButtonDiv);
        jFrameTelaPrincipal.add(jButtonClear);
        jFrameTelaPrincipal.setResizable(false);
        jFrameTelaPrincipal.setVisible(true);
        jFrameTelaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
// Lógica de operações
    private void executarOperacao(String actionCommand) {
        BigDecimal valorA = new BigDecimal(jTextFieldValorA.getText());
        BigDecimal valorB = new BigDecimal(jTextFieldValorB.getText());
        BigDecimal resultado;
        switch (actionCommand) {
            case "+":
                resultado = valorA.add(valorB);
                jLabelResultado.setText("" + resultado);
                break;
            case "-":
                resultado = valorA.subtract(valorB);
                jLabelResultado.setText("" + resultado);
                break;
            case "*":
                resultado = valorA.multiply(valorB);
                jLabelResultado.setText("" + resultado);
                break;
            case "/":
                resultado = valorA.divide(valorB);
                jLabelResultado.setText("" + resultado);
                break;
        }
    }


    private void acaoBotaoLimpar() {
        jLabelResultado.setText("Informe os valores para realizar a operação");
        jTextFieldValorA.setText("");
        jTextFieldValorB.setText("");
    }
}

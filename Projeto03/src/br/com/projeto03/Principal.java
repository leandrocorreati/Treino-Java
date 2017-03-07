package br.com.projeto03;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
//        String qtFormasTxt;
//        int qtFormas = Integer.parseInt(qtFormasTxt);
//        JOptionPane.showInputDialog("Quantas formas deseja criar ? ");
//        int n[] = {3,3,3};
        float raio;
        float base;
        float altura;
        float lado;
        
        int qtFormas = Integer.parseInt(JOptionPane.showInputDialog("Quantas formas deseja criar ? "));
        Object[] formas = {"Circulo", "Retangulo", "Quadrado"};
        Object selecione = JOptionPane.showInputDialog(null, "Escolha uma Forma", "Opções: ",
                JOptionPane.INFORMATION_MESSAGE, null, formas, formas[0]);
        String tipoForma = selecione.toString();
        
        switch (tipoForma) {
            case "Circulo":
                /*JOptionPane.showMessageDialog(null, "Você escolheu um " + tipoForma);*/
                raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Você escolheu um " + tipoForma + "\nInforme o valor do raio:", "RAIO", JOptionPane.QUESTION_MESSAGE));
                Circulos c = new Circulos(raio); // raio do circulo
                c.calcPerimetro();
                c.calcArea();
                break;
            case "Retangulo":/*JOptionPane.showMessageDialog(null, "Você escolheu um " + tipoForma);*/
                base = Float.parseFloat(JOptionPane.showInputDialog(null, "Você escolheu um " + tipoForma + " \nInforme a base: ", "BASE", JOptionPane.QUESTION_MESSAGE));
                altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a altura:", "ALTURA", JOptionPane.QUESTION_MESSAGE));
                Retangulos r = new Retangulos(base, altura); // altura e base
                r.calcPerimetro();
                r.calcArea();
                break;
            case "Quadrado":
                /*JOptionPane.showMessageDialog(null, "Você escolheu um " + tipoForma);*/
                lado = Float.parseFloat(JOptionPane.showInputDialog(null, "Você escolheu um " + tipoForma + " \nInforme a medida dos lados: ", "LADO", JOptionPane.QUESTION_MESSAGE));
//                JOptionPane.showInputDialog(null, "Informe a altura:", "ALTURA", JOptionPane.QUESTION_MESSAGE);
                Quadrados q = new Quadrados(lado); // apenas um lado
                q.calcPerimetro();
                q.calcArea();
                break;
        }
//        JOptionPane.showInputDialog(null,"O sistema apresentou um erro favor verificar:", "ALERTA",JOptionPane.QUESTION_MESSAGE,  );
//        JOptionPane.showMessageDialog(/*parametro para definir o tamanho da caixa de alerta, o null defini como padrão*/null,
//                                        /*parametro para definir o texto que é mostrado no conteúdo do caixa de alerta*/"alerta",
//                                        /*parametro para definir o texto que é mostrado no cabeçalho da caixa de alerta*/"alerta cabeçalho", 
//                                        /*parametro para definir o icone que aparece*/JOptionPane.ERROR_MESSAGE);
    }
}

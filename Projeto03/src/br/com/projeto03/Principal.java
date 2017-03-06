
package br.com.projeto03;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class Principal
{
    public static void main(String[] args) 
    {
//        String qtFormasTxt;
//        int qtFormas = Integer.parseInt(qtFormasTxt);
//        JOptionPane.showInputDialog("Quantas formas deseja criar ? ");
//        int n[] = {3,3,3};
        
        int qtFormas = Integer.parseInt(JOptionPane.showInputDialog("Quantas formas deseja criar ? "));
        Object[] formas = {"Circulo", "Triangulo", "Quadrado"};
        Object selecione = JOptionPane.showInputDialog(null,"Escolha uma Forma", "Opções: ", 
                           JOptionPane.INFORMATION_MESSAGE,null,formas,formas[0]);
        
        JOptionPane.showInputDialog(null,JOptionPane.QUESTION_MESSAGE,null);
        
         JOptionPane.showMessageDialog(/*parametro para definir o tamanho da caixa de alerta, o null defini como padrão*/null,
                                        /*parametro para definir o texto que é mostrado no conteúdo do caixa de alerta*/"alerta",
                                        /*parametro para definir o texto que é mostrado no cabeçalho da caixa de alerta*/"alerta cabeçalho", 
                                        /*parametro para definir o icone que aparece*/JOptionPane.ERROR_MESSAGE);
          
    }
}

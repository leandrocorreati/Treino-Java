package br.com.projeto07;

import java.util.Scanner;

public class Exercicio01 
{
    public float calcPerimetro(float ladoA, float ladoB, float ladoC)
    {
        float p = ladoA + ladoB + ladoC;
        return p;
    }
    
    public float calcArea(float ladoA, float ladoB, float ladoC)
    {
        float a = ladoA * ladoB;
        return a  ;
    }
    
    public static void principal(String[] args) 
    {
        // instancia do objeto da classe Exercicio01
        Exercicio01 e = new Exercicio01();
        // declaração de variaveis que armazenam o valor dos lados
        float a,b,c;
        // instancia de objeto da classe Scanner para ler teclado
        Scanner teclado = new Scanner(System.in);
        // inserção dos valores dos lados
        System.out.println("Digite o valor do lado A");
        a = teclado.nextFloat();
        System.out.println("Digite o valor do lado B");
        b = teclado.nextFloat();
        System.out.println("Digite o valor do lado C");
        c = teclado.nextFloat();
        // estrutura para verificar tipo do triangulo
        if((a != b)&& (a != c)&& (b!=c))
        {
            System.out.println("O triangulo é ESCALENO");
        }
        else if((a == b) && (a == c)&& (c == b))
        {
            System.out.println("O triangulo é EQUILATERO");
        }
        else
        {
            System.out.println("O triangulo é ISOCELES");
        }
        System.out.println("=======================================");
        System.out.print("O perimetro do triangulo é : ");
        System.out.println(e.calcPerimetro(a, b, c));
        System.out.print("A área do triangulo é : ");
        System.out.println(e.calcArea(a, b, c));
        System.out.println("");
    }
}

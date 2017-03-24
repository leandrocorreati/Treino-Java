package br.com.projeto09;

import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        String vpessoas[] = new String[3];
        int vidades[] = new int[3];
        int cont = 0;
        for (int i = 0; i < 3; i++) 
        {
            cont++;
            System.out.print("Digite o " + cont + "º nome: ");
            vpessoas[i] = teclado.next();
            System.out.print("Digite a idade da  " + cont + "º pessoa: ");
            vidades[i] = teclado.nextInt();
        }
        if((vidades[0] > vidades[1]) && (vidades[0] > vidades[2]))
        {
            System.out.println("A Pessoa mais velha é: " + vpessoas[0]);
        }
        else if((vidades[1] > vidades[0]) && (vidades[1] > vidades[2]))
        {
            System.out.println("A Pessoa mais velha é: " + vpessoas[1]);
        }
        else
            System.out.println("A Pessoa mais velha é: " + vpessoas[2]);
    }
}

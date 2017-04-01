package br.com.projeto22;

import java.util.Scanner;

public class MediaAluno 
{
    private int notas[] = new int[3];
    public void addNota()
    {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        for(int i = 0; i <notas.length; i++)
        {
            cont++;
            System.out.print("Qual a " + cont +"º nota: ");
            notas[i]= teclado.nextInt();
        }
    }
    public double calcMedia()
    {
        double media = (notas[0] + notas[1] +notas[2])/3;
        return media;
    }
}


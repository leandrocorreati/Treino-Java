
package br.com.projeto07;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio02 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner (System.in);
        LinkedList l = new LinkedList();
        System.out.println("Quantas cartas deseja que componham o baralho ?");
        int qt = teclado.nextInt();
        
        String vetor[] = new String[qt];
        
        int cont = 1;
        for(int i = 0; i < qt; i ++)
        {
           System.out.print("Digite a letra da carta #" + cont++ + ": ");
           vetor[i] = teclado.next();
        }
        
        for(int j = 0; j < qt; j ++)
        {
            cont++;
            if (cont % 2 != 0)
            {
             l.remove(vetor[j]); 
            }
        }
        for(int j = 0; j< qt; j++)
        {
            System.out.print(vetor[j]+" ");
        }
        System.out.print("\n");
        
    }
}

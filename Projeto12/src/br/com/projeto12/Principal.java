package br.com.projeto12;

import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        int saldo = t.nextInt();
        int credito = 0;
        if (saldo <=200)
        {
            credito = 0;
        }
        if ((saldo >201) && (saldo <= 400))
        {
            credito = (saldo / 100) * 20;
        }
        else if ((saldo >401)&& (saldo <=600))
        {
            credito = (saldo / 100) * 30;
            
        }
        else if(saldo>600)
         {
            credito = (saldo / 100) * 40;
                }
        System.out.println("O saldo médio é: " + saldo + "\nO valor do crédito é: " + credito);
                
                
}
}
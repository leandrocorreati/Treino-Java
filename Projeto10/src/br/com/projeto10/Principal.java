package br.com.projeto10;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float cFabrica, cConsumidor, pDistribuidor, pImpostos;
        System.out.println("Qual o custo de fabrica de um veiculo ? ");
        cFabrica = teclado.nextInt();
        pDistribuidor = cFabrica * 0.28f;
        pImpostos = cFabrica * 0.45f;
        cConsumidor = cFabrica + pDistribuidor + pImpostos;
        System.out.println("O custo final ao consumidor é : " + cConsumidor);
    }
}

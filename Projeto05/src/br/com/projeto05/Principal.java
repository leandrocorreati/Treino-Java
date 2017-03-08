package br.com.projeto05;

import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Qual tipo de lâmpada deseja construir / Digite 'I' para incandescente ou 'F' para fluorescente ?");
        String tipo = teclado.nextLine();
        FabricaLampada r = new FabricaLampada();
        if(tipo == "I")
        {
            r.construir(tipo);
            System.out.println(r.construir("Incandescente"));
        }
        if (tipo == "F")
        {
            System.out.println(r.construir("Fluorescente"));
        }
        
    }
}

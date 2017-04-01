package br.com.projeto17;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        ControleRemoto cr = new ControleRemoto(0,0);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deseja aumentar(+) ou diminuir(-)");
        String sair = null ;
        while (sair != "s")
        {
            String escolha = teclado.next();
            cr.controleVolume(escolha);
            cr.volumeEcanalAtual();
        }
    }
}

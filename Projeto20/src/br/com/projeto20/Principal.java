package br.com.projeto20;
public class Principal
{
    public static void main(String[] args)
    {
        int x = 0, impar = 0;
        int i, mp, si, totalPar;
        Long par = new Long(0);
        for (i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                if (i > 2) {
                    par = par * i;
                } else {
                    par = new Long(i);
                }
            } else {
                impar = impar + i; //este deu certo: 225  
            }
        }
        System.out.println("Soma dos ímpares é: " + impar);
        System.out.println("Multiplicação dos pares é: " + par);
    }
}

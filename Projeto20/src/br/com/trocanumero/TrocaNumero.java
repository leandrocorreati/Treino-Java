package br.com.trocanumero;

public class TrocaNumero 
{
    public int troca(int numA, int numB)
    {
        int a, b;
        a = numB;
        b = numA;
        numA = a;
        numB = b;
        System.out.println(numA + " - " + numB);
        return 0;
    }
}

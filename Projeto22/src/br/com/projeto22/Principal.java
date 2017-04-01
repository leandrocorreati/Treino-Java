package br.com.projeto22;
public class Principal
{
    public static void main(String[] args)
    {
        MediaAluno m = new MediaAluno();
        m.addNota();
        System.out.println(m.calcMedia());
    }
}

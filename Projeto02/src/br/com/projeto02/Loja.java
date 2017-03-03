
package br.com.projeto02;

public class Loja
{
    public static void main(String[] args) 
    {
        Livros l = new Livros("Universidade Hacker", 33.00f,"Leandro Correa", 0000234);
        System.out.println(l.toString());
        
        System.out.println("================================================");
        
        CDs c = new CDs("Jay Z: The Best of Jay Z", 56.00f, 14, 939);
        System.out.println(c.toString());
        
        System.out.println("================================================");
        
        DVDs d = new DVDs("Ultimato Bourne", 19.99f, 2, 939);
        System.out.println(d.toString());
        
        System.out.println("================================================");
        
        Livros l2[] = new Livros[5];
        l2[0] = new Livros("Redes Completo", 45.98f, "Tanebaum", 9888);
        l2[1] = new Livros("Segurança da Informação", 98.98f, "Tanebaum", 9888);
        l2[2] = new Livros("AngularJS", 120.98f, "Google Books", 9888);
        l2[3] = new Livros("NodeJS", 200.99f, "Marcio knorth", 9888);
        l2[4] = new Livros("Desenvolvimento Integrado", 50.00f, "Leandro Correa", 9888);
        
        
        for (int index = 0; index < 5; index ++)
        {
//            System.out.println(l2[index]);
            String teste = l2[index].getNome();
            if ("NodeJS".equals(teste))
            {
                System.out.println(" O item buscado está na posição: " + index );
            }
        }
        
//        if (c.getCodigoBarra()== d.getCodigoBarra()) 
//        {
//            System.out.println("Iguais");
//        } 
//        else 
//        {
//            System.out.println("Diferentes");
//        }
          System.out.println(c.comparacao(l));
          
    }
}

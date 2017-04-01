package br.com.projeto11;
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args)
    {
        int qthabitantes, idade, cont = 0;
        String sexo, corCabelo, corOlhos;
        float porcentagemMulheres, somaMulheres = 0;
        int maiorIdade = 0; // variável para armazenar a maior idade do vetor
        int posicaoDoMaior = -1; // variável para armazenar a posição da maior idade no vetor
      
        // Scanner usado para receber entradas dos usuários
        Scanner teclado = new Scanner(System.in);
        
        // Quantidade de habitantes a serem pesquisados ( tamanho do vetor )
        System.out.print("Digite a quantidade de habitantes a serem avaliados: ");
        // Leitura do teclado
        qthabitantes = teclado.nextInt();
        
        // Instanciamento do objeto Habitante e definição de um vetor recendo como tamanho o valor de habitantes a serem pesquisados
        Habitante[] h = new Habitante[qthabitantes];
//        Habitante[] h;
//        h = new Habitante[qthabitantes];
        for(int index = 0; index < qthabitantes; index ++)
        {
            cont++;
            System.out.println("Digite o dados do habitante Nº " + cont);
            System.out.println("Qual o sexo ? / [ m ou f ]");
            sexo = teclado.next();
            System.out.println("Qual a cor dos olhos ? / [ azuis, verdes, castanhos ]");
            corOlhos = teclado.next();
            System.out.println("Qual a cor dos cabelos ? / [ louros, castanhos, pretos ]");
            corCabelo = teclado.next();
            System.out.println("Qual a idade ?");
            idade = teclado.nextInt();
            h[index] = new Habitante(sexo, corCabelo, corOlhos, idade);
        }
        for (int i = 0; i < qthabitantes; i++) 
        {
            if (h[i].getIdade() > maiorIdade)
            {
                maiorIdade = (int) h[i].getIdade();
                posicaoDoMaior = i--;
            }
        }
        for (int i = 0; i < qthabitantes; i++) 
        {
            if ( ("f".equals(h[i].getSexo())) && ((h[i].getIdade() >= 18) && (h[i].getIdade() <= 35)) && ("verdes".equals(h[i].getCorOlhos())) && ("louros".equals(h[i].getCorCabelo())) )
            {
                somaMulheres ++;
            }
        }
        porcentagemMulheres = (somaMulheres/ qthabitantes) * 100;
        System.out.println("O maior idade encontrada foi "+maiorIdade+" na posição "+(posicaoDoMaior + 1));
        System.out.println("A porcentagem de individuos que se encaixam nas caracteristicas é de: " + porcentagemMulheres +"%");
        }
}

package br.com.projeto04.aplicacao;

import br.com.projeto04.dominio.Contato;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* */
public final class AplAgenda 
{
    private static final Scanner scanner = new Scanner(System.in);
    
    /* Onde são mantidos os contatos*/
    private static List contatos = new ArrayList();
    
    /* Adiciona um contato*/
    private static void adicionarContato(Contato contato)
    {
        contatos.add(contato);
    }
    /* Obtém um contato, dado o indice */
    private static Contato obterContato(int indice)
    {
        if (indice < contatos.size()) return(Contato)contatos.get(indice);
        else return null;
    }
    
    /* */
    private static void imprimirContatos()
    {
        if (contatos.size()== 0)System.out.println("\tAgenda vazia");
        else for (int i = 0; i < contatos.size(); i++)
        {
            Contato contato = (Contato)contatos.get(i);
            System.out.println("\t"+ i + " : " + contato.getNome() + " (" + contato.getTipo() + " )");
        }
        System.out.println();
    }
    
    /*Lê do teclado*/
    private static String lerTeclado()
    {
        return scanner.nextLine();
    }
    
    /* Método principal*/
    public static void main(String[] args) 
    {
        System.out.println("Bem vindo a Agenda.\n");
        System.out.println("Digite o comando. '?' para ajuda e 'S' para sair.");
        System.out.println("\n");
        
        // Lê o comando
        String comando = lerTeclado();
        
        // Continua pedindo comandos até encontrar o comando S, de sair.
        while(! "S".equalsIgnoreCase(comando))
        {
            if("?".equals(comando))
            {
                System.out.println(""
                        + "\n===COMANDOS DISPONIVEIS:\n"
                        + "?: Mostra está lista de comandos; \n \n"
                        + "A: Mostra a agenda; \n"
                        + "C: Mostra um contato da agenda; \n"
                        + "S: Sai do programa; \n\n"
                        + "+T: Adiciona um telefone; \n");
            }
            //Comando A : mostrar agenda
            else if ("A".equalsIgnoreCase(comando))
            {
                System.out.println("\nAGENDA");
                imprimirContatos();
            }
            //Comando C : mostrar contato
            else if ("C".equalsIgnoreCase(comando))
            {
                executarMostrarContato();
            }
            //Comando +T: adicionar telefone.
            else if ("+T".equalsIgnoreCase(comando))
            {
                executarAdicionarTelefone();
            }
            // Lê o proximo comando
            System.out.println("\n>");
            comando = lerTeclado();
        }
        
    }
    public static void executarMostrarContato()
    {
        // Lê o indice.
        System.out.println("\nNúmero: ");
        String indice = lerTeclado();
        
        // Verifica se é um número.
        if(indice.matches("[0-9]+"))
        {
            //Converte para inteiro.
            int i = Integer.parseInt(indice);
            
            //Verifica se o indice existe.
            if(i<contatos.size())
            {
                // Imprime o contato.
                Contato contato = (Contato)contatos.get(i);
                System.out.println(""
                        + "\nNome: "+contato.getNome() + 
                        "\n" + contato.getTipo() + " : " + contato.getContato());
            }
            // Não existe.
            else System.out.println("Agenda não contém item de número " + i);
        }
        // Não é número.
        else System.out.println("Não é um número");
    }
    //Comando +T: Adicionar telefone.
    public static void executarAdicionarTelefone()
    {
        System.out.println("Digite o nome do contato:");
        String nome = scanner.nextLine();
        System.out.println("Digite o número que deseja incluir");
        String tel = scanner.nextLine();
        String pessoa = tel + " " + nome;
        contatos.add(pessoa);
    }
}

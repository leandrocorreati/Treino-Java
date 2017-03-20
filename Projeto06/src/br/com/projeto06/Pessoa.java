package br.com.projeto06;
public class Pessoa 
{
    private String nome;
    public Pessoa(String nome)
    {
        this.nome=nome;
    }
    @Override
    public  String toString()
    {
        return "Nome: " + nome;
    }
}

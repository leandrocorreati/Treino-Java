package br.com.projeto02;

public final class Livros extends Produtos
{
    private String autor;

    public Livros(String nome, float preco, String autor, int codigoBarra) 
    {
       this.setNome(nome);
       this.setAutor(autor);
       this.setPreco(preco);
       this.setCodigoBarra(codigoBarra);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() 
    {
        return "Autor: " + autor + "\nNome do Livro: " + this.getNome() + "\nPreço R$: " + this.getPreco();
    }
    
    
}

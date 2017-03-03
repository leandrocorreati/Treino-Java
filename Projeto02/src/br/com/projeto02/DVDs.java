package br.com.projeto02;

public final class DVDs extends Produtos
{
    private int duracao;

    public DVDs(String nome, float preco, int duracao, int codigoBarra) 
    {
        this.setDuracao(duracao);
        this.setNome(nome);
        this.setPreco(preco);
        this.setCodigoBarra(codigoBarra);
    }
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() 
    {
        return "Nome do Filme: " + this.getNome() + "\nDuracao: " + this.duracao +" Horas" + " \nPreço R$: " + this.getPreco() ;
    }
    
    
}

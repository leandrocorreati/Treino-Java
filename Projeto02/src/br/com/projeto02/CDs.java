package br.com.projeto02;

public final class CDs extends Produtos
{
    private int numeroFaixas;

    public CDs(String nome, float preco, int numeroFaixas, int codigoBarra) 
    {
        this.setNome(nome);
        this.setNumeroFaixas(numeroFaixas);
        this.setPreco(preco);
        this.setCodigoBarra(codigoBarra);
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() 
    {
        return "Nome do Artista e CD: " + this.getNome() + "\nNumero de Faixas= " + numeroFaixas + "\nPreço R$: " + this.getPreco();
    }
    
}

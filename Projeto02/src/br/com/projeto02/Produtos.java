package br.com.projeto02;
public class Produtos 
{
    private String nome;
    private float preco;
    private int codigoBarra;
    
    
    
    

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() 
    {
        return "Produtos{" + "nome=" + nome + ", preco=" + preco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

//    @Override
    public boolean comparacao(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        final Produtos other = (Produtos) obj;
        if (this.codigoBarra != other.codigoBarra) {
            return false;
        }
        return true;
    }

    
    
    
}

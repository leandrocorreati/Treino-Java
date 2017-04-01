package br.com.projeto16;

public class Elevador
{
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int qtPessoas;
    
    public void inicializa(int capacidadeElevador, int totalAndares)
    {
        setQtPessoas(0);
        setAndarAtual(0);
    }
    
    public void entra()
    {
        if (getCapacidadeElevador()< getQtPessoas())
        {
            setQtPessoas(getQtPessoas()+1);
        }
    }

    public void sai()
    {
        if (getQtPessoas() > 0)
        {
            setQtPessoas(getQtPessoas() - 1);
        }
    }
    
    public void sobe()
    {
        if(getAndarAtual()== getTotalAndares())
        {
            setAndarAtual(getAndarAtual()-1);
        }
    }
    public void desce()
    {
        if(getAndarAtual()== 0)
        {
            setAndarAtual(getAndarAtual()+1);
        }
    }
       
    
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQtPessoas() {
        return qtPessoas;
    }

    public void setQtPessoas(int qtPessoas) {
        this.qtPessoas = qtPessoas;
    }
    
}

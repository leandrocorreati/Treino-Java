package br.com.projeto03;
public class Quadrados extends Quadrilateros
{
    private float tLado;

    public Quadrados(float tLado) 
    {
        this.tLado = tLado;
        setLado1(tLado);
        setLado2(tLado);
        setLado3(tLado);
        setLado4(tLado);
    }
    public float gettLado() {
        return tLado;
    }

    public void settLado(float tLado) {
        this.tLado = tLado;
    }
    
    
    
}

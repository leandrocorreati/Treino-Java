package br.com.projeto03;
public class Quadrados extends Quadrilateros
{
    private float tLado;

    public Quadrados(float tLado) 
    {
        this.tLado = tLado;
        this.setLado1(tLado);
        this.setLado2(tLado);
        this.setLado3(tLado);
        this.setLado4(tLado);
    }
    public float gettLado() {
        return tLado;
    }

    public void settLado(float tLado) {
        this.tLado = tLado;
    }
}

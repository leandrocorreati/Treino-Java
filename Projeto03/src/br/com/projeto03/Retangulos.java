package br.com.projeto03;
public class Retangulos extends Quadrilateros
{
    private float tBase;
    private float tAltura;

    public Retangulos(float tBase, float tAltura) 
    {
        this.tBase = tBase;
        this.tAltura = tAltura;
        this.setLado1(tBase);
        this.setLado2(tAltura);
        this.setLado3(tBase);
        this.setLado4(tAltura);
    }
    public float gettBase() {
        return tBase;
    }

    public void settBase(float tBase) {
        this.tBase = tBase;
    }

    public float gettAltura() {
        return tAltura;
    }

    public void settAltura(float tAltura) {
        this.tAltura = tAltura;
    }
}

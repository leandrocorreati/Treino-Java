package br.com.projeto03;
public class Retangulos extends Quadrilateros
{
    private float tBase;
    private float tAltura;

    public Retangulos(float tBase, float tAltura) 
    {
        this.tBase = tBase;
        this.tAltura = tAltura;
        setLado1(tBase);
        setLado2(tAltura);
        setLado3(tBase);
        setLado4(tAltura);
        
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

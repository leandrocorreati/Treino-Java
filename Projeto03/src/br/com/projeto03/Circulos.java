package br.com.projeto03;
public class Circulos implements CalcForma
{
    private float raio;

    public Circulos(float raio) 
    {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public void calcPerimetro() 
    {
        float circunferencia = 2 * 3.14f * getRaio();
        System.out.printf("%f",+circunferencia);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcArea() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

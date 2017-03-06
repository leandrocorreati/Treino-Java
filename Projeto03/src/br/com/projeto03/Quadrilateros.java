
package br.com.projeto03;

public abstract class Quadrilateros implements CalcForma//Sabemos que o quadrado é um quadrilátero com todos os lados congruentes (com a mesma medida).
{
    private float lado1;
    private float lado2;
    private float lado3;
    private float lado4;
    
    public void Quadrilateros(float lado1, float lado2, float lado3, float lado4)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
                
    }

    @Override
    public void calcPerimetro() 
    {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

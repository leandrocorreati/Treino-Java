package br.com.projeto03;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

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
        DecimalFormat d = new DecimalFormat("0.00");
        float circunferencia = 2 * 3.14f * getRaio();
//        System.out.println(d.format(circunferencia));
        JOptionPane.showMessageDialog(null, "A circunferencia da figura é " + d.format(circunferencia),"CIRCUNFERENCIA DO CIRCULO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void calcArea() 
    {
        DecimalFormat d = new DecimalFormat("0.00");
        float area = 3.14f * (getRaio()*getRaio());
        JOptionPane.showMessageDialog(null,"A área do circulo é " + d.format(area),"ÁREA DO CIRCULO",JOptionPane.INFORMATION_MESSAGE);
    }
    
}

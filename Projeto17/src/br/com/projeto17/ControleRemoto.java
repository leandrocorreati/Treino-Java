package br.com.projeto17;
public class ControleRemoto extends Televisao
{

    public ControleRemoto(int volume, int canal) {
        super(volume, canal);
    }
    public void controleVolume(String op)
    {
        if(op == "-")
        {
            setVolume(getVolume()-1);
        }
        else
        setVolume(getVolume()+1);
    }
    public void controleCanal()
    {
        setCanal(getCanal()+1);
    }
    public void volumeEcanalAtual()
    {
        System.out.println(getCanal()+ getVolume());
    }
}

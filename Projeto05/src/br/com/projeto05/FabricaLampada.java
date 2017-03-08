package br.com.projeto05;

public class FabricaLampada  //OBS: UMA CLASSE ABSTRATA NÃO PODE SE INSTANCIADA, ENQUANTO UMA CLASSE FINEL NÃO PODE RECEBER HERANÇA
                             //OBS: POLIMORFISMO SE TRATA DA ALTERAÇÃO DAS AÇÕES DE UM METODO RECEBIDO POR HERANÇA MANTENDO SUA ASSINATURA
        
{
    private String tipo;
    
        public String construir(String tipo)
        {
            this.tipo = tipo;
            
            return tipo;
        }
        
    public class Incandescente implements Lampada
    {
        @Override
        public void ligar() 
        {
            System.out.println("Está ligada");
        }

        @Override
        public void desligar() 
        {
            System.out.println("Está desligada");
        }
    }
    
    public class Fluorescente implements Lampada
    {
        @Override
        public void ligar() 
        {
            System.out.println("Está ligada");
        }

        @Override
        public void desligar() 
        {
            System.out.println("Está desligada");
        }
    }
}

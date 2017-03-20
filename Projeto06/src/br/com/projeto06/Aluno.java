package br.com.projeto06;
public class Aluno extends Pessoa
{
    private int matricula;
    public Aluno(String nome, int matricula) 
    {
        super(nome);
        this.matricula = matricula;
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nMatricula: " + matricula;
    }

    public int getMatricula() 
    {
        return matricula;
    }

    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }
    
}


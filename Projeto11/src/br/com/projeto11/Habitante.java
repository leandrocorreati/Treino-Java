
package br.com.projeto11;

public class Habitante
{
    private String sexo;
    private String corCabelo;
    private String corOlhos;
    private int idade;

    public Habitante(String sexo, String corCabelo, String corOlhos, int idade)
    {
        this.setSexo(sexo);
        this.setCorCabelo(corCabelo);
        this.setCorOlhos(corOlhos);
        this.setIdade(idade);
    }
    
    
    public String todosHabitantes() {
        return "Sexo: " + this.getSexo() + "\nCor do Cabelo: " + this.getCorCabelo() + "\nCor dos Olhos: " + this.getCorOlhos() + "\nIdade: " + getIdade();
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}

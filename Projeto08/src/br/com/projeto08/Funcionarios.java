package br.com.projeto;
public class Funcionarios 
{
    private int rg;
    private String sexo;
    private int cpf;
    private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private int id;
    private int numDependentes;

    public Funcionarios(int rg, String sexo, int cpf, String nome, int idade, double salario, String cargo, int id, int numDependentes) 
    {
        this.rg = rg;
        this.sexo = sexo;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
        this.id = id;
        this.numDependentes = numDependentes;
    }

    public double calcularInss(double novoSalario)
    {
        if (this.getSalario() <= 1500) 
        {
            novoSalario = this.getSalario() - (this.getSalario()*0.08);
        }
        else if ((this.getSalario() > 1500)&&(this.getSalario()<= 2500))
        {
            novoSalario = this.getSalario()- (this.getSalario()* 0.09);
        }
        else if (this.getSalario()> 2500)
        {
            novoSalario = this.getSalario() - (this.getSalario() * 0.11);
        }

       return novoSalario;
    }
    
    public double calcularIRF(double irfSalario)
    {
        if ((this.calcularInss(getSalario())>1000)&& (this.calcularInss(getSalario()) < 2800))
        {
            irfSalario = this.calcularInss(getSalario()) - (this.calcularInss(getSalario()) * 0.07);
        }
        if( (this.calcularInss(getSalario()) >= 2800) && (this.calcularInss(getSalario()) < 3700))
        {
            irfSalario = this.calcularInss(getSalario()) - (this.calcularInss(getSalario()) * 0.15);
        }
        if ( (this.calcularInss(getSalario()) >= 3700) && (this.calcularInss(getSalario()) <4600))
        {
            irfSalario = this.calcularInss(getSalario()) - (this.calcularInss(getSalario()) * 0.22);
        }
        if ( (this.calcularInss(getSalario()) >4600))
        {
            irfSalario = this.calcularInss(getSalario()) - (this.calcularInss(getSalario()) * 0.27);
        }
        return irfSalario;
    }
    
     public String mostrarHolerite() 
    {
        return "ID: " + getId() + " Nome do Funcionario: "+ this.getNome() 
                + "\nSexo: "+ this.getSexo() 
                + " CPF: "+ this.getCpf() 
                + " \nidade: "+ this.getIdade() 
                + " Salario com deconto Inss: "+ calcularInss(this.getSalario())  + " \nSalario com deconto IRF: " + this.calcularIRF(calcularInss(getSalario())) + " \nDespesas Convenio médico: " + calculoConvenioMedico();
    }
    
    public double calculoConvenioMedico()
    {
        double valorConvenio;
        valorConvenio = 50 + (50 * getNumDependentes());
        return valorConvenio;
    }
    
    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }
    
   

    
}

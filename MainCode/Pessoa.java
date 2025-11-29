import java.util.ArrayList;

public abstract class Pessoa {

    protected String nome;
    protected double idade;
    protected String cpf;
    protected String numero;

    public Pessoa(){ //Construtor vazio
    }

    public Pessoa(String nome, double idade, String cpf){ //Construtor All args
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }

    //Get e Set
    public String getNome(){
        return nome ;
    }
    public void setNome (String nome){
        this.nome=nome;
    }

    public double getIdade(){
        return idade;
    }
    public void setIdade(double idade){
        this.idade=idade;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
}

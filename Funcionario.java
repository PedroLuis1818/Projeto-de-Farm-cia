public class Funcionario extends Pessoa{
    private Double salario;
    private String cargo;

    //Construtor vazio
    public Funcionario(){
    }

    //Construtor all args
    public Funcionario(Double salario, String cargo){
        this.salario=salario;
        this.cargo=cargo;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }

    public String getCargo (){
        return cargo;
    }
    public void setCargo(String cargo){this.cargo=cargo;}

    public void SolicitarTrocaDeCargo(){

    }

    public void AtualizarEstoque(){

    }

}

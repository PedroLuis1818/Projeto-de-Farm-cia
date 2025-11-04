import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {

    private boolean temCartaoFidelidade;
    public ArrayList<String> carrinho = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public Cliente(){
    }

    public Cliente(boolean temCartaoFidelidade){
        this.temCartaoFidelidade=temCartaoFidelidade;
    }

    public boolean getTemCartaoFidelidade(){
        return temCartaoFidelidade;
    }

    public void AdicionarAoCarrinho(String produto){
        carrinho.add(produto);
    }

    public void RemoverDoCarrinho(String produto){//Há algum problema nessa função que ainda nn consegui resolver
        for (int i = 0; i < (carrinho.size())-1 ; i++){
            if (carrinho.get(i) == produto){
                carrinho.remove(i);
            }
            else{
                System.out.println("Não há esse produto no carrinho");
            }
        }
    }

    public void FazerCartaoFidelidade(String nome, double idade, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
        System.out.println("Cadastro concluido!");
    }

}

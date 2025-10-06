import java.util.ArrayList;
public class Cliente extends Pessoa{
    private boolean temCartaoFidelidade;
    private ArrayList <String> carrinho;

    public Cliente(boolean temCartaoFidelidade){
        this.temCartaoFidelidade=temCartaoFidelidade;
    }

    public boolean getTemCartaoFidelidade(){
        return temCartaoFidelidade;
    }

    public void ComprarRemedio(){

    }

    public void AdicionarAoCarrinho(){

    }

    public void FazerCartaoFidelidade(){

    }

    public void CancelarCartaoFidelidade(){

    }

}

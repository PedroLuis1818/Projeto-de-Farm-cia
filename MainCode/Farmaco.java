import java.io.*;

public class Farmaco {
    public String nome;
    public String marcaProdutora;
    public double massaLiquida;
    public double concentracao;
    public int quantiaEstoque;
    public double preco;
    public String descricao;

    //Construtor vazio
    public Farmaco(){
    }

    //Construtor all args
    public Farmaco(String nome, String marcaProdutora, double massaLiquida, double concentracao, int quantiaEstoque, double preco, String descricao){
        this.nome = nome;
        this.marcaProdutora = marcaProdutora;
        this.massaLiquida = massaLiquida;
        this.concentracao = concentracao;
        this.quantiaEstoque = quantiaEstoque;
        this.preco = preco;
        this.descricao = descricao;
    }

    public void SalvarFarmaco(String caminho){
        try{
            FileWriter escrever = new FileWriter(caminho, true);//"append true" faz com que ele escreva a partir da ultima linha

            escrever.write(
                    "Nome: "+nome+"\n"+
                    "Marca: "+marcaProdutora+"\n"+
                    "Massa líquida: "+massaLiquida+"g"+"\n"+
                    "Concentração: "+concentracao+"mg/ml"+"\n"+
                    "Quantia em estoque: " +quantiaEstoque+"\n"+
                    "Preço(R$): "+preco+"\n"+
                    "Descrição: "+descricao+"\n"+"-------------------"+"\n"+"");
            escrever.close();

            System.out.println("Remédio salvo com sucesso!"+"\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}

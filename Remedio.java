public class Remedio {
    public String tipo;
    public String marca;
    public double massaLiquida;
    private int quantiaEstoque;
    private double preco;

    //Construtor vazio
    public Remedio(){
    }

    //Construtor all args
    public Remedio(String tipo, String marca, double massaLiquida, int quantiaEstoque, double preco){
        this.tipo = tipo;
        this.marca = marca;
        this.massaLiquida = massaLiquida;
        this.quantiaEstoque = quantiaEstoque;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantiaEstoque() {
        return quantiaEstoque;
    }

    public void setQuantiaEstoque(int quantiaEstoque) {
        this.quantiaEstoque = quantiaEstoque;
    }

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manipulador implements Manipulacao {

    public static void Reescrever(String selecao, String caminho, String mensagem){
        try{
            FileWriter editar = new FileWriter(caminho);

            editar.write(selecao);

            editar.close();

            System.out.println(mensagem);

        }catch (IOException e){
            throw new RuntimeException();
        }
    }

    public boolean Ler(String caminho){
        boolean listaVazia = true;
        try {
            FileReader leitor = new FileReader(caminho);
            BufferedReader buffLeitor = new BufferedReader(leitor);
            String linha;

            while ((linha = buffLeitor.readLine()) != null){
                System.out.println(linha);
                listaVazia = false;
            }
            if(listaVazia){
                System.out.println("? Nenhum fármaco foi cadastrado."+"\n");
            }

            buffLeitor.close();
            leitor.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listaVazia;
    }

    public static void MensagemErro(boolean encontrado){
        if (encontrado == false) {
            System.out.println("X Não foi possivel achar o fármaco." + "\n");
        }
    }
}

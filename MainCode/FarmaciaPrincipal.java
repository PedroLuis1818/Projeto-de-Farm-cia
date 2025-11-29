import java.io.*;
import java.util.Scanner;

public class FarmaciaPrincipal {
    public static void main(String[] args) {

        final String CAMINHO = "lista_farmacos";

        System.out.println("-----------------------------");
        System.out.println(" FARMÁCIA VIRTUAL ");
        System.out.println("-----------------------------");

        Scanner input = new Scanner(System.in);
        Filtro filtro = new Filtro();

        while (true) {
            System.out.println("1 - Acessar como funcionário");
            System.out.println("2 - Acessar como cliente");
            System.out.println("0 - Finalizar programa");

            int opc = filtro.FiltragemInt(input, "Digite apenas os numerais inteiros disponíveis!");

            //Loop do menu de funcionário
            if (opc == 1) {//1
                boolean i = true;

                while (i) {
                    System.out.println(" MENU FUNCIONÁRIO ");
                    System.out.println("1 - Adicionar remédios à lista");
                    System.out.println("2 - Ver lista completa");
                    System.out.println("3 - Editar remédios");
                    System.out.println("4 - Excluir remédios");
                    System.out.println("0 - Sair");

                    Manipulador listador = new Manipulador();
                    int escolha = filtro.FiltragemInt(input, "Digite apenas os numerais inteiros disponíveis!");

                    if (escolha == 1) {

                        Farmaco remedio = new Farmaco();

                        input.nextLine();
                        System.out.println("Nome:");
                        remedio.nome = filtro.FiltragemString(input);

                        System.out.println("Marca produtora:");
                        remedio.marcaProdutora = filtro.FiltragemString(input);

                        System.out.println("Massa líquida (g):");
                        remedio.massaLiquida = filtro.FiltragemDouble(input);

                        System.out.println("Concentração (mg/ml):");
                        remedio.concentracao = filtro.FiltragemDouble(input);

                        System.out.println("Quantia em estoque:");
                        remedio.quantiaEstoque = filtro.FiltragemInt(input);

                        System.out.println("Preço (R$):");
                        remedio.preco = filtro.FiltragemDouble(input);

                        input.nextLine();
                        System.out.println("Descrição:");
                        remedio.descricao = filtro.FiltragemString(input);

                        remedio.SalvarFarmaco(CAMINHO);
                    }

                    if (escolha == 2) {
                        boolean dummy = listador.Ler(CAMINHO);
                    }

                    if (escolha == 3) {
                        String selecao = new String();
                        boolean encontrado = false;
                        try {
                            FileReader leitor = new FileReader(CAMINHO);
                            BufferedReader buffLeitor = new BufferedReader(leitor);
                            String linha = new String();
                            boolean listaVazia = true;
                            boolean lendo = false;
                            String identificador = new String();

                            boolean dummy = listador.Ler(CAMINHO);

                            if (!dummy) {
                                input.nextLine();
                                System.out.println("Digite o nome do fármaco que deseja editar:");
                                identificador = filtro.FiltragemString(input);
                            }

                            Farmaco remedioUpdate = new Farmaco();

                            while ((linha = buffLeitor.readLine()) != null) {

                                if (linha.equals("Nome: " + identificador)) {
                                    lendo = true;
                                    encontrado = true;
                                }
                                if (lendo) {
                                    if (linha.startsWith("Nome: ")) {
                                        System.out.println("Novo nome do fármaco:");
                                        remedioUpdate.nome = filtro.FiltragemString(input);

                                        selecao += "Nome: " + remedioUpdate.nome + "\n" + "";
                                    }
                                    if (linha.startsWith("Marca: ")) {
                                        System.out.println("Nova marca produtora:");
                                        remedioUpdate.marcaProdutora = filtro.FiltragemString(input);

                                        selecao += "Marca: " + remedioUpdate.marcaProdutora + "\n" + "";
                                    }
                                    if (linha.startsWith("Massa líquida: ")) {
                                        System.out.println("Nova massa líquida (g):");
                                        remedioUpdate.massaLiquida = filtro.FiltragemDouble(input);

                                        selecao += "Massa líquida: " + remedioUpdate.massaLiquida + "\n" + "";
                                    }
                                    if (linha.startsWith("Concentração: ")) {
                                        System.out.println("Nova concentração (mg/ml):");
                                        remedioUpdate.concentracao = filtro.FiltragemDouble(input);

                                        selecao += "Concentração: " + remedioUpdate.concentracao + "\n" + "";
                                    }
                                    if (linha.startsWith("Quantia em estoque: ")) {
                                        System.out.println("Nova quantia em estoque:");
                                        remedioUpdate.quantiaEstoque = filtro.FiltragemInt(input);

                                        selecao += "Quantia em estoque: " + remedioUpdate.quantiaEstoque + "\n" + "";
                                    }
                                    if (linha.startsWith("Preço(R$): ")) {
                                        System.out.println("Novo preço (R$):");
                                        remedioUpdate.preco = filtro.FiltragemDouble(input);

                                        selecao += "Preço(R$): " + remedioUpdate.preco + "\n" + "";
                                    }
                                    if (linha.startsWith("Descrição: ")) {
                                        input.nextLine();
                                        System.out.println("Nova descrição:");
                                        remedioUpdate.descricao = filtro.FiltragemString(input);

                                        selecao += "Descrição: " + remedioUpdate.descricao + "\n" + "-------------------" + "\n" + "";
                                    }

                                } else {
                                    selecao += linha + '\n';
                                }

                                if (linha.equals("-------------------")) {
                                    lendo = false;
                                }

                                listaVazia = false;
                            }

                            System.out.println(selecao);

                            if (!listaVazia) {
                                Manipulador.MensagemErro(encontrado);
                            }

                            buffLeitor.close();
                            leitor.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        if (encontrado) {
                            Manipulador.Reescrever(selecao, CAMINHO, "Editado com sucesso!");
                        }
                    }

                    if (escolha == 4) { //Exclusão (Delete)
                        String selecao = new String();
                        boolean encontrado = false;
                        try {
                            FileReader leitor = new FileReader(CAMINHO);
                            BufferedReader buffLeitor = new BufferedReader(leitor);
                            String linha = new String();
                            boolean listaVazia = true;
                            boolean evitando = false;
                            String identificador = new String();

                            boolean dummy = listador.Ler(CAMINHO);

                            if (!dummy) {
                                input.nextLine();
                                System.out.println("Digite o nome do fármaco que deseja excluir:");
                                identificador = filtro.FiltragemString(input);
                            }

                            while ((linha = buffLeitor.readLine()) != null) {

                                if (linha.equals("Nome: " + identificador)) {
                                    evitando = true;
                                    encontrado = true;
                                }
                                if (evitando) {
                                    System.out.println(linha);
                                    selecao += "";
                                } else {
                                    selecao += linha + '\n';
                                }

                                if (linha.equals("-------------------")) {
                                    evitando = false;
                                }

                                listaVazia = false;
                            }

                            if (!listaVazia) {
                                Manipulador.MensagemErro(encontrado);
                            }

                            buffLeitor.close();
                            leitor.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        if (encontrado) {
                            Manipulador.Reescrever(selecao, CAMINHO, "Excluído com sucesso!");
                        }
                    }

                    if (escolha == 0) {
                        System.out.println("Saindo...");
                        i = false;
                    }
                }
            }

            if (opc == 2) { //Loop do menu do Cliente
                boolean i = true;
                Cliente cliente = new Cliente();
                while (i) {
                    System.out.println(" MENU CLIENTE ");
                    System.out.println("1 - Adicionar remédios ao carrinho");
                    System.out.println("2 - Excluir produtos do carrinho");
                    System.out.println("3 - Ver carrinho");
                    System.out.println("4 - Criar cartão fidelidade");
                    System.out.println("0 - Sair");

                    Manipulador listador = new Manipulador();
                    int escolha = filtro.FiltragemInt(input, "Digite apenas os numerais inteiros disponíveis!");

                    if (escolha == 1){
                        boolean dummy = listador.Ler(CAMINHO);

                        System.out.println("Escreva o nome do produto:");

                        input.nextLine();
                        String produto = filtro.FiltragemString(input);

                        cliente.AdicionarAoCarrinho(produto);
                    }

                    if (escolha == 2){
                        if (cliente.carrinho == null){
                            System.out.println("O carrinho está vazio");
                        }
                        else {
                            System.out.println("Escreva o nome do produto:");
                            input.nextLine();
                            String produto = filtro.FiltragemString(input);
                            cliente.RemoverDoCarrinho(produto);
                        }
                    }

                    if (escolha == 3){
                        if (cliente.carrinho == null){
                            System.out.println("O carrinho está vazio");
                        }
                        else{
                            System.out.println(cliente.carrinho);
                        }
                    }

                    if (escolha == 4){
                        System.out.println("Adicione as seguintes informações:");
                        input.nextLine();
                        System.out.println("Nome:");
                        String nome = filtro.FiltragemString(input);
                        System.out.println("Idade:");
                        int idade = filtro.FiltragemInt(input);
                        input.nextLine();
                        System.out.println("CPF:");
                        String cpf = filtro.FiltragemString(input);

                        cliente.FazerCartaoFidelidade(nome, idade,cpf);
                    }

                    if (escolha == 0) {
                        System.out.println("Saindo...");
                        i = false;
                    }
                }
            }

            if (opc == 0) {
                System.out.println("Saindo do sistema...");
                break;
            }
        }
    }
}

# Sistema de Farmácia Virtual

# -Descrição do Projeto-
Este projeto se trata de uma simulação de uma farmácia virtual desenvolvido em Java. O objetivo é desenvolver uma plataforma simples e eficaz que permita que clientes possam escolher e comprar medicamentos de forma intuitiva e segura, e funcionários tenham controle direto sobre o gerenciamento de estoques e edição de preços.

# -Funcionalidades Principais-
O sistema é projetado pensado no uso por 2 tipos de usuários com as seguintes funcionalidades:
- Cliente:
  Comprar medicamentos (Diretamente ou utilizando o carrinho de compras)
  
  Criar cartão fideliade (Cartão pago associado à conta do cliente que lhe beneficia certas promoções)
  
- Funcionário:
  Manutenção de estoque
  
  Controle direto de produtos (Adicionar, excluir e editar produtos na listagem)

# -Tecnologias Utilizadas-
- Linguagem:
  Java 25
- Implementação do CRUD (Create - Read - Update - Delete)

# -Instrução de Execução-
Utilizando uma IDE com suporte à Java 25 (caso não tenha o Java 25, faça o download no seguinte link: https://www.oracle.com/br/java/technologies/downloads/#jdk25-windows), faça download da pasta "MainCode" e a abra na IDE. Identifique e execute a classe "FarmaciaPrincipal"; feito isso, deverá abrir o menu em console. Após isso, escolha as opções disponíveis oferecidas pelo menu e aproveite o funcionamento do projeto.

# -Justificativa do não uso do padrão MVC-
O padrão MVC não é necessário neste projeto porque se trata de uma aplicação de console com fluxo simples e único ponto de interação.
A separação em Model, View e Controller aumentaria a quantidade de classes e complexidade estrutural sem oferecer ganhos reais de manutenção, extensibilidade ou reutilização. Para um sistema pequeno e baseado em linha de comando, a solução atual é suficiente e mais prática.

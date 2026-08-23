Descrição do Projeto

O sistema simula a estrutura base de um banco, permitindo o cadastro de clientes, a abertura de contas vinculadas a esses clientes e a realização de movimentações financeiras básicas (depósitos e saques) com validação de saldo.

Estrutura do Código

Cliente: Modela os dados do titular.

Atributos Privados: nome (String) e cpf (String).

Métodos: Construtor parametrizado, métodos de acesso (getters e setters) e exibirDados() para impressão do perfil.

ContaBancaria: Modela a conta e estabelece a associação com a classe Cliente.

Atributos Privados: numeroDaConta (String), saldo (double) e donoDaConta (objeto do tipo Cliente).

Métodos de Negócio:

depositar(double valor): Incrementa o valor informado ao saldo atual.

sacar(double valor): Aplica a estrutura condicional if/else para permitir retiradas apenas quando houver saldo suficiente.

exibirDados(): Apresenta os dados da conta e recupera o nome do titular navegando no objeto associado (donoDaConta.getNome()).

TesteSistemaBanco: Classe principal para automação dos testes.

Contém o método public static void main(String[] args) para instanciar clientes e contas, executar movimentações e exibir os resultados no terminal sem dependência da interface gráfica do BlueJ.

Passo a Passo de Desenvolvimento

Encapsulamento do Cliente: Criação dos atributos privados da classe Cliente, garantindo o acesso seguro via getters e setters.

Associação de Objetos: Implementação da classe ContaBancaria utilizando a classe Cliente como tipo de dado de um dos seus atributos.

Lógica Financeira: Programação dos métodos de depósito e de saque com validação de saldo negativo.

Integração de Métodos: Ajuste no método de exibição da conta para acessar as informações do cliente através da referência donoDaConta.

Automação via Main: Criação do script de teste em TesteSistemaBanco para simular cenários reais de uso de forma sequencial.

Versionamento: Envio do código-fonte para o GitHub utilizando comandos do Git (git add, git commit -m e git push).
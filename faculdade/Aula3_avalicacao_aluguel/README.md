ESTRUTURA DO CODIGO:
Cliente.java

Modela o locatario do imovel.

Guarda atributos de identificacao (codigo, nome e telefone).

Imovel.java

Modela a residencia disponivel para locacao.

Guarda codigo, descricao, preco do aluguel e tempo minimo de contrato.

Possui o metodo exibeDados() para impressao detalhada do imovel.

Aluguel.java

Representa o contrato de locacao consolidado.

Atributos: codigo do contrato, datas (inicio e termino), associacao com
o objeto Imovel e com o objeto Cliente.

Possui o metodo exibeDados() que imprime o contrato e encadeia a
exibicao dos dados do imovel associado.

Main.java

Classe executavel (ponto de entrada da aplicacao).

Gerencia o fluxo de perguntas e respostas com o usuario usando Scanner.

Aplica conversoes de entrada (Integer.parseInt e Double.parseDouble)
para tratamento correto do buffer do teclado.

Instancia as tres entidades e exibe o resultado final no console.

CONCEITOS DE POO APLICADOS:
Encapsulamento (atributos privados e acessores).

Construtores com tratamento do operador 'this'.

Associacao/Composicao entre classes (Aluguel contem Imovel e Cliente).

Manipulacao do buffer de entrada (java.util.Scanner).

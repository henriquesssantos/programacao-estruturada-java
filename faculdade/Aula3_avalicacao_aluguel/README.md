## 📂 Estrutura do Código

* **`Cliente.java`**
  * Modela o locatário do imóvel.
  * Guarda atributos de identificação (`codigo`, `nome` e `telefone`).

* **`Imovel.java`**
  * Modela a residência disponível para locação.
  * Guarda `codigo`, `descricao`, `precoAluguel` e `contratoMinimo`.
  * Possui o método `exibeDados()` para impressão detalhada do imóvel.

* **`Aluguel.java`**
  * Representa o contrato de locação consolidado.
  * **Atributos:** código do contrato, datas (`dataInicio` e `dataFinal`), associação com o objeto `Imovel` e com o objeto `Cliente`.
  * Possui o método `exibeDados()` que imprime o contrato e encadeia a exibição dos dados do imóvel associado.

* **`Main.java`**
  * Classe executável (ponto de entrada da aplicação).
  * Gerencia o fluxo de perguntas e respostas com o usuário usando `Scanner`.
  * Aplica conversões de entrada (`Integer.parseInt` e `Double.parseDouble`) para tratamento correto do buffer do teclado.
  * Instancia as três entidades e exibe o resultado final no console.

---

## 🛠️ Conceitos de POO Aplicados
* Encapsulamento (atributos privados e acessores).
* Construtores com tratamento do operador `this`.
* Associação/Composição entre classes (`Aluguel` contém `Imovel` e `Cliente`).
* Manipulação do buffer de entrada (`java.util.Scanner`).

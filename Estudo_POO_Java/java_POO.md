# ☕ Entendendo a Estrutura do Java e Orientação a Objetos

*Um guia rápido para entender por que o Java organiza as coisas de forma diferente de linguagens estruturadas (como scripts e lógicas de cima para baixo).*

---

## 🧠 A Mentalidade: Tudo é um Objeto
Na Programação Orientada a Objetos (POO), tentamos organizar o código imitando o mundo físico. Pense em um equipamento de hardware (como um switch de rede ou uma controladora de acesso):

1. **A Classe (O Projeto):** É o projeto técnico ou o diagrama elétrico do equipamento. A classe define o que a placa *tem* (propriedades, como número de portas) e o que ela *faz* (funções).
2. **Os Métodos (As Ações):** São as funções executáveis em si, como `transmitirDados()`, `liberarAcesso()` ou `calcularConsumo()`.

Você não pode ter a instrução solta "liberar acesso" flutuando no meio de um manual técnico em PDF. Ela precisa ser acionada por um comando ou botão específico. Da mesma forma, no Java, **ações (como um encadeamento `if` ou um `System.out.println`) não podem ficar soltas no corpo da Classe. Elas precisam, obrigatoriamente, existir dentro de um Método.**

---

## 🏗️ A Anatomia de um Arquivo Java (As "Gavetas")

Um arquivo Java sempre respeita a seguinte hierarquia de gavetas:

### 1. A Gaveta da Classe (A Estrutura)
No corpo da classe (`public class NomeDaClasse { ... }`), você só tem permissão para fazer duas coisas:
* Declarar quais características (variáveis/atributos) essa classe tem.
* Criar os métodos.

### 2. A Gaveta do Método (A Ação)
É aqui dentro que a lógica de programação de fato ocorre. É exclusivamente dentro dos métodos que você vai colocar matemática, verificar valores e imprimir mensagens na tela.

```java
public class Equipamento {
    
    // CORRETO NA CLASSE: Apenas declarar "o que o equipamento tem"
    int portas = 8;
    boolean ligado = false;

    // ERRADO NA CLASSE: Tentar executar uma ação ou lógica direto aqui
    // if (ligado == true) { ... } -> ISSO DARÁ ERRO DE COMPILAÇÃO!

    // CORRETO: Criar um Método para guardar a ação
    public void ligarEquipamento() {
        ligado = true;
        
        // CORRETO NO MÉTODO: A lógica acontece aqui dentro
        if (ligado) {
            System.out.println("O equipamento está operando.");
        }
    }
}
```

### 3. O Método `main` (O Botão Power)
Se um projeto Java pode ter dezenas de classes e centenas de métodos, como o computador sabe por onde começar a ler o programa? 
Ele procura pelo método principal: `public static void main(String[] args)`. 

Esse método é o **botão "Power"** do sistema. Quando você clica em *Run* na sua IDE, a máquina virtual do Java vai direto procurar esse método para iniciar o programa e dar as primeiras ordens de execução.

A grande mágica da Programação Orientada a Objetos é essa: amanhã, se você precisar gerenciar 50 switches diferentes no seu código, a regra complexa de limite de energia não precisa ser reescrita 50 vezes. Ela já vive dentro do método conectarDispositivo do seu molde principal.

O que achou dessa divisão? Se quiser testar no seu VS Code, basta salvar os dois arquivos na mesma pasta e clicar em "Run" no arquivo Main.java!

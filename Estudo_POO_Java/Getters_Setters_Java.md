# 🔒 O que são Getters e Setters em Java?

Para entender os **Getters** e **Setters**, precisamos falar sobre um dos pilares mais importantes da Programação Orientada a Objetos: o **Encapsulamento**.

Imagine um equipamento eletrônico fechado, como um servidor ou um módulo de controle. Você não abre a carcaça de metal e solda fios diretamente nos minúsculos pinos do processador ou nos flip-flops da placa para mudar o estado de funcionamento dele. Fazer isso seria perigoso e poderia queimar o sistema. Em vez disso, o fabricante esconde o circuito frágil dentro da caixa e te entrega **portas e interfaces** seguras do lado de fora (como um teclado, uma porta de rede ou um painel de botões) para você interagir com a máquina.

No Java, fazemos exatamente a mesma coisa com o nosso código:
1. **Escondemos os atributos** (colocando a palavra `private` antes deles) para que ninguém mexa neles diretamente e quebre o sistema.
2. **Criamos métodos públicos (Getters e Setters)**, que funcionam como os botões e os visores do equipamento, permitindo ler ou alterar os dados de forma segura e controlada.

---

## 🛠️ O que cada um faz?

*   **GET (Pegar / Obter):** É o método usado para "ler" uma informação que está guardada dentro do objeto. Ele apenas retorna o valor, sem alterar nada. É como olhar para um painel digital e ler a temperatura atual.
*   **SET (Definir / Alterar):** É o método usado para gravar ou modificar uma informação do objeto. A grande vantagem do `set` é que você pode criar regras dentro dele para validar a alteração.

---

## 💻 Exemplo no Código (Classe Computador)

```java
public class Computador {
    
    // 1. ATRIBUTOS (Agora privados para proteger os dados do "hardware")
    private String marca;
    private String processador;
    private int memoriaRam;

    // 2. CONSTRUTOR
    public Computador(String marcaModelo, String processadorModelo, int ram) {
        marca = marcaModelo;
        processador = processadorModelo;
        memoriaRam = ram;
    }

    // ==========================================
    // 3. MÉTODOS GETTERS E SETTERS
    // ==========================================

    // --- Marca ---
    public String getMarca() {
        return marca; // Apenas devolve a informação
    }

    public void setMarca(String novaMarca) {
        marca = novaMarca; // Substitui a marca antiga pela nova
    }

    // --- Processador ---
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String novoProcessador) {
        processador = novoProcessador;
    }

    // --- Memória RAM ---
    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int novaRam) {
        // Exemplo de como o Set protege o sistema: só aceita valores válidos!
        if (novaRam > 0) {
            memoriaRam = novaRam;
        } else {
            System.out.println("Erro: A memória RAM não pode ser zero ou negativa!");
        }
    }

    // ==========================================
    // 4. OUTROS MÉTODOS (Ações do Computador)
    // ==========================================

    public void ligar() {
        System.out.println("O computador " + marca + " está ligando...");
    }

    public void exibeDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRam + "GB");
    }
}
```

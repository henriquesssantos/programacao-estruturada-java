# 🏭 O que significa "Instanciar um Objeto" em Java?

Para entender o que significa **instanciar um objeto**, vamos pensar naquilo que você já conhece sobre hardware e eletrônica.

Imagine que você está lendo o manual técnico ou o diagrama elétrico de uma placa (como um **Arduino** ou uma **controladora de acesso**). Aquele diagrama diz exatamente quais componentes a placa tem (portas, relés, alimentação) e o que ela faz. No Java, esse diagrama é a sua **Classe** (o código que você acabou de escrever).

Porém, um diagrama no papel não consome energia, não processa dados e não acende LEDs. Ele é apenas um conceito.

Para a placa funcionar de verdade, você precisa ir lá, pegar os componentes reais e montar a placa física na sua bancada. Esse ato de pegar o "projeto" e fabricar o equipamento real na memória do computador é o que chamamos de **Instanciar um Objeto**.

* **Classe:** O projeto em texto (O seu código `public class Computador`).
* **Instanciar:** O ato de construir o equipamento na memória. No Java, a nossa "fábrica" é a palavra-chave `new`.
* **Objeto:** O equipamento final pronto para uso.

---

## 💻 Como isso fica no código?

Para cumprir a parte da sua tarefa que diz *"Criar 3 Objetos"*, você precisará instanciar a sua classe três vezes. Usando a classe que você criou, a fabricação (instanciação) acontece assim:

```java
// Criando (instanciando) o Objeto 1
Computador pc1 = new Computador("Dell", "Intel Core i5", 8);

// Criando (instanciando) o Objeto 2
Computador pc2 = new Computador("Lenovo", "AMD Ryzen 7", 16);

// Criando (instanciando) o Objeto 3
Computador pc3 = new Computador("Asus", "Intel Core i9", 32);
```

> **Nota:** Observe que usamos o **Construtor** para passar as informações exclusivas de cada máquina na hora em que ela está sendo "fabricada" com o comando `new`. A partir dessa linha, `pc1`, `pc2` e `pc3` são três computadores físicos e independentes existindo na memória do Java.
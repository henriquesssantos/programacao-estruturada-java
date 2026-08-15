// Todo arquivo Java deve começar com uma public class, que é o nome do arquivo. O nome da classe deve ser igual ao nome do arquivo, caso contrário o código não compilará.

public class Main {
    // Declaração de variaveis: 
    int idade = 22; 
    String nome = "Henrique";

    // outra forma é usar o "var" para declarar variaveis, mas não é recomendado, pois o tipo da variavel não fica explícito.
    var idade2 = 50;S
    var nome2 = "Carlos";


    // tipos de int
    // byte: 8 bits, de -128 a 127
    // short: 16 bits, de -32.768 a 32.767 
    // int: 32 bits, de -2.147.483.648 a 2.147.483.647
    // long: 64 bits, de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

    byte b = 100; // 8 bits
    short s = 1000; // 16 bits
    int i = 10000; // 32 bits
    long l = 100000l; // 64 bits

    // tipos de float
    // float: 32 bits, de 1.4E-45 a 3.4028235E38
    // double: 64 bits, de 4.9E-324 a 1.7976931348623157E308

    float f = 10.5f; // 32 bits
    double d = 10.5; // 64 bits

    //tipos de char
    // char: 16 bits, de 0 a 65.535, representa um caracter Unicode, como 'a', '1', '!', etc.
    // string: 16 bits, de 0 a 65.535, representa uma sequência de caracteres Unicode, como "Olá", "123", "!@#", etc.

    char c = 'a'; // 16 bits
    String str = "Olá"; // 16 bits

    // tipos de boolean
    // boolean: 1 bit, representa um valor verdadeiro ou falso, como true ou false.

    boolean bool = true; // 1 bit


    // Estrutura condicional: if, else if, else
    if (idade > 18) {
        System.out.println("Você é maior de idade");
    } else if (idade == 18) {
        System.out.println("Você tem 18 anos");
    } else {
        System.out.println("Você é menor de idade");
    }

    // exemplo com boolean
    // com boolean não é necessário usar operadores de comparação, pois o valor já é verdadeiro ou falso.
    if (bool) {
        System.out.println("O valor é verdadeiro");
    } else {
        System.out.println("O valor é falso");
    }

    // vetores
    int[] colecao_inteiros = {1,2,3};
    System.out.println(colecao_inteiros);

}



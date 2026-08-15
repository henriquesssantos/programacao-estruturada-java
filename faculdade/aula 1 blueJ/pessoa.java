 public class pessoa
{
    // Atributos da classe: guardam os dados de cada objeto criado
    // Eles são privados para proteger as informações e seguir o conceito de encapsulamento, nesse caso esses dados são acessados apenas pelos métodos da classe pessoa'
    
    private String nome;
    private int idade;

    // Construtor: é o método usado para criar um objeto e definir seus valores iniciais
    public pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    // Método público: permite mudar o estado do objeto sem acessar os atributos diretamente
    public void fazaniversario()
    {
        this.idade = this.idade + 1;
    }

    // Método público: mostra os dados da pessoa na tela
    public void exibedados()
    {
        System.out.println("o nome da pessoa é " + nome);
        System.out.println("a idade da pessoa é " + idade);
    }
}
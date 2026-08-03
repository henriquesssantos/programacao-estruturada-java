
/**
 * Escreva uma descrição da classe pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private int idade;

    /**
     * Construtor para objetos da classe pessoa
     */
    public pessoa(String nome, int idade)
    {
        // inicializa variáveis de instância
        
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void fazaniversario()
    {
        // escreva seu código aqui
        this.idade = this.idade + 1;
        
        
    }
    public void exibedados()
    {
        System.out.println("o nome da pessoa é" + nome);
        System.out.println("a idade da pessoa é"+ idade);
    }



}
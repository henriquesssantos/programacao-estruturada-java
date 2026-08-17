public class imovel{
    private String nome;
    private String localizacao;
    private int valor;
    
    // construtor(parametros do objeto
    public imovel(String nome, String localizacao, int valor){
        this.nome = nome;
        this.localizacao= localizacao;
        this.valor = valor;
    }
    
    // metodos getters e setters
    public String getNome(){
        return nome;
    }
    public String getLocalizacao(){
        return localizacao;
    }
    public int valor(){
        return valor;
    }
    
    // setters
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public void exibeDados(){
        System.out.println("nome " + nome);
        System.out.println("localizacao " + localizacao);
        System.out.println("valor " + valor);
    }
}
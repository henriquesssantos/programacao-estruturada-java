public class cliente{
    private String nome;
    private String cpf;

    // construtor
    public cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = nome;
        
    }
    
    //Getters e setters
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void exibirDados(){
        System.out.println("nome " + nome);
        System.out.println("cpf"+ cpf);
    }
}
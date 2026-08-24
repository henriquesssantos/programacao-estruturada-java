
public class cliente{
    private int codigo;
    private String nome;
    private String telefone;
    
    public cliente(int codigo, String nome, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }
    // geters
    public String getNome(){
        return nome;
    }
    public String getTelenofe(){
        return telefone;
    }
}
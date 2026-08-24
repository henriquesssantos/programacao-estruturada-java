
public class professor extends usuario{
    private String areaDeAtuacao;

    public professor(int mat, String nom, String log, String sen){
        super(mat,nom,log,sen);
    }
    public String getAreaDeAtuacao(){
        return areaDeAtuacao;
    }
    public void setAreaDeAtuacao(String areaDeAtuacao){
        this.areaDeAtuacao = areaDeAtuacao;
    }
    public void exibeDados(){
        System.out.println("");
        System.out.println("+++++Dados Do Professor+++++");
        super.exibeDados();
        
        if(areaDeAtuacao!=null && !areaDeAtuacao.isEmpty()){
            
        }
    }
}
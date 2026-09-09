public class Professor extends Usuario {
    private String areaAtuacao;

    public Professor(int mat, String nom, String log, String sen) {
        super(mat, nom, log, sen);
        
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String are) {
        this.areaAtuacao = are;
    }
    
    public void exibeDados() {
    System.out.println("");
    System.out.println("++++++ Dados do Professor ++++++");
    super.exibeDados();
    if(areaAtuacao != null && !areaAtuacao.isEmpty()) {
        System.out.println("Área de Atuação: " + areaAtuacao);
    }
}

}

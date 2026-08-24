
public class imovel{
    private int codigo;
    private String descricao;
    private double PrecoAlugel;
    private int ContratoMinimo;
    
public imovel(int codigo, String descricao, double PrecoAlugel, int ContratoMinimo){
    this.codigo = codigo;
    this.descricao = descricao;
    this.PrecoAlugel = PrecoAlugel;
    this.ContratoMinimo = ContratoMinimo;
}
public void exibeDados(){
    System.out.println("O codigo do imovel e: "+codigo);
    System.out.println("Descricao do imovel: "+descricao);
    System.out.println("O preco do aluguel e: "+PrecoAlugel);
    System.out.println("O contrato minimo e: "+ContratoMinimo);
}

}

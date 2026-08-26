
public class imovel{
    private int codigo;
    private String descricao;
    private double precoAluguel;
    private int contratoMinimo;
    
public imovel(int codigo, String descricao, double precoAluguel, int contratoMinimo){
    this.codigo = codigo;
    this.descricao = descricao;
    this.precoAluguel = precoAluguel;
    this.contratoMinimo = contratoMinimo;
}
public void exibeDados(){
    System.out.println("O codigo do imovel e: "+codigo);
    System.out.println("Descricao do imovel: "+descricao);
    System.out.println("O preco do aluguel e: "+precoAluguel);
    System.out.println("O contrato minimo e: "+contratoMinimo);
}

}

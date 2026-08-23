public class contaBancaria{
    private String numeroDaConta;
    private double saldo;
    private cliente donoDaConta;
    
public contaBancaria(String numeroDaConta, double saldo, cliente donoDaConta){
    this.numeroDaConta = numeroDaConta;
    this.saldo = saldo;
    this.donoDaConta = donoDaConta;
}
//Getters e setters
    public String getNumeroDaConta(){
        return numeroDaConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public cliente getdDonoDaConta(){
        return donoDaConta;
    }
    public void setNumeroDaConta(String numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setDonoDaConta(cliente donoDaConta){
        this.donoDaConta = donoDaConta;
    }
//Regras do negocio
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if (valor <= this.saldo){
        this.saldo = this.saldo - valor;
    }else{
        System.out.println("saldo insuficiente para realizar o saque");
    }
    }
// exibicao
    public void exibirDados(){
        System.out.println("Numero da conta: " + numeroDaConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("nome do titular:" + donoDaConta.getNome());
    }
}
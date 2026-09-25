public class CaixaEletronico{
    public static void main(String args[]){
        /*CRIACAO DO MEU OBJETO CONTA CORRENTE
        TIPO DO OBJETO É "CONTA CORRENTE"
        NOME DO OBJETO É "CONTA1"
        NEW É A FUNCAO QUE CRIA O OBJETO
        CONTACORRENTE(1000.00) SERVE PARA ENVIAR O PARAMETRO QUE MEU CONSTRUTOR ESPERA*/
    ContaCorrente conta = new ContaCorrente(1000.00);
    
    int opcao;
    do{
        conta.opcoes();
        opcao = Teclado.leInt("Digite o numero da opcao desejada");
        while(opcao<0 && opcao>4)
            opcao=Teclado.leInt("Numero da opcao invalida, digite novamente: ");
    
    double valor;
    int parcelas;
    
    switch(opcao){
        case 1:
            valor = Teclado.leDouble("Digite o valor que deseja sacar: ");
            conta.retirada(valor);
            break;
        case 2:
            valor = Teclado.leDouble("Digite o valor que deseja depositar: ");
            conta.deposito(valor);
            break;
        case 3:
            valor = Teclado.leDouble("Digite o valor do emprestimo que deseja: ");
            parcelas = Teclado.leInt("DIgite o numero que parcelas que deseja: ");
            conta.emprestimo(valor,parcelas);
        case 4:
            conta.ConsultarSaldo();
        default:
            System.out.println("Encerrando o sistema");
    }}while(opcao!=0);
        
        
    }
}

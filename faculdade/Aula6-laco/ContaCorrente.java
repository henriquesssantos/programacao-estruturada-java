public class ContaCorrente{
    private double saldo;
    
    public ContaCorrente(double s){
        //CONSTRUTOR PRINCIPAL DA CLASSE
        saldo = s;
    }
    public void retirada(double valor){
        //METODO PARA FAZER SAQUE NA CONTA
        while(valor>saldo){
            System.out.println("A retirada nao pode ser maior que o saldo");
            valor = Teclado.leDouble("Digite o novo valor da retirada");
            }
        saldo -= valor;
    }
    public void deposito(double valor){
        //METODO PARA CRIAR DEPOSITO NA CONTA
        while(valor<=0){
            System.out.println("O deposito nao pode ser 0 ou negativo");
            valor = Teclado.leDouble("Digite o novo valor do deposito que deseja");
        }
        saldo += valor;
    }
    public void emprestimo(Double valor, int parcelas){
        //GARANTIA DE QUE O MINIMO DE PARCELAS SERA 1
        while(parcelas<=0){
            System.out.println("O numero de parcelas nao pode ser menor que 1.");
            parcelas = Teclado.leInt("Digite o novo numero de parcelas");
        }
        double valor_parcela = valor/parcelas;
        //LACO PARA CALCULAR VALOR DE CADA PARCELA
        for( int i=1;i<=parcelas;i++){
            valor_parcela+= valor_parcela*0.05;
            System.out.printf("O valor da parcela %d, é: %4.2f \n", i , valor_parcela);
        }
        //ADICAO DO VALOR DO EMPRESTIMO NA CONTA CORRENTE
        saldo+=valor;
    }
    public void ConsultarSaldo(){
        //METODO PARA CONSULTAR SALDO
        System.out.printf("Seu saldo atual é: %4.2f \n",saldo);
    }
    public void opcoes() {
        System.out.println("==============================");
        System.out.println(" Bem vindo a Coperativa Fernandes!");
        System.out.println(" As opcoes disponiveis sao: ");
        System.out.printf(" %-26s%n", "1- Saque");
        System.out.printf(" %-26s%n", "2- Deposito");
        System.out.printf(" %-26s%n", "3- Emprestimo");
        System.out.printf(" %-26s%n", "4- Visualizar saldo");
        System.out.printf(" %-26s%n", "0- Encerrar");
        System.out.println("==============================");
    }
    }
    

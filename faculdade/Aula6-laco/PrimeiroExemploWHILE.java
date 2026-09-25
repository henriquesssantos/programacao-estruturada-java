public class PrimeiroExemploWHILE{
    
    public static void main(String args[]){
        // CRIANDO AS VARIAIS
        double saldo = 1000;
        double retirada = Teclado.leDouble("informe o valor que deseja retirar");
        
        //ENQUANTO O VALOR DA RETIRADA FOR SUPERIOR AO SALDO
        while(retirada>saldo){
            System.out.println("Saldo indisponivel para esse valor de retirada");
            retirada = Teclado.leDouble("informe um novo valor para retirada");
        }
        
        saldo = saldo - retirada;
        System.out.println("Seu novo saldo é: "+ saldo);
        
    }
}
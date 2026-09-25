public class SegundoExemploDOWHILE{
    
    public static void main(String args[]){
        double saldo = 1000;
        double retirada = Teclado.leDouble("Digite o valor a ser retirado");
        
        do{
            System.out.println("Saldo indisponivel para este valor de retirada");
            retirada = Teclado.leDouble("Digite um novo valor para retirada");
        }while(retirada>saldo);
        
        saldo = saldo - retirada;
        System.out.println("Seu saldo disponivel é: " + saldo);
    }
}
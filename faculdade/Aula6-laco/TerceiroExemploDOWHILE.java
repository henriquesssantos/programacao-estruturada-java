public class TerceiroExemploDOWHILE{
    public static void main(String args[]){
        double saldo = 1000;
        char opcao;
        
        do{
            double retirada = Teclado.leDouble("Digite o valor que deseja retirar");
            while(retirada>saldo){
                System.out.println("Valor da retirada excede o saldo.");
                retirada = Teclado.leDouble("Digite o novo valor da retirada");
            }
            saldo = saldo - retirada;
            System.out.println("Seu saldo disponivel é de: "+saldo);
            opcao = Teclado.leChar("Deseja fazer uma nova retirada? (S/N)");
            }while(Character.toLowerCase(opcao)=='s');
        }
    }

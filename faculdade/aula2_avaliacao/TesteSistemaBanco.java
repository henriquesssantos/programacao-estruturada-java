
public class TesteSistemaBanco{
    public static void main (String[] args){
        
        // instanciar dois objetos do tipo cliente
        cliente cliente1 = new cliente("Henrique", "044.999.666.01");
        cliente cliente2 = new cliente("Gabriela", "111.222.888.777");
        
        //instanciar dois objetos do tipo conta bancaria, atrelado aos respectivos objetos clientes
        contaBancaria conta1 = new contaBancaria("1", 500.00, cliente1);
        contaBancaria conta2 = new contaBancaria("2", 1000.00, cliente2);
        
        // Realizar depósitos e saques para testar a lógica
        conta1.depositar(200.0);
        conta2.sacar(150.0);

        // Exibir os dados no terminal para comprovar que funcionou
        conta1.exibirDados();
        conta2.exibirDados();   
    }
}
import java.util.Scanner;

public class main{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        
        //RECEBENDO ATRIBUTOS DO CLIENTE
        
        System.out.println("digite o nome do cliente: ");
        String nomeCliente = teclado.nextLine();
        System.out.println("digite o codigo do cliente: ");
        int codigoCliente = Integer.parseInt(teclado.nextLine());
        
        /* Ha a necessidade de utilizar o nextLine (originalmente usado para ler String) e converter para int
        pois o Scanner.nextInt(), le apenas o numero digitado e guarda o "enter" na memoria. Com esse funcionamento, o proximo nextLine
        seria ignorado, pois o nextLine pausa apos o enter, poram como o enter ja esta na memoria, ele passa direto.
         */
        
        System.out.println("digite o telefone do cliente: ");
        String telefoneCliente = teclado.nextLine();
        
        //INSTANCIANDO O CLIENTE
        cliente locador = new cliente(codigoCliente, nomeCliente, telefoneCliente);
        
        //RECEBENDO ATRIBUTOS DO IMOVEL
        System.out.println("digite o codigo do imovel: ");
        int codigoImovel = Integer.parseInt(teclado.nextLine());
        System.out.println("digite a descricao do imovel: ");
        String descricaoImovel = teclado.nextLine();
        System.out.println("digite o preco preco do aluguel: ");
        double precoAluguel = Double.parseDouble(teclado.nextLine());
        System.out.println("digite o tempo minimo de contrato: ");
        int contratoMinimo = Integer.parseInt(teclado.nextLine());
        
        //INSTANCIANDO O IMOVEL
        imovel residencia = new imovel(codigoImovel, descricaoImovel, precoAluguel, contratoMinimo);
        
        //RECEBENDO ATRIBUTOS DO ALUGUEL
        System.out.println("digite o codigo do aluguel: ");
        int codigo = Integer.parseInt(teclado.nextLine());
        System.out.println("digite a data de inicio do alugel: ");
        String dataInicio  = teclado.nextLine();
        System.out.println("digite a data final do aluguel: ");
        String dataFinal = teclado.nextLine();
        
        //INSTANCIANDO O ALUGUEL
        aluguel aluguel = new aluguel(codigo, dataInicio, dataFinal, residencia, locador);
        
        //EXIBINDO DADOS DO ALUGUEL
        System.out.println("informacoes sobre o alugel: ");
        aluguel.exibeDados();
        
        teclado.close();
        
    }
    }

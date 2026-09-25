public class QuartoExemploFOR{
    public static void main(String args[]){
        double emprestimo = Teclado.leDouble("Digite o valor do emprestimo que deseja: ");
        double parcelas = Teclado.leInt("Digite a quantidade de parcelas para o emprestimo: ");
        double valor_parcela = emprestimo/parcelas;
        double valor_total_emprestimo = 0;
        
        for( int contador = 1; contador<=parcelas;contador++){
            valor_parcela += valor_parcela*0.05;
            System.out.printf("O valor da parcela %d é: %4.2f \n: ", contador, valor_parcela);
            valor_total_emprestimo += valor_parcela;
        }
        System.out.printf("O valor total do emprestimo é: %4.2f \n",valor_total_emprestimo);
    }
}
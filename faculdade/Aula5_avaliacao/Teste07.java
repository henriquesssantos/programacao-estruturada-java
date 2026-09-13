public class Teste07
{
    public static void verificaNumero(int n)
    {
        if (n > 0)
            System.out.println(n + " - Positivo");
        else if (n < 0)
            System.out.println(n + " - Negativo");
        else
            System.out.println(n + " - Zero");
    }
    
    public static void main(String args[])
    {
        int numero = Teclado.leInt("Digite um número inteiro: ");
        verificaNumero(numero);
    }
}
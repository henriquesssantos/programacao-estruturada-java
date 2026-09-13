public class Teste10
{
    public static void main(String args[])
    {
        System.out.println("-----Retorna pessoa mais velha-----");
        System.out.println("-----Digite os dados das Pessoas-----");
        
        Pessoa p1 = new Pessoa(Teclado.leString("Digite o nome da 1 Pessoa: "),
                               Teclado.leInt("Digite a idade da 1 Pessoa: "));
        
        Pessoa p2 = new Pessoa(Teclado.leString("Digite o nome da 2 Pessoa: "),
                               Teclado.leInt("Digite a idade da 2 Pessoa: "));
        
        String resultado = compararIdades(p1, p2);
        System.out.println(resultado);
    }
    
    public static String compararIdades(Pessoa pessoa1, Pessoa pessoa2)
    {
        if (pessoa1.getIdade() > pessoa2.getIdade())
        {
            return "A pessoa mais velha é: " + pessoa1.getNome();
        }
        else if (pessoa1.getIdade() < pessoa2.getIdade())
        {
            return "A pessoa mais velha é: " + pessoa2.getNome();
        }
        else
        {
            return "Mesma idade";
        }
    }
}
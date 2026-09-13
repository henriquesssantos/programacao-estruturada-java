public class Teste12
{
    public static void main(String args[])
    {
        double nota1 = Teclado.leDouble("Digite a primeira nota: ");
        double nota2 = Teclado.leDouble("Digite a segunda nota: ");
        double nota3 = Teclado.leDouble("Digite a terceira nota: ");
        
        calcularMedia(nota1, nota2, nota3);
    }
    
    public static void calcularMedia(double nota1, double nota2, double nota3)
    {
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Média: " + media);
        
        if ((media >= 0) && (media < 4))
        {
            System.out.println("Nota E");
        }
        else if (media < 5)
        {
            System.out.println("Nota D");
        }
        else if (media < 7)
        {
            System.out.println("Nota C");
        }
        else if (media < 8)
        {
            System.out.println("Nota B");
        }
        else if (media <= 10)
        {
            System.out.println("Nota A");
        }
        else
        {
            System.out.println("Nota inválida!");
        }
    }
}
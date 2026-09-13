public class Teste02
{
    public static void main(String[] args)
    {
        System.out.println("=== Exercício 2 - Análise de If's ===");
        
        int a = Teclado.leInt("Digite a: ");
        int b = Teclado.leInt("Digite b: ");
        int c = Teclado.leInt("Digite c: ");
        
        System.out.println("\nValores iniciais: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println();
        
        int guarda;
        
        if (a < b) {
            System.out.println("if 1 (a < b): TRUE");
            guarda = a;
            a = b;
            b = guarda;
        } else {
            System.out.println("if 1 (a < b): FALSE");
        }
        
        System.out.println("Valores após if 1: a=" + a + ", b=" + b + ", c=" + c);
        
        if (b < c) {
            System.out.println("if 2 (b < c): TRUE");
            guarda = b;
            b = c;
            c = guarda;
            
            if (a < b) {
                System.out.println("if 3 (a < b): TRUE");
                guarda = a;
                a = b;
                b = guarda;
            } else {
                System.out.println("if 3 (a < b): FALSE");
            }
        } else {
            System.out.println("if 2 (b < c): FALSE");
        }
        
        System.out.println("\nValores finais: a=" + a + ", b=" + b + ", c=" + c);
    }
}
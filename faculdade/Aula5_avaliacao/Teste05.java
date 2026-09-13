public class Teste05 //Testando if else if
{
    public static void main (String args[])
    {
        int tempa1= Teclado.leInt("Digite a1=");
        int tempa2= Teclado.leInt("Digite a2=");
        int tempb1= Teclado.leInt("Digite b1=");
        int tempb2= Teclado.leInt("Digite b2=");
        int tempc1= Teclado.leInt("Digite c1=");
        int tempc2= Teclado.leInt("Digite c2=");
        int tempd1= Teclado.leInt("Digite d1=");
        int tempd2= Teclado.leInt("Digite d2=");
        
        boolean a = tempa1 == tempa2;
        boolean b = tempb1 == tempb2;
        boolean c = tempc1 == tempc2;
        boolean d = tempd1 == tempd2;
        
        System.out.println("Valores: a=" + a + " b=" + b + " c=" + c + " d=" + d);
        System.out.println();
        
        if (a)
        {
            System.out.println("a é true, entra no if(a)");
            System.out.println("C1");
            
            if (b)
            {
                System.out.println("b é true, entra no if(b)");
                System.out.println("C2");
            }
            else if (c)
            {
                System.out.println("b é false, c é true, entra no else if(c)");
                System.out.println("C3");
            }
            else if (d)
            {
                System.out.println("b e c são false, d é true, entra no else if(d)");
                System.out.println("C4");
                System.out.println("C5");
            }
            else
            {
                System.out.println("b, c e d são false, entra no else");
                System.out.println("C6");
            }
        }
        else
        {
            System.out.println("a é false, não entra em nenhum if");
        }
        
        System.out.println();
        System.out.println("=== RESUMO ===");
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        
        if(!a)
            System.out.println("Resultado: Nenhum comando");
        else if(b)
            System.out.println("Resultado: C1, C2");
        else if(c)
            System.out.println("Resultado: C1, C3");
        else if(d)
            System.out.println("Resultado: C1, C4, C5");
        else
            System.out.println("Resultado: C1, C6");
    }
}
public class Teste01
{
    public static void main(String[] args)
    {
        int opcao;
        
        do
        {
            System.out.println("\n=== TESTES - Estruturas de Seleção ===");
            System.out.println("1) Item a - Raiz quadrada");
            System.out.println("2) Item b - Aprovação");
            System.out.println("3) Item c - If aninhados (r=1)");
            System.out.println("4) Item d - If/else aninhados (r=1 ou r=2)");
            System.out.println("5) Item e - Mensagem do aluno");
            System.out.println("6) Item f - Classificação por média");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = Teclado.leInt("");
            
            switch(opcao)
            {
                case 1:
                    itemA();
                    break;
                case 2:
                    itemB();
                    break;
                case 3:
                    itemC();
                    break;
                case 4:
                    itemD();
                    break;
                case 5:
                    itemE();
                    break;
                case 6:
                    itemF();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }
    
    // Item a) se n > 0 então raiz = √n
    public static void itemA()
    {
        System.out.println("\n--- Item A ---");
        int n = Teclado.leInt("Digite um valor para n: ");
        
        if(n > 0)
        {
            double raiz = Math.sqrt(n);
            System.out.println("Raiz de " + n + " = " + raiz);
        }
        else
        {
            System.out.println("n deve ser maior que 0");
        }
    }
    
    // Item b) se media >= 6,0 entao "Aprovado" senão "Precisa grau C"
    public static void itemB()
    {
        System.out.println("\n--- Item B ---");
        double media = Teclado.leDouble("Digite a média: ");
        
        if(media >= 6.0)
        {
            System.out.println("Aprovado");
        }
        else
        {
            System.out.println("Precisa grau C");
        }
    }
    
    // Item c) r = 0; se x>y entao se x>z então se y!=z então r = 1;
    public static void itemC()
    {
        System.out.println("\n--- Item C ---");
        int x = Teclado.leInt("Digite x: ");
        int y = Teclado.leInt("Digite y: ");
        int z = Teclado.leInt("Digite z: ");
        
        int r = 0;
        
        if(x > y)
        {
            if(x > z)
            {
                if(y != z)
                {
                    r = 1;
                }
            }
        }
        
        System.out.println("r = " + r);
    }
    
    // Item d) r = 0; se x>y entao se x>z então se y!=z então r = 1; senão r = 2;
    public static void itemD()
    {
        System.out.println("\n--- Item D ---");
        int x = Teclado.leInt("Digite x: ");
        int y = Teclado.leInt("Digite y: ");
        int z = Teclado.leInt("Digite z: ");
        
        int r = 0;
        
        if(x > y)
        {
            if(x > z)
            {
                if(y != z)
                {
                    r = 1;
                }
                else
                {
                    r = 2;
                }
            }
        }
        
        System.out.println("r = " + r);
    }
    
    // Item e) se alu.getMedia() >= 6,0 entao mensagem = "Aprovado" senão "Precisa grau C"
    public static void itemE()
    {
        System.out.println("\n--- Item E ---");
        double media = Teclado.leDouble("Digite a média do aluno: ");
        
        String mensagem;
        
        if(media >= 6.0)
        {
            mensagem = "Aprovado";
        }
        else
        {
            mensagem = "Precisa grau C";
        }
        
        System.out.println("Mensagem: " + mensagem);
    }
    
    // Item f) se (media >= 9,3) entao "Otimo" senão se (media >= 8,5) "Bom" senão se (media >= 6,0) "Aprovado" senão "Em recuperação"
    public static void itemF()
    {
        System.out.println("\n--- Item F ---");
        double media = Teclado.leDouble("Digite a média: ");
        
        String classificacao;
        
        if(media >= 9.3)
        {
            classificacao = "Otimo";
        }
        else if(media >= 8.5)
        {
            classificacao = "Bom";
        }
        else if(media >= 6.0)
        {
            classificacao = "Aprovado";
        }
        else
        {
            classificacao = "Em recuperação";
        }
        
        System.out.println("Classificação: " + classificacao);
    }
}
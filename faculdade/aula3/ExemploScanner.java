import java.util.Scanner;

public class ExemploScanner{
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("nome: "+ nome);
        System.out.print("idade:  "+ idade);
        
        scanner.close();
        
    }
}
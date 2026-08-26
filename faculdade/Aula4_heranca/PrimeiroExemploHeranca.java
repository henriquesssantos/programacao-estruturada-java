public class PrimeiroExemploHeranca
{
    public static void main(String args[]){
        usuario usuario = new usuario(Teclado.leInt("Informe a matricula do usuario: "),
                                      Teclado.leString("Informe o nome do usuario: "),
                                      Teclado.leString("Informe o login do usuario: "),
                                      Teclado.leString("Informe a senha do usuario: ")
                                      );
                                     
        professor professor = new professor(Teclado.leInt("Informe a matricula do professor: "),
                                      Teclado.leString("Informe o nome do Professor: "),
                                      Teclado.leString("Informe o login do Professor: "),
                                      Teclado.leString("Informe a senha do Professor: ")
                                      );
                                      
        professor.setAreaDeAtuacao("informatica");
        
        aluno aluno = new aluno(Teclado.leInt("Informe a matricula do aluno: "),
                                      Teclado.leString("Informe o nome do aluno: "),
                                      Teclado.leString("Informe o login do aluno: "),
                                      Teclado.leString("Informe a senha do aluno: ")
                                      );
                                     
        System.out.println("");
        System.out.println("Matricula do Usuario: " + usuario.getMat());
        System.out.println("Nome do usuario: " + usuario.getNom());
       
        System.out.println("");
        System.out.println("Matricula do Professor: " + professor.getMat());
        System.out.println("Nome do usuario: " + professor.getNom());
       
        System.out.println("");
        System.out.println("Matricula do Aluno: " + aluno.getMat());
        System.out.println("Nome do usuario: " + aluno.getNom());
       
        usuario.exibeDados();
        professor.exibeDados();
        aluno.exibeDados();    
    }
}
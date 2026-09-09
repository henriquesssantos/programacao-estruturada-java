public class SegundoExemploPolimorfismo
{
    public static void main(String args[])
    {
        //criar um novo usuário do tipo Professor no sistema
        Professor professor = new Professor( Teclado.leInt("Informe a matrícula do professor: "),
                                             Teclado.leString("Informe o nome do professor: "),
                                             Teclado.leString("Informe o login do professor: "),
                                             Teclado.leString("Informe a senha do professor: ")
                                           );
        professor.setAreaAtuacao(Teclado.leString("Informe a área de atuação do professor: "));
                                           
        //criar um novo usuário do tipo Aluno no sistema
        Aluno aluno = new Aluno( Teclado.leInt("Informe a matrícula do aluno: "),
                                 Teclado.leString("Informe o nome do aluno: "),
                                 Teclado.leString("Informe o login do aluno: "),
                                 Teclado.leString("Informe a senha do aluno: ")
                               );

        System.out.println("\n=== EXIBIÇÃO DOS DADOS (POLIMORFISMO) ===");
        
        // Apenas as subclasses chamam o método exibeDados()
        professor.exibeDados();
        aluno.exibeDados();
    }
}

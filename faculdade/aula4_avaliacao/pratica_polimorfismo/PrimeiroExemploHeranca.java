public class PrimeiroExemploHeranca
{
    public static void main(String args[])
    {
        //criar um novo usuário do tipo Professor no sistema
        Professor professor = new Professor( Teclado.leInt("Informe a matrícula do professor: "),
                                             Teclado.leString("Informe o nome do professor: "),
                                             Teclado.leString("Informe o login do professor: "),
                                             Teclado.leString("Informe a senha do professor: ")
                                           );
        // Define a área de atuação do professor via teclado
        professor.setAreaAtuacao(Teclado.leString("Informe a área de atuação do professor: "));
                                           
        //criar um novo usuário do tipo Aluno no sistema
        Aluno aluno = new Aluno( Teclado.leInt("Informe a matrícula do aluno: "),
                                 Teclado.leString("Informe o nome do aluno: "),
                                 Teclado.leString("Informe o login do aluno: "),
                                 Teclado.leString("Informe a senha do aluno: ")
                               );
                               
        //Professor
        System.out.println("");
        System.out.println("Matrícula do professor: " + professor.getMatricula());
        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Área de atuação do professor: " + professor.getAreaAtuacao());
        
        //Aluno
        System.out.println("");
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
        System.out.println("Nome do aluno: " + aluno.getNome());
    }
}

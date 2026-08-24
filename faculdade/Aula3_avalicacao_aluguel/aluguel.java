
public class aluguel{
    private int codigo;
    private String DataInicio;
    private String DataFinal;
    private imovel residencia;
    private cliente locador;
    
public aluguel(int codigo, String DataInicio, String DataFinal ,imovel residencia,cliente locador){
    this.codigo = codigo;
    this.DataInicio = DataInicio;
    this.DataFinal = DataFinal;
    this.residencia = residencia;
    this.locador = locador;
}
public void exibeDados(){
    System.out.println("Codigo do aluguel: "+codigo);
    System.out.println("Data de inicio: "+DataInicio);
    System.out.println("Data de termino: "+DataFinal);
    System.out.println("Residencia: "+residencia);
    System.out.println("Cliente resposavel: "+locador);
}
}

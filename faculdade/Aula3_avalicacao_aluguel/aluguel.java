
public class aluguel{
    private int codigo;
    private String dataInicio;
    private String dataFinal;
    private imovel residencia;
    private cliente locador;
    
public aluguel(int codigo, String DataInicio, String DataFinal ,imovel residencia,cliente locador){
    this.codigo = codigo;
    this.dataInicio = DataInicio;
    this.dataFinal = DataFinal;
    this.residencia = residencia;
    this.locador = locador;
}
public void exibeDados(){
    System.out.println("Codigo do aluguel: "+codigo);
    System.out.println("Data de inicio: "+dataInicio);
    System.out.println("Data de termino: "+dataFinal);
    residencia.exibeDados();
    }
}

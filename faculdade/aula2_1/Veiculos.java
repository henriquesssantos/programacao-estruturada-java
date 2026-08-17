public class Veiculos{ //planta e metodos do objeto
    // 1 atributos
    private String marca;
    private String motor;
    private int ano;
    
    //construtor (os parametros que vou utilizar quando instanciar o objeto Veiculo)
    public Veiculos(String marca, String motor, int ano) {
    // this.marca é o atributo da classe; marca é o parâmetro recebido, sem o this. precisaria colocar uma variavel no construtor, como foi feito no computador ex:
    // public Computador(String marcaModelo, String processadorModelo, int ram) {
    this.marca = marca; 
    this.motor = motor;
    this.ano = ano;
}

// ==========================================
// 3. MÉTODOS GETTERS E SETTERS
// ==========================================


// Atenção: Nenhuma função no Java fica "apenas com public". 
// Depois do public, sempre deve vir o void (se ela não devolver nada) ou o tipo do dado (String, int, double, etc.) 
// que ela vai retornar! "public void acao()" Faz algo e não devolve nada.
// "public String buscarTexto()" Faz algo e devolve um texto (String).
// "public int calcularSoma()" Faz algo e devolve um número inteiro (int).

public String getMarca(){
    return marca; // apenas devolve a informacao
    // o metodo get é usado para criar a funcao de busca de informacao
}
public void setMarca(String marca){
    this.marca = marca; // altera informacao.
    // o metodo set faz retira o antigo valor da variavel, e coloca o novo.
}
public String getMotor(){
    return motor;
}
public void setMotor(String motor){
    this.motor = motor;
}
public int getAno(){
    return ano;
}
public void setAno(int ano){
    this.ano = ano;
}

public void exibeDados(){
    System.out.println("marca" + marca);
    System.out.println("motor" + motor);
    System.out.println("ano" + ano);
    
}
}
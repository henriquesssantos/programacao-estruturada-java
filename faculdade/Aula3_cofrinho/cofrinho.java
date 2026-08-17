public class cofrinho{
    
    private int qt50;
    private int qt25;
    private int qt10;
    private Pessoa dono;
    
    public cofrinho(Pessoa umaPessoa){ //criando um objeto do tipo "pessoa". com os mesmo atributos
        dono = umaPessoa;
    }
    public cofrinho(String umNome, int umaIdade){ //criando uma pessoa para depois criar o cofrinho dela, caso o objeto pessoa ainda não exista
        dono = new Pessoa(umNome, umaIdade);
    }
    public void setDono(Pessoa novoDono){
        this.dono = novoDono;
    }
    public Pessoa getDono(){
        return dono;
    }
    public void deposita50c(){
        qt50 = qt50 + 1;
    }
    public void deposita25c(){
        qt25 = qt25 + 1;
    }
    public void deposita10c(){
        qt10 = qt10 + 1;
    }
    public double calculaTotal(){
        double total;
        total = qt50*0.5 + qt25*0.25 + qt10*0.10;
        return total;
    }
    public String informaTotal(){
        return dono.getNome() + "tem um total de: " + calculaTotal() + "reais";
    }
}
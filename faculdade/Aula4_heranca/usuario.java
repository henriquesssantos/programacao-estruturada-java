
public class usuario{
    private int mat;
    private String nom;
    private String log;
    private String sen;
    
    public usuario(int mat, String nom, String log, String sen){
        this.mat = mat;
        this.nom = nom;
        this.log = log;
        this.sen = sen;
    }
    // getters e setters
    public int getMat(){
        return mat;
    }
    public String getNom(){
        return nom;
    }
    public String getLog(){
        return log;
    }
    public String getSen(){
        return sen;
    }
    
    public void setMat(int mat){
        this.mat = mat;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setLog(String log){
        this.log = log;
    }
    public void SetSen(String sen){
        this.sen = sen;
    }
     public void exibeDados(){
        System.out.println("");
        System.out.println("Matricula: " + mat);
        System.out.println("Nome: " + nom);
        System.out.println("Login: " + log);
    }
}

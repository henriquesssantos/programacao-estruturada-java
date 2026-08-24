
public class aluno extends usuario{
    private double av1;
    private double av2;
public aluno(int mat, String nom, String log, String sen){
    super(mat,nom,log,sen);
    
}
public double getAv1(){
    return av1;
}
public double getAv2(){
    return av2;
}
public void setAv1(double av1){
    this.av1 = av1;
}
public void setAv2(double av2){
    this.av2= av2;
}
}

public class TesteCofrinho{
    
    public static void main(String args[]){
        cofrinho c1, c2;
        
        Pessoa p, p2;
        
        p = new Pessoa(Teclado.leString("nome do dono do cofrinho: "), Teclado.leInt("idade: "));
        
        c1 = new cofrinho(p);
        
        c1.deposita50c();
        c1.deposita25c();
        c1.deposita10c();
        
        c2 = new cofrinho(c1.getDono());
        
        c2.deposita50c();
        c2.deposita25c();
        
        System.out.println("--------------------------");
        System.out.println(c1.informaTotal());
        System.out.println(c2.informaTotal());
        System.out.println("--------------------------");
        
        double totalDoisCofrinhos;
        totalDoisCofrinhos = c1.calculaTotal() + c2.calculaTotal();
        
    }
}


public class Main {
    public static void main(String[] args) { // O botão Power do Java!
        
        // 1. Criamos um objeto real na memória usando nosso molde
        SwitchRede meuSwitch = new SwitchRede();
        
        // 2. Começamos a dar as ordens (chamando os métodos)
        
        // Tentando conectar algo com o switch desligado
        meuSwitch.conectarDispositivo(12); 
        
        // Ligando o equipamento
        meuSwitch.ligar(); 
        
        // Conectando uma câmera que consome 12w (Vai funcionar)
        meuSwitch.conectarDispositivo(12); 
        
        // Conectando um equipamento pesado que consome 45w (Vai barrar)
        meuSwitch.conectarDispositivo(45); 
    }
}
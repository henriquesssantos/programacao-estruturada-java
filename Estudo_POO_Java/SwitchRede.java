public class SwitchRede {
    // 1. ATRIBUTOS: O que o equipamento tem
    int portas = 8;
    int limitePotenciaPoE = 30; // 30w por porta
    boolean ligado = false;

    // 2. MÉTODOS: O que o equipamento faz
    public void ligar() {
        ligado = true;
        System.out.println("Switch ligado. Iniciando sistema operativo...");
    }

    public void conectarDispositivo(int consumoDispositivo) {
        // A lógica do negócio (os IFs) fica protegida e isolada aqui dentro!
        if (!ligado) {
            System.out.println("Erro: Não é possível conectar, o switch está desligado.");
        } else if (consumoDispositivo > limitePotenciaPoE) {
            System.out.println("ALERTA: Dispositivo de " + consumoDispositivo + "W excede o limite de " + limitePotenciaPoE + "W. Risco de queima da porta!");
        } else {
            System.out.println("Dispositivo de " + consumoDispositivo + "W conectado com sucesso. Fornecendo energia.");
        }
    }
}
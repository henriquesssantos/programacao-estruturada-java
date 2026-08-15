public class Computador {
    
    // 1. ATRIBUTOS (privados para proteger os dados)
    private String marca;
    private String processador;
    private int memoriaRam;

    // 2. CONSTRUTOR
    public Computador(String marcaModelo, String processadorModelo, int ram) {
        marca = marcaModelo;
        processador = processadorModelo;
        memoriaRam = ram;
    }

    // ==========================================
    // 3. MÉTODOS GETTERS E SETTERS
    // ==========================================

    // Para a Marca:
    public String getMarca() {
        return marca; // Apenas devolve a informação
    }

    public void setMarca(String novaMarca) {
        marca = novaMarca; // Substitui a marca antiga pela nova
    }

    // Para o Processador:
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String novoProcessador) {
        processador = novoProcessador;
    }

    // Para a Memória RAM:
    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int novaRam) {
        // Exemplo de como o Set protege a placa: só aceita valores válidos!
        if (novaRam > 0) {
            memoriaRam = novaRam;
        } else {
            System.out.println("Erro: A memória RAM não pode ser zero ou negativa!");
        }
    }

    // ==========================================
    // 4. OUTROS MÉTODOS (Ações do Computador)
    // ==========================================

    public void ligar() {
        System.out.println("O computador " + marca + " está ligando...");
    }

    public void exibeDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRam + "GB");
    }
}
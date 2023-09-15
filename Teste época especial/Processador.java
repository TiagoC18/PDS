public class Processador {
    private String modelo;
    private String frequencia;
    private String cache;

    public Processador(String modelo, String frequencia, String cache) {
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.cache = cache;
    }

    @Override
    public String toString() {
        return "[modelo=" + modelo + ", frequencia=" + frequencia + ", cache=" + cache + "]";
    }
    
}

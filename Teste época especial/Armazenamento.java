public class Armazenamento {
    private TipoArmazenamento tipo;
    private String tamanho;

    public Armazenamento(TipoArmazenamento tipo, String tamanho) {
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "[tipo=" + tipo + ", tamanho=" + tamanho + "]";
    }
    
}

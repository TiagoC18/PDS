import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Computador {
    private String nome;
    private Processador processador;
    private Memoria memoria;
    private Armazenamento armazenamento;
    private double preco;
    private String monitor;
    private String peso;
    private String tamanho;
    private List<String> interfaces;

    public static class Builder {
        private final String nome;
        private final Processador processador;
        private final Memoria memoria;
        private final Armazenamento armazenamento;
        private final double preco;
        private String monitor = "";
        private String peso = "";
        private String tamanho = "";
        private final List<String> interfaces;

        public Builder(String nome, Processador processador, Memoria memoria, Armazenamento armazenamento, double preco) {
            this.nome = nome;
            this.processador = processador;
            this.memoria = memoria;
            this.armazenamento = armazenamento;
            this.preco = preco;
            this.interfaces = new ArrayList<>();
        }

        public Builder monitor(String val) {
            monitor = val;
            return this;
        }

        public Builder peso(String val) {
            peso = val;
            return this;
        }

        public Builder tamanho(String val) {
            tamanho = val;
            return this;
        }

        public Builder addInterface(String descricao) {
            this.interfaces.add(descricao);
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }

    private Computador(Builder builder) {
        nome = builder.nome;
        processador = builder.processador;
        memoria = builder.memoria;
        armazenamento = builder.armazenamento;
        preco = builder.preco;
        monitor = builder.monitor;
        peso = builder.peso;
        tamanho = builder.tamanho;
        interfaces = builder.interfaces;
    }

    @Override
    public String toString() {
        StringJoiner interfaceJoiner = new StringJoiner("; ");
        for (String iface : interfaces) {
            interfaceJoiner.add(iface);
        }

        return "Computador - " + nome + ",\n" +
               "Processador " + processador + " ,\n" +
               "Armazenamento " + armazenamento + " ,\n" +
               "RAM " + memoria + " ,\n" +
               "interfaces= " + interfaceJoiner.toString() + " ;\n" +
               (monitor.isEmpty() ? "" : "monitor=" + monitor + " ,\n") +
               (tamanho.isEmpty() ? "" : "tamanho=" + tamanho + ",\n") +
               (peso.isEmpty() ? "" : "peso=" + peso + ",\n") +
               
               "preço=" + preco + ";";
    }
}

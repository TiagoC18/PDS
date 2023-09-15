public class InterfaceComunicacao {
    private String descricao;

    public InterfaceComunicacao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

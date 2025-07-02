package julia.faco.model;

public enum TipoProduto {
    BOLOS("Bolos"),
    TORTAS("Tortas");

    private final String nome;

    TipoProduto(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }
}

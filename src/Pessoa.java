public abstract class Pessoa implements IPessoas {
    protected String nome;
    protected String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String obterDetalhes() {
        return "Nome: " + nome + ", Endereço: " + endereco;
    }
}

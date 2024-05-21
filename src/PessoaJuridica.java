public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public void registrarPessoa(String dados) {
        System.out.println("Registrando pessoa jurídica com dados: " + dados);
    }

    @Override
    public String obterDetalhes() {
        return super.obterDetalhes() + ", CNPJ: " + cnpj;
    }
}

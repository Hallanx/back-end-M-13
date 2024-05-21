public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    @Override
    public void registrarPessoa(String dados) {
        System.out.println("Registrando pessoa física com dados: " + dados);
    }

    @Override
    public String obterDetalhes() {
        return super.obterDetalhes() + ", CPF: " + cpf;
    }
}

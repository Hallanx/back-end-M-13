public class Pessoas {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "123.456.789-00");
        pf.registrarPessoa("Dados de João Silva");
        System.out.println(pf.obterDetalhes());

        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Avenida B, 456", "12.345.678/0001-99");
        pj.registrarPessoa("Dados da Empresa XYZ");
        System.out.println(pj.obterDetalhes());
    }
}
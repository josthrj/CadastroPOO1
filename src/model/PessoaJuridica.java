package model;

// Definição da classe PessoaJuridica, herdando de Pessoa
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println(
     
"CNPJ: " + cnpj);
    }
}



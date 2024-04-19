package model;

public class PessoaFisica extends Pessoa {
    // Campos adicionais
    private String cpf;
    private int idade;

    // Construtores
    public PessoaFisica() {
        super(); // Chama o construtor padrão da superclasse Pessoa
    }

    public PessoaFisica(int id, String nome, String cpf, int idade) {
        super(id, nome); // Chama o construtor completo da superclasse Pessoa
        this.cpf = cpf;
        this.idade = idade;
    }

    // Método exibir polimórfico
    @Override
    public void exibir() {
        super.exibir(); // Chama o método exibir da superclasse Pessoa
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }

    // Getters e setters para os campos adicionais
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

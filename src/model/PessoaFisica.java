package model;

public class PessoaFisica extends Pessoa {
    // Campos adicionais
    private String cpf;
    private int idade;

    // Constructor
    public PessoaFisica() {
        super(); // Llama al constructor padrão de la superclase Pessoa
    }

    public PessoaFisica(int id, String nome, String cpf, int idade) {
        super(id, nome); // Llama al constructor completo de la superclase Pessoa
        this.cpf = cpf;
        this.idade = idade;
    }

    // Método exibir polimórfico
    @Override
    public void exibir() {
        super.exibir(); // Llama al método exibir de la superclase Pessoa
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }

    // Getters y setters para los campos adicionales
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

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de PessoaFisica
        PessoaFisica pessoaFisica = new PessoaFisica(1, "João", "12345678900", 30);

        // Llamar al método exibir para mostrar los datos
        pessoaFisica.exibir();
    }
}

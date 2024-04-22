package model;

import java.util.ArrayList;

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

    // Clase PessoaFisicaRepo para gerenciar as entidades PessoaFisica
    public static class PessoaFisicaRepo {
        private ArrayList<PessoaFisica> pessoas = new ArrayList<>();

        // Método para inserir uma PessoaFisica
        public void inserir(PessoaFisica pessoa) {
            pessoas.add(pessoa);
        }

        // Método para alterar uma PessoaFisica existente
        public void alterar(int index, PessoaFisica pessoa) {
            if (index >= 0 && index < pessoas.size()) {
                pessoas.set(index, pessoa);
            } else {
                System.out.println("Índice inválido.");
            }
        }

        // Método para excluir uma PessoaFisica existente
        public void excluir(int index) {
            if (index >= 0 && index < pessoas.size()) {
                pessoas.remove(index);
            } else {
                System.out.println("Índice inválido.");
            }
        }

        // Método para obter uma PessoaFisica pelo índice
        public PessoaFisica obter(int index) {
            if (index >= 0 && index < pessoas.size()) {
                return pessoas.get(index);
            } else {
                System.out.println("Índice inválido.");
                return null;
            }
        }

        // Método para obter todas as PessoasFisicas
        public ArrayList<PessoaFisica> obterTodos() {
            return pessoas;
        }

        public void persistir(String arquivoPessoaFisica) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'persistir'");
        }

        public void recuperar(String arquivoPessoaFisica) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'recuperar'");
        }
    }
}

package model;

import java.util.ArrayList;

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
        System.out.println("CNPJ: " + cnpj);
    }

    // Classe PessoaJuridicaRepo para gerenciar as entidades PessoaJuridica
    public static class PessoaJuridicaRepo {
        private ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

        // Método para inserir uma PessoaJuridica
        public void inserir(PessoaJuridica pessoaJuridica) {
            pessoasJuridicas.add(pessoaJuridica);
        }

        // Método para alterar uma PessoaJuridica existente
        public void alterar(int index, PessoaJuridica pessoaJuridica) {
            if (index >= 0 && index < pessoasJuridicas.size()) {
                pessoasJuridicas.set(index, pessoaJuridica);
            } else {
                System.out.println("Índice inválido.");
            }
        }

        // Método para excluir uma PessoaJuridica existente
        public void excluir(int index) {
            if (index >= 0 && index < pessoasJuridicas.size()) {
                pessoasJuridicas.remove(index);
            } else {
                System.out.println("Índice inválido.");
            }
        }

        // Método para obter uma PessoaJuridica pelo índice
        public PessoaJuridica obter(int index) {
            if (index >= 0 && index < pessoasJuridicas.size()) {
                return pessoasJuridicas.get(index);
            } else {
                System.out.println("Índice inválido.");
                return null;
            }
        }

        // Método para obter todas as PessoasJuridicas
        public ArrayList<PessoaJuridica> obterTodos() {
            return pessoasJuridicas;
        }

        public void persistir(String arquivoPessoaJuridica) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'persistir'");
        }

        public void recuperar(String arquivoPessoaJuridica) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'recuperar'");
        }
    }
}

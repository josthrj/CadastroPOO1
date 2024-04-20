package model;

import java.io.Serializable;

public class Pessoa implements Serializable {
    // Campos
    private int id;
    private String nome;

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Pessoa
        Pessoa pessoa = new Pessoa(1, "Joao");

        // Llamar al método exibir para mostrar los datos
        pessoa.exibir();
    }

    // Constructor padrão
    public Pessoa() {
    }

    // Constructor completo
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Método para exibir os dados
    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

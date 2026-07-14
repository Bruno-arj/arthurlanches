package br.com.arthurlanches.model;

import jakarta.persistence.Entity;

@Entity
public class CachorroQuente extends Produto {

    private String ingredientes;

    public CachorroQuente() {
    }

    public CachorroQuente(String nome, double preco, String ingredientes) {
        super(nome, preco);
        this.ingredientes = ingredientes;
    }
}
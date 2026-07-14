package br.com.arthurlanches.model;

import jakarta.persistence.Entity;


@Entity
public class BatataFrita extends Produto {

    private String tamanho;

    public BatataFrita() {
        super();
    }

    public BatataFrita(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }
}
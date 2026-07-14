package br.com.arthurlanches.model;

import jakarta.persistence.Entity;


@Entity
public class Bebida extends Produto {

    private String tipo;

    public Bebida() {
    }

    public Bebida(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

}
package model;

import jakarta.persistence.Entity;

@Entity
public class Hamburguer extends Produto {

    private String ingredientes;
    private double valormonetario;
    public Hamburguer() {
        super();
    }

    public Hamburguer(String nome, double preco, String ingredientes) {
        super(nome, preco);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

}
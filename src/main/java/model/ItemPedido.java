package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Produto produto;

    private int quantidade;

    private double subtotal;

    public ItemPedido(Pedido pedido, Produto produto, int quantidade, double subtotal) {
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
    }
}
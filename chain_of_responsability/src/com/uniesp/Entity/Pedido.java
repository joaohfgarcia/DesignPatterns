package com.uniesp.Entity;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Item> itens = new ArrayList<Item>();

    private Double valor = 0.0;

    public void addItem(Item item){
        this.itens.add(item);
    }

    public ArrayList<Item> getItens() {
        return this.itens;
    }

    public Double getValor() {
        for (int i=0; i<itens.size(); i++)
            this.valor += itens.get(i).getValor();
        return this.valor;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadequadrinhos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 55649
 */
public class Caixa extends Item {
    private List<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
    }

    @Override
    public void exibir() {
        System.out.println("Parabens! A sua Caixa contem: ");
        for (Item item : itens) {
            item.exibir();
        }
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}


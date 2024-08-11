/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadequadrinhos;

/**
 *
 * @author 55649
 */
public abstract class Item {
    protected String nome;
    protected double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void exibir();
}


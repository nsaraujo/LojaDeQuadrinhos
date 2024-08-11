/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadequadrinhos;

/**
 *
 * @author 55649
 */
public class Adesivos extends Item {
    public Adesivos() {
        this.nome = "Adesivo";
        this.preco = 1.00;
    }

    @Override
    public void exibir() {
        System.out.println(nome + ": R$" + preco);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadequadrinhos;

/**
 *
 * @author 55649
 */
public class Bustos extends Item {
    public Bustos() {
        this.nome = "Busto";
        this.preco = 10.00;
    }

    @Override
    public void exibir() {
        System.out.println(nome + ": R$" + preco);
    }
}

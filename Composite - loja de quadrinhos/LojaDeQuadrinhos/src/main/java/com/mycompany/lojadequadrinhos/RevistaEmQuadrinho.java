/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadequadrinhos;

/**
 *
 * @author 55649
 */
public class RevistaEmQuadrinho extends Item {
    
    public RevistaEmQuadrinho() {
        this.nome = "Quadrinho";
        this.preco = 15.00;
    }

    @Override
    public void exibir() {
        System.out.println(nome + ": R$" + preco);
    }
}



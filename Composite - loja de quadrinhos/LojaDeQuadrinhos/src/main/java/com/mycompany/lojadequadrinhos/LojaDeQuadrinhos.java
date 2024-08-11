/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lojadequadrinhos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 55649
 */
public class LojaDeQuadrinhos {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Caixa caixaBronze = criarCaixa(3);
        Caixa caixaPrata = criarCaixa(5);
        Caixa caixaOuro = criarCaixa(7);
        Caixa caixaPlatina = criarCaixa(10);

        System.out.println("Caixa Bronze:");
        caixaBronze.exibir();
        System.out.println("Valor total: R$" + caixaBronze.getPreco() + "\n");

        System.out.println("Caixa Prata:");
        caixaPrata.exibir();
        System.out.println("Valor total: R$" + caixaPrata.getPreco() + "\n");

        System.out.println("Caixa Ouro:");
        caixaOuro.exibir();
        System.out.println("Valor total: R$" + caixaOuro.getPreco() + "\n");

        System.out.println("Caixa Platina:");
        caixaPlatina.exibir();
        System.out.println("Valor total: R$" + caixaPlatina.getPreco() + "\n");
    }

    private static Caixa criarCaixa(int numeroDeItens) {
        Caixa caixa = new Caixa();
        for (int i = 0; i < numeroDeItens; i++) {
            caixa.adicionar(gerarItemAleatorio());
        }
        return caixa;
    }

    private static Item gerarItemAleatorio() {
        List<Class<? extends Item>> tiposDeItens = new ArrayList<>();
        tiposDeItens.add(RevistaEmQuadrinho.class);
        tiposDeItens.add(Chaveiros.class);
        tiposDeItens.add(Bustos.class);
        tiposDeItens.add(Adesivos.class);
        tiposDeItens.add(Posters.class);
        tiposDeItens.add(Camisetas.class);
        tiposDeItens.add(Canetas.class);
        tiposDeItens.add(Miniaturas.class);

        int indexAleatorio = random.nextInt(tiposDeItens.size());

        try {
            return tiposDeItens.get(indexAleatorio).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}


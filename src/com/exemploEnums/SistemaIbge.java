package com.exemploEnums;

import com.exemploEnums.exemploEnums;

public class SistemaIbge {

    public static void main(String[] args) {
        for (exemploEnums e: exemploEnums.values()) {

            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());


            
        }

        exemploEnums eb = exemploEnums.PIAUI;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());

    }
}

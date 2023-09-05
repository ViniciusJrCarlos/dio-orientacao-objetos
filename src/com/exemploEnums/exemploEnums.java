package com.exemploEnums;

public enum exemploEnums {
    //public static void main(String[] args) {
       // System.out.println("Hello world!");

        SAO_PAULO ("sp", "São Paulo", 11),
        RIO_DE_JANEIRO ("rj", "Rio de Janeiro", 12),
        PIAUI ("pi", "Piaui", 13),

        MARANHAO ("ma", "maranhao", 14),


        CEARA ("ce", "ceara", 15);

        private String nome;
        private String sigla;

        private int ibge;

        private exemploEnums(String sigla, String nome, int ibge) {

            this.sigla = sigla;
            this.nome = nome;
            this.ibge = ibge;

        }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
            return nome.toUpperCase();
    }

}

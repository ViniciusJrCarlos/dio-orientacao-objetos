package com.lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada() {

        System.out.println("CONTROLANDO ENTRADA DOS ITENS");

    }

    private void controlarSaida() {

        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }
     //default
    void entregarIngredientes(){

        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();

    }
    //default
    void trocarGas(){

        System.out.println("ALMOXARIFE TROCANDO O GAS");

    }
}

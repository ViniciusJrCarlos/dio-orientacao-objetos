package com.lanchonete.area.cliente;

public class Cliente {

    public void escolherLanche() {

        System.out.println("ESCOLHER O LANCHE");
    }

    public void fazerPedido() {

        System.out.println("FAZENDO O PEDIDO");
    }

    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("PAGANDO A CONTA");

    }
    private void consultarSaldoAplicativo() {

        System.out.println("CONSULTA SALDO NO APLICATIVO");

    }

    //public void pegarPedidoBalcao() {

        //System.out.println("PEGANDO O PEDIDO NO BALCAO");

    //}

}

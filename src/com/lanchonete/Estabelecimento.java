package com.lanchonete;

public class Estabelecimento {

    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();

        //acao que nao precisa estar disponivel a toda aplicacao

        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminasLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();

        //acao que o estabelecimento precisa ter ciencia

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //almoxarife

        Almoxarife almoxarife = new Almoxarife();

        //acoes que nao precisam estar disponiveis a toda aplicacao

        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        //acao que somente o seu pacote cozinha precisa conhecer default

        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //acao que somente o seu pacote cozinha precisa conhecer default

        atendente.trocarGas();

        //cliente
        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //nao deveria mais o estabelecimento ainda nao definiu as normas de atendimento

        cliente.pegarPedidoBalcao();

        //esta acao e muito sigilosa,
        cliente.consultarSaldoAplicativo();

        //ja pensou os cliente ouvindo que o gás acabou
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}

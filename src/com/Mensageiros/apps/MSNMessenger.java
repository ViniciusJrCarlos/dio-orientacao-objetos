package com.Mensageiros.apps;

//public class MSNMessenger extends ServicoMensagemInstantanea {

    /*
    EXEMPLO SEM POLIMORFISMO E HERANÇA
    public void enviarMensagem() {
        //acao antes de enviar a mensagem como private encapsulado
        validarConectadoInternet();

        System.out.println("enviando mensagem");
        //acao depos de enviar a mensagem como private encapsulado
        SalvarHistoricoMensagem();
    }

    public void receberMensagem(){

        System.out.println("recebendo mensagem");

    }
    private void validarConectadoInternet() {

        System.out.println("validando se está conectado a internet");

    }

    private void SalvarHistoricoMensagem() {

        System.out.println("Salvando o historico da mensagem");
    }
        //////////////////////////////////////////////////
     */

//}

public class MSNMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {

        validarConectadoInternet();

        System.out.println("Enviando mensagem pelo msn messenger");

    }
    public void receberMensagem() {

        System.out.println("Recebendo mensagem pelo msn messenger");

    }

}









package com.Mensageiros.apps;


//public class Telegram extends ServicoMensagemInstantanea {

    /*
    public void enviarMensagem() {
        //acao antes de enviar a mensagem como private encapsulado
        validarConectadoInternet();

        System.out.println("enviando mensagem pelo telegram");
        //acao depos de enviar a mensagem como private encapsulado
        SalvarHistoricoMensagem();
    }

    public void receberMensagem(){

        System.out.println("recebendo mensagem pelo telegram");

    }
    private void validarConectadoInternet() {

        System.out.println("validando se está conectado a internet");

    }

    private void SalvarHistoricoMensagem() {

        System.out.println("Salvando o historico da mensagem");
    }

     */
//}

public class Telegram extends ServicoMensagemInstantanea{

    public void enviarMensagem() {

        validarConectadoInternet();

        System.out.println("Enviando mensagem pelo telegram");
    }

    public void receberMensagem() {

        System.out.println("recebendo mensagem pelo telegram");
    }
}


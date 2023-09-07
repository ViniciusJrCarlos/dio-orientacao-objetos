package com.Mensageiros.apps;

//public class ServicoMensagemInstantanea {

    /*

     //SEM UTILIZAR O METODOS ABSTRACT
    public void enviarMensagem() {

        validarConectadoInternet();
        System.out.println("Enviando mensagem");

        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("recebendo mensagem");
    }

    private void validarConectadoInternet() {
    }

    private  void salvarHistoricoMensagem() {


    }

 }
    */
    //SOMENTE OS FILHOS CONHECEM ESTE MÉTODO

    public abstract class ServicoMensagemInstantanea {
        public abstract void enviarMensagem();

        public abstract void receberMensagem();

    //somente os filhos conhecem este método
        protected void validarConectadoInternet() {

            System.out.println("Validando se está conectado a internet");

        }

    }



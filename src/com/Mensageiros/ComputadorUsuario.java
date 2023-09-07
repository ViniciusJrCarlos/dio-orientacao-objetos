package com.Mensageiros;

import com.Mensageiros.apps.FacebookMessenger;
import com.Mensageiros.apps.MSNMessenger;
import com.Mensageiros.apps.ServicoMensagemInstantanea;
import com.Mensageiros.apps.Telegram;

public class ComputadorUsuario {

    public static void main(String[] args) {
        /*
        //EXEMPLO SEM O USO DO POLIMORFIRMO E HERANÇAS
        MSNMessenger msn = new MSNMessenger();


        msn.enviarMensagem();
        msn.receberMensagem();

        ///essas acoes nao precisar estar com public visivel para todos
        ///podem ser encapsulados com private e serem chamados na class msnmessenger
        ///msn.SalvarHistoricoMensagem();
       /// msn.validarConectadoInternet();

        FacebookMessenger fcb = new FacebookMessenger();

        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();


         */

        //EXEMPLO COM POLIMORFIRMO E HERANÇA
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn")) {

            smi = new MSNMessenger();


        } else if (appEscolhido.equals("fbm")) {

            smi = new FacebookMessenger();

        } else if (appEscolhido.equals("tlg")) {

            smi = new Telegram();

        }

        smi.enviarMensagem();
        smi.receberMensagem();
        //smi.validarConectadoInternet();

    }
}

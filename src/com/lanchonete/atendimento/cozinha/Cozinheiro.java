package com.lanchonete.atendimento.cozinha;

import com.lanchonete.atendimento.Atendente;

public class Cozinheiro {

        public void adicionarLancheNoBalcao() {

            System.out.println("ADICIONANDO LANCHE NATURAL DE HAMBURGUER NO BALCAO");

        }
        public void adicionarSucoNoBalcao() {

            System.out.println("ADICIONANDO SUCO NO BALCAO");

        }

        public void adicionarComboNoBalcao() {

            adicionarLancheNoBalcao();
            adicionarSucoNoBalcao();

        }

        private void prepararLanche() {

            System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");

        }

        private void prepararVitamina() {

            System.out.println("PREPARANDO SUCO");

        }

        private void prepararCombo() {

            prepararLanche();
            prepararVitamina();

        }

        private void selecionarIngredientesLanche() {

            System.out.println("SELECIONANDO O PAO, SALADA, OVO E CARNE");

        }

        private void selecionarIngredientesVitamina() {

            System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");

        }

        private void lavarIngredientes() {

            System.out.println("LAVANDO INGREDIENTES");
        }

        private void baterVitaminasLiquidificador() {

            System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");

        }

        private void fritarIngredientesLanche() {

            System.out.println("FRITANDO A CARNE E OVO PARA HAMBURGUER");
        }

        // questao de hierarquia de pacotes o cozinheiro nao pode pedir para o atendente trocar o gas somente almoxarife
        /*
        public void pedirParaTrocarGas(Atendente meuAmigo) {

            meuAmigo.trocarGas();
        }
        */
        private void pedirParaTrocarGas(Almoxarife meuAmigo) {

            meuAmigo.trocarGas();
        }

        private void pedirIngredientes(Almoxarife almoxarife) {

            almoxarife.entregarIngredientes();
        }
    }


package model;

    public enum CorRoupa {
        AMARELO("Amarelo"), AZUL("Azul"), BRANCO("Branco"), CINZA("Cinza"), PRETO("Preto"), VERDE("Verde"),
        VERMELHO("Vermelho");


        private String cor;

        CorRoupa(String cor) {
            this.cor = cor;
        }

        public String getCor() {
            return cor;
        }
    }

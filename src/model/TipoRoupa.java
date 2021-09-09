package model;

public enum TipoRoupa {
    
        VESTIDO("Vestido"), SAIA("Saia"), CONJUNTO("Conjunto"), CAMISETA("Camiseta"), CALCA("Calca"), SHORTS("Shorts"), OUTRO("Outro");
        private String tipo;

        TipoRoupa(String tipo){
            this.tipo = tipo;
        }

        public String getTipo(){
            return tipo;
        }  
}

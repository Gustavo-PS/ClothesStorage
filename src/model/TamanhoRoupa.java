package model;

public enum TamanhoRoupa {
    P("P"), M("M"), G("G"), OUTRO("Outro");

      private String tamanho;

      TamanhoRoupa(String tamanho) {
          this.tamanho = tamanho;
      }

      public String getTamanho() {
          return tamanho;
      }
  }

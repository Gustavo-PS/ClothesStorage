package model;

import java.io.File;
import java.io.IOException;

public class Conexao {

    public void VerificaArquivo() throws IOException {
        
        File arquivo = new File("save\\save.txt");
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
}

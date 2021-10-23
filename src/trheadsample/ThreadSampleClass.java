package trheadsample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.scene.paint.Stop;

public class ThreadSampleClass extends Thread {

    private int _acao;

    public ThreadSampleClass(int acao) {
        _acao = acao;
    }

    @Override
    public void run() {
        try {
            VerificaArquivo();
            FileWriter writer = new FileWriter("log.txt");
            StringBuilder sb = new StringBuilder();
            String logsAtuais = leLogs();
            sb.append(logsAtuais);
            if (_acao == 1) {
                sb.append("Adicionou no horário: " + Instant.now().toString());
                writer.write(sb.toString());
                writer.close();
                close();
            } else {

                sb.append("Excluiu no horário: " + Instant.now().toString());
                writer.write(sb.toString());
                writer.close();
                close();
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void close() {
    }

    public void VerificaArquivo() throws IOException {

        File arquivo = new File("log.txt");
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

    public String leLogs() throws IOException {
        Path caminho = Paths.get("save\\save.txt");
        List<String> listaRetorno = Files.readAllLines(caminho, StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();

        for (String string : listaRetorno) {
            sb.append(string + "\n");
        }
        return sb.toString();
    }

}
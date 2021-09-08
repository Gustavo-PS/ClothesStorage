package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import model.Roupa;

public class ConexaoController {

    public void InsereRoupa(Roupa roupa) throws IOException {

        List<String> lista = lerRoupasAdicionarExcluir();

        if (roupa.getCod() == 0) {
            return;
        }
        String linhaAdd = String.valueOf(roupa.getCod()) + "&" + roupa.getDataEntrada() + "&"
                + roupa.getLocalCompra() + "&" + roupa.getMarca() + "&" + roupa.getDescricao() + "&"
                + roupa.getValorEtiqueta() + "&" + roupa.getValorPago() + "&" + roupa.getValorMargem() + "&"
                + roupa.getValorSugerido();


        lista.add(linhaAdd);
        StringBuilder sb = new StringBuilder();
        FileWriter writer = new FileWriter("save\\save.txt");

        try {

            for (String item : lista) {
                sb.append(item + "\n");
            }

            writer.write(sb.toString());
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        } finally {
            writer.close();
        }

    }

    public static void DeleteRoupa() throws IOException {

        List<String> lista = lerRoupasAdicionarExcluir();
        String exibe = lerRoupas(lerRoupasAdicionarExcluir());
        System.out.println(exibe);

        StringBuilder sb = new StringBuilder();

        System.out.println("Qual o ID da roupa que deseja excluir?");
        int resposta = 0;

        try {
            resposta = Integer.parseInt(System.console().readLine());
        } catch (Exception erro) {
            System.out.println("Digite um id válido");
        }

        FileWriter writer = new FileWriter("save\\save.txt");
        lista.remove(resposta - 1);

        for (String string : lista) {
            
            sb.append(string + "\n");
        }

        writer.write(sb.toString());
        writer.close();
    }

    public static void ListaRoupas() throws IOException {
        lerRoupas(lerRoupasAdicionarExcluir());
    }

    public static List<String> lerRoupasAdicionarExcluir() throws IOException {
        Path caminho = Paths.get("save\\save.txt");
        List<String> listaRetorno = Files.readAllLines(caminho, StandardCharsets.UTF_8);
        return listaRetorno;
    }

    public static String lerRoupas(List<String> lista) throws IOException {

        lista = lerRoupasAdicionarExcluir();
        StringBuilder sb = new StringBuilder();
        int count = 1;

        if (lista.isEmpty()) {
            return "Não há roupas";
        } else {
            for (String string : lista) {
                if (string != "") {
                    String[] linha = string.split("&");
                    sb.append("ID: " + count + "\n" + "Código da Peça: " + linha[0] + "\n" + "Data de Entrada: "
                            + linha[1] + "\n" + "Local da Compra: " + linha[2] + "\n" + "Marca: " + linha[3] + "\n"
                            + "Descrição: " + linha[4] + "\n" + "Valor da Etiqueta: " + linha[5] + "\n" + "Valor Pago: "
                            + linha[6] + "\n" + "Valor Margem: " + linha[7] + "\n" + "Valor Sugerido: " + linha[8]
                            + "\n" + "\n");
                    count++;
                }

            }
        }
        return sb.toString();
    }
}

package view;

import model.Conexao;
import controller.*;
import java.io.IOException;
import java.time.Instant;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.printf("%s - Início do main Thread!\n", Instant.now().toString());

        Conexao cnx = new Conexao();
        cnx.VerificaArquivo();
        ExibeMenu();
    }

    public static void ExibeMenu() throws InterruptedException, IOException {
        limparTela();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("|  Seja bem vindo ao sistema de estoque de roupas  |");
        System.out.println("----------------------------------------------------");
        System.out.println("|            O que deseja fazer hoje?              |");
        System.out.println("----------------------------------------------------");
        System.out.println("|            1 - Adicionar item                    |");
        System.out.println("|            2 - Editar item                       |");
        System.out.println("|            3 - Deletar item                      |");
        System.out.println("|            4 - Visualizar todos os itens         |");
        System.out.println("|            5 - Sair                              |");
        System.out.println("----------------------------------------------------");

        int option = 0;

        try {
            option = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Digite uma opção válida");
        }

        switch (option) {
        case 1:
            try {
                RoupaController roupa = new RoupaController();
                ConexaoController cnxController = new ConexaoController();
                cnxController.InsereRoupa(roupa.CriarRoupa(), 0);
                limparTela();
                System.out.println("Item adicionado com sucesso");
                Thread.sleep(3000);
                ExibeMenu();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
                ExibeMenu();
            }

        case 2:
            try {
                ConexaoController.EditaRoupa();
                limparTela();
                System.out.println("Item editado com sucesso");
                Thread.sleep(3000);
                ExibeMenu();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
                ExibeMenu();
            }

        case 3:
            try {
                ConexaoController.DeleteRoupa();
                limparTela();
                System.out.println("Item deletado com sucesso");
                Thread.sleep(3000);
                ExibeMenu();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
                ExibeMenu();
            }

        case 4:
            try {
                limparTela();
                System.out.println(ConexaoController.lerRoupas(ConexaoController.lerRoupasAdicionarExcluir()));
                System.out.println("Pressione Enter para seguir...");
                System.console().readLine();
                ExibeMenu();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
                ExibeMenu();
            }

        case 5:
            System.out.println("Até logo...");
            Thread.sleep(3000);
            System.exit(0);

        default:
            ExibeMenu();
        }
    }

    public static void limparTela() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}

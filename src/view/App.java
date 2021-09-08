package view;

import model.Conexao;
import controller.*;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Conexao cnx = new Conexao();
        cnx.VerificaArquivo();

        ExibeMenu();
        
    }

    public static void ExibeMenu() throws InterruptedException, IOException{
        limparTela();
        System.out.println("Seja bem vindo ao sistema de estoque de roupas");
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        try {
            var moveOn = false;

            do {
                System.out.println("O que deseja fazer hoje?");
                System.out.println("1 - Adicionar item");
                System.out.println("2 - Editar item");
                System.out.println("3 - Deletar item");
                System.out.println("4 - Visualizar todos os itens");
                System.out.println("5 - Sair");

                var option = scanner.nextInt();
                System.out.println("----------------------------------");

                switch (option) {
                    case 1:
                    try{
                    RoupaController roupa = new RoupaController();
                    ConexaoController cnxController = new ConexaoController();
                    cnxController.InsereRoupa(roupa.CriarRoupa(),0);
                    System.out.println("Item adicionado com sucesso");
                    System.console().readLine();
                    ExibeMenu();
                    }
                    catch (Exception erro){
                        System.out.println(erro.getMessage());
                    }

                    case 2:
                    try{
                    ConexaoController.EditaRoupa();
                    System.out.println("Item editado com sucesso");
                    System.console().readLine();
                    ExibeMenu();
                    }
                    catch(Exception erro){
                        System.out.println(erro.getMessage());
                    }

                    case 3:
                    try{
                    ConexaoController.DeleteRoupa();
                    System.out.println("Item deletado com sucesso");
                    System.console().readLine();
                    ExibeMenu();
                    }
                    catch(Exception erro){
                        System.out.println(erro.getMessage());
                    }

                    case 4:
                    try{
                    System.out.println(ConexaoController.lerRoupas(ConexaoController.lerRoupasAdicionarExcluir()));
                    System.out.println("Pressione Enter para seguir...");
                    System.console().readLine();
                    ExibeMenu();
                    }
                    catch(Exception erro){
                        System.out.println(erro.getMessage());
                    }
                }

            } while (moveOn);

        } catch (Exception err) {
            System.out.println(err.getMessage());

        } finally {
            scanner.close();
        }
    }

    public static void limparTela() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}

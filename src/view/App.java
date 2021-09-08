package view;

import model.Conexao;
import controller.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Conexao cnx = new Conexao();
        cnx.VerificaArquivo();

        ExibeMenu();
        
    }

    public static void ExibeMenu(){
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
                    RoupaController roupa = new RoupaController();
                    ConexaoController cnxController = new ConexaoController();
                    cnxController.InsereRoupa(roupa.CriarRoupa());
                    break;

                    case 2:

                    case 3:
                    ConexaoController.DeleteRoupa();
                    break;

                    case 4:
                    System.out.println(ConexaoController.lerRoupas(ConexaoController.lerRoupasAdicionarExcluir()));
                    System.console().readLine();
                    break;
                }

            } while (moveOn);

        } catch (Exception err) {
            System.out.println(err.getMessage());

        } finally {
            scanner.close();
        }
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao sistema de estoque de roupas");
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        try 
        {
            var moveOn = false;
            
            do 
            {
                System.out.println("O que deseja fazer hoje?");
                System.out.println("1 - Adicionar item");
                System.out.println("2 - Editar item");
                System.out.println("3 - Deletar item");
                System.out.println("4 - Visualizar todos os itens");
                System.out.println("5 - Sair");

                var option = scanner.nextInt();
                System.out.println("----------------------------------");

                switch(option){
                    case 1:
                    
                }

            } while (moveOn);

        } catch (Exception err) 
        {

        } finally
        {
            scanner.close();
        }
    }
}

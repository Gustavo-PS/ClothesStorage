package controller;

import java.time.LocalDate;
import java.util.Scanner;

import model.Roupa;

public class RoupaController {

    Scanner scanner = new Scanner(System.in);

    public Roupa CriarRoupa() {
        Roupa roupa = new Roupa();

        try {

            System.out.println("Código da peça:");
            roupa.setCod(scanner.nextInt());

            roupa.setDataEntrada(LocalDate.now());
            scanner.nextLine();

            System.out.println("Local da compra:");
            roupa.setLocalCompra(scanner.nextLine());

            System.out.println("Marca:");
            roupa.setMarca(scanner.nextLine());

            System.out.println("Descrição:");
            roupa.setDescricao(scanner.nextLine());

            System.out.println("Valor de etiqueta na compra:");
            roupa.setValorEtiqueta(scanner.nextDouble());

            System.out.println("Valor pago na compra:");
            roupa.setValorPago(scanner.nextDouble());

            roupa.setValorMargem();
            scanner.nextLine();

            System.out.println("Valor sugerido:");
            roupa.setValorSugerido(scanner.nextDouble());
        }

        catch (Exception erro) {
            System.out.println("Digite um valor válido");
        }

        finally {
            scanner.close();
        }
        return roupa;

    }

}

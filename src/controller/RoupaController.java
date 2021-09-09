package controller;

import java.time.LocalDate;
import java.util.Scanner;

import model.CorRoupa;
import model.Roupa;
import model.Roupa.Tamanho;

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

            System.out.println(
                    "Selecione a cor da peça: \nOpções disponíveis: \n1 - AMARELO, \n2 - AZUL \n3 - BRANCO \n4 - CINZA \n5 - PRETO \n6 - VERDE \n7 - VERMELHO");
            CorRoupa corRoupaSelecionado = null;
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    corRoupaSelecionado = CorRoupa.AMARELO;
                    roupa.setCor(corRoupaSelecionado);
                    break;

                case 2:
                    corRoupaSelecionado = CorRoupa.AZUL;
                    roupa.setCor(corRoupaSelecionado);
                    break;

                case 3:
                    corRoupaSelecionado = CorRoupa.BRANCO;
                    roupa.setCor(corRoupaSelecionado);
                    break;
                case 4:
                    corRoupaSelecionado = CorRoupa.CINZA;
                    roupa.setCor(corRoupaSelecionado);
                    break;
                case 5:
                    corRoupaSelecionado = CorRoupa.PRETO;
                    roupa.setCor(corRoupaSelecionado);
                    break;
                case 6:
                    corRoupaSelecionado = CorRoupa.VERDE;
                    roupa.setCor(corRoupaSelecionado);
                    break;
                case 7:
                    corRoupaSelecionado = CorRoupa.VERMELHO;
                    roupa.setCor(corRoupaSelecionado);
                    break;
            }
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

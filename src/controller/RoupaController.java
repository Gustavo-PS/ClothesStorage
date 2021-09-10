package controller;

import java.time.LocalDate;
import java.util.Scanner;
import model.CorRoupa;
import model.Roupa;
import model.TamanhoRoupa;
import model.TipoRoupa;

public class RoupaController {

    Scanner scanner = new Scanner(System.in);

    public Roupa CriarRoupa() {
        Roupa roupa = new Roupa();

        try {
            // Código
            System.out.println("Código da peça:");
            roupa.setCod(scanner.nextInt());

            // Preenchimento automático da data de entrada
            roupa.setDataEntrada(LocalDate.now());
            scanner.nextLine();

            // Local da compra
            System.out.println("Local da compra:");
            roupa.setLocalCompra(scanner.nextLine());

            // Tipo da peça
            System.out.println(
                    "Selecione o tipo da peça: \nOpções disponíveis: \n1 - VESTIDO, \n2 - SAIA \n3 - CONJUNTO \n4 - CAMISETA \n5 - CALÇA \n6 - SHORTS \n7 - OUTRO");
            TipoRoupa tipoRoupaSelecionada = null;
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    tipoRoupaSelecionada = TipoRoupa.VESTIDO;
                    roupa.setTipoRoupa(tipoRoupaSelecionada);
                    ;
                    break;

                case 2:
                    tipoRoupaSelecionada = TipoRoupa.SAIA;
                    roupa.setTipoRoupa(tipoRoupaSelecionada);
                    ;
                    break;

                case 3:
                    tipoRoupaSelecionada = TipoRoupa.CONJUNTO;
                    roupa.setTipoRoupa(tipoRoupaSelecionada);
                    ;
                    break;

                case 4:
                    tipoRoupaSelecionada = TipoRoupa.CAMISETA;
                    roupa.setTipoRoupa(tipoRoupaSelecionada);
                    ;
                    break;

                case 5:
                    tipoRoupaSelecionada = TipoRoupa.CALCA;
                    roupa.setTipoRoupa(tipoRoupaSelecionada);
                    ;
                    break;

                case 6:
                    tipoRoupaSelecionada = TipoRoupa.SHORTS;
                    roupa.setTipoRoupa(tipoRoupaSelecionada);
                    ;
                    break;

                default:
                    tipoRoupaSelecionada = TipoRoupa.OUTRO;
                    roupa.setTipoRoupa(tipoRoupaSelecionada);
                    ;
                    break;
            }

            // Marca
            System.out.println("Marca:");
            roupa.setMarca(scanner.nextLine());

            // Características
            System.out.println("Descrição:");
            roupa.setDescricao(scanner.nextLine());

            // Tamanho
            System.out
                    .println("Selecione o tamanho da peça: \nOpções disponíveis: \n1 - P \n2 - M \n3 - G \n4 - OUTRO");
            TamanhoRoupa tamanhoRoupaSelecionado = null;
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    tamanhoRoupaSelecionado = TamanhoRoupa.P;
                    roupa.setTamanho(tamanhoRoupaSelecionado);
                    break;
                case 2:
                    tamanhoRoupaSelecionado = TamanhoRoupa.M;
                    roupa.setTamanho(tamanhoRoupaSelecionado);
                    break;
                case 3:
                    tamanhoRoupaSelecionado = TamanhoRoupa.G;
                    roupa.setTamanho(tamanhoRoupaSelecionado);
                    break;
                default:
                    tamanhoRoupaSelecionado = TamanhoRoupa.OUTRO;
                    roupa.setTamanho(tamanhoRoupaSelecionado);
                    break;
            }

            // Cor
            System.out.println(
                    "Selecione a cor da peça: \nOpções disponíveis: \n1 - AMARELO, \n2 - AZUL \n3 - BRANCO \n4 - CINZA \n5 - PRETO \n6 - VERDE \n7 - VERMELHO \n8 - OUTRO");
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
                default:
                    corRoupaSelecionado = CorRoupa.OUTRO;
                    roupa.setCor(corRoupaSelecionado);
                    break;

            }

            // Valor etiqueta
            System.out.println("Valor de etiqueta na compra:");
            roupa.setValorEtiqueta(scanner.nextDouble());

            // Valor pago
            System.out.println("Valor pago na compra:");
            roupa.setValorPago(scanner.nextDouble());

            // Preenchimento automático da margem de 100%
            roupa.setValorMargem();
            scanner.nextLine();

            // Valor sugerido
            System.out.println("Valor sugerido:");
            roupa.setValorSugerido(scanner.nextDouble());

        } catch (Exception erro) {
            System.out.println("Digite um valor válido");
        }

        finally {
            System.out.println("Close");
            // scanner.close();
        }
        //scanner.close();
        return roupa;
    }
}

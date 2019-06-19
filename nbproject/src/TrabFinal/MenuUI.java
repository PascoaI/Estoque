package TrabFinal;

import java.util.Scanner;

public class MenuUI {

    public void menuSistema() {
        Scanner scanner = new Scanner(System.in);
        FuncoesBasicas funcoes = new FuncoesBasicas();
        Produto prod = new Produto();


        int opcao = 0;

        do {
            System.out.println("\nOlá! Bem vindo ao Sistema de Controle de Estoque.");
            System.out.println("Selecione a operação desejada usando os números:");
            System.out.println(" ");
            System.out.println("\n[ 1 ] - Inserir produto");
            System.out.println("\n[ 2 ] - Adicionar produto ao estoque");
            System.out.println("\n[ 3 ] - Remover produto do estoque");
            System.out.println("\n[ 4 ] - Listar produtos do estoque");
            System.out.println("\n[ 5 ] - Listar produtos que estão abaixo do estoque");
            System.out.println("\n[ 6 ] - Sair");
            System.out.println("\nDigite uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    funcoes.registrarProd();
                    break;
                case 2:
                    funcoes.addProdEstoque();
                    break;
                case 3:
                    funcoes.removeProd();
                    break;
                case 4:
                    funcoes.listarProd();
                    break;
                case 5:
                    funcoes.listarProdAbaixoEstoque();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (opcao != 6);
    }
}

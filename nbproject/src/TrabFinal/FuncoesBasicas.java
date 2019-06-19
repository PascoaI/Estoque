package TrabFinal;
import java.util.ArrayList;
import java.util.Scanner;


public class FuncoesBasicas {

    ArrayList<Produto> estoque = new ArrayList<>();

    public void registrarProd() {
        Produto prod = new Produto();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nDigite o codigo do produto: ");
        prod.setCodigo(scanner.nextLine());

        System.out.printf("\nDigite o nome do produto: ");
        prod.setNome(scanner.nextLine());

        do {
            System.out.printf("\nDigite a quantidade de produtos: ");
            prod.setQtdProduto(scanner.nextInt());
        } while (prod.getQtdProduto() < 0);

        do {
            System.out.printf("\nDigite a quantidade mínima: ");
            prod.setQtdMinima(scanner.nextInt());
        } while (prod.getQtdMinima() < 0);

        estoque.add(prod);
        scanner.reset();
    }

    public void addProdEstoque() {
        Scanner scanner = new Scanner(System.in);
        String pesquisa;

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %30s %20s %10s ", "Código", "Nome", "Qtd. produtos", "Qtd. mínima");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(Produto prod: estoque) {
            System.out.format("%10s %30s %20d %10d ",
                    prod.getCodigo(), prod.getNome(), prod.getQtdProduto(), prod.getQtdMinima());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");


        System.out.println("Insira o codigo do produto a ser adicionado no estoque: ");
        pesquisa = scanner.nextLine();

        for (int i = 0; i < estoque.size(); i++) {
            Produto p = estoque.get(i);


            if (p.getCodigo().equals(pesquisa)) {
                int qtdAdd = 0;

                do {
                    System.out.println("Digite a quantidade a ser adicionada no estoque: ");
                    qtdAdd = scanner.nextInt();

                    if (qtdAdd <=0) {
                        System.out.println("Digite um valor maior que zero.");
                    }

                    int x = p.getQtdProduto() + qtdAdd;
                    p.setQtdProduto(x);
                }
                while (qtdAdd <= 0);
            }



            else {
                System.out.println("\nNenhum produto com este código foi encontrado!");
                System.out.println("\nPor favor, tente novamente abaixo.");
                System.out.println("\n");
                System.out.println("\n");
                scanner.reset();
                addProdEstoque();
            }
        }
        scanner.reset();
    }

    public void removeProd() {
        Scanner scanner = new Scanner(System.in);
        String pesquisa2;

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %30s %20s %10s ", "Código", "Nome", "Qtd. produtos", "Qtd. mínima");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(Produto prod: estoque) {
            System.out.format("%10s %30s %20d %10d ",
                    prod.getCodigo(), prod.getNome(), prod.getQtdProduto(), prod.getQtdMinima());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Insira o codigo do produto a ser removido do estoque: ");
        pesquisa2 = scanner.nextLine();

        for (int i = 0; i < estoque.size(); i++) {
            Produto p = estoque.get(i);

            if (p.getCodigo().equals(pesquisa2)) {
                int qtdRmv = 0;

                do {
                    System.out.println("Digite a quantidade a ser removida do estoque: ");
                    qtdRmv = scanner.nextInt();

                    if (qtdRmv <= 0) {
                        System.out.println("Digite um valor maior que zero.");
                    }

                    int z = p.getQtdProduto() - qtdRmv;

                    if (p.getQtdProduto() < qtdRmv) {
                        System.out.println("Quantidade de produtos inferior a 0! Repita a operação com uma nova quantia a ser removida.");
                    } else {
                        p.setQtdProduto(z);
                    }
                } while (qtdRmv <= 0 && (p.getQtdProduto() < qtdRmv));
                scanner.reset();
            }

            else {
                    System.out.println("\nCódigo de produto não encontrado!");

                    scanner.reset();
                    removeProd();
                }
            }
            scanner.reset();
        }

        public void listarProd() {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("%10s %30s %20s %10s ", "Código", "Nome", "Qtd. produtos", "Qtd. mínima");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
            for(Produto prod: estoque) {
                System.out.format("%10s %30s %20d %10d ",
                        prod.getCodigo(), prod.getNome(), prod.getQtdProduto(), prod.getQtdMinima());
                System.out.println();
            }
            System.out.println("-----------------------------------------------------------------------------");
        }

        public void listarProdAbaixoEstoque() {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("%10s %30s %20s %10s ", "Código", "Nome", "Qtd. produtos", "Qtd. mínima");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
            for(Produto prod: estoque) {
                if (prod.getQtdProduto() < prod.getQtdMinima()){
                    System.out.format("%10s %30s %20d %10d ",
                            prod.getCodigo(), prod.getNome(), prod.getQtdProduto(), prod.getQtdMinima());
                    System.out.println();
                }
            }
            System.out.println("-----------------------------------------------------------------------------");
        }
    }
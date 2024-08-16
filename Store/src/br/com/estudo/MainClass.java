package br.com.estudo;

import br.com.estudo.controller.StoreController;
import br.com.estudo.entity.StoreEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StoreController storeController = new StoreController();
        List <StoreEntity> storage = new ArrayList<>();

        String product;
        double productValue;
        int productQuantity;
        double totalProductValue;
        String newProduct;
        double newProductValue;
        int newProductQuantity;
        double newTotalProductValue;

        System.out.println("Bem vindo ao sistema da verdureira Bigbom 2.0");
        do {
            System.out.print("""
                    ----------Menu----------
                    1 Cadastrar produtos
                    2 Listar produtos cadastrados
                    3 Buscar por produto
                    4 Editar cadastro
                    5 Excluir cadastro
                    6 Encerrar sistema
                    ------------------------
                    Digite o valor desejado""" + " --> ");
            int enterdedValue = input.nextInt();
            switch (enterdedValue) {
                case 1:
                    input.nextLine();
                    System.out.print("Digite o nome do produto a ser cadastrado: ");
                    product = input.nextLine();

                    System.out.print("Digite o valor: ");
                    productValue = input.nextDouble();

                    System.out.print("Digite a quantidade: ");
                    productQuantity = input.nextInt();
                    totalProductValue = productValue * productQuantity;

                    StoreEntity storeEntity = storeController.registerProduct(product, productValue, productQuantity, totalProductValue);
                    storage.add(storeEntity);
                    break;
                case 2:
                    input.nextLine();
                    if (storage.isEmpty()) {
                        System.out.println("Não há itens cadastrados, faça o cadastro primeiro antes de listar os itens");
                        break;
                    }
                    storeController.showProducts(storage);
                    break;
                case 3:
                    input.nextLine();
                    if (storage.isEmpty()) {
                        System.out.println("Não há itens cadastrados, faça o cadastro primeiro antes de buscar produtos");
                        break;
                    }

                    System.out.print("Informe o ID od produto a ser buscado pelo sistema: ");
                    int iDFind = input.nextInt();
                    if (iDFind > storage.size() || iDFind < 0) {
                        System.out.println("Cadastro não localizado, retornando ao menu principal");
                        break;
                    }

                    StoreEntity itensFound = storage.get(iDFind);
                    storeController.findItens(itensFound);
                    break;
                case 4:
                    input.nextLine();
                    if (storage.isEmpty()) {
                        System.out.println("Não há itens cadastrados, faça o cadastro primeiro antes de editar itens");
                        break;
                    }

                    System.out.print("Informe o ID do produto que será editado pelo sistema: ");
                    int IdEdit = input.nextInt();
                    if (IdEdit > storage.size() || IdEdit < 0) {
                        System.out.println("Cadastro não localizado, retornando ao menu principal");
                        break;
                    }

                    input.nextLine();
                    System.out.print("Digite o novo nome do produto: ");
                    newProduct = input.nextLine();

                    System.out.print("Digite o novo valor do produto: ");
                    newProductValue = input.nextDouble();

                    System.out.print("Digite a nova quantidade: ");
                    newProductQuantity = input.nextInt();

                    newTotalProductValue = newProductValue * newProductQuantity;

                    StoreEntity newStoreEntity = storeController.registerProduct(newProduct, newProductValue, newProductQuantity, newTotalProductValue);
                    storage.set(IdEdit, newStoreEntity);
                    break;
                case 5:
                    input.nextLine();
                    if (storage.isEmpty()) {
                        System.out.println("Não há itens cadastrados, faça o cadastro primeiro antes de tentar remover produtos");
                        break;
                    }

                    System.out.print("Informe o ID do produto que será REMOVIDO do sistema: ");
                    int IdRemove = input.nextInt();
                    if (IdRemove > storage.size() || IdRemove < 0) {
                        System.out.println("Cadastro não localizado, retornando ao menu principal");
                        break;
                    }

                    storage.remove(IdRemove);
                    System.out.println("Item removido com sucesso");
                    break;
                case 6:
                    System.out.println("Sistema finalizado com sucesso");
                    input.close();
                    System.exit(0);
                    break;
                default: System.out.println("Valor digitado é inválido, retornando ao menu principal");
            }
        }while(true);
    }
}
package br.com.estudo.service;

import br.com.estudo.entity.StoreEntity;

import java.util.List;

public class StoreService {

    public StoreEntity registerProduct (String product, double productValue, int productQuantity, double totalProductValue) {
        StoreEntity storeEntity = new StoreEntity();
        storeEntity.setProduct(product);
        storeEntity.setProductValue(productValue);
        storeEntity.setProductQuantity(productQuantity);
        storeEntity.setTotalProductValue(totalProductValue);
        return storeEntity;
    }

    public void showProducts(List<StoreEntity> storage) {
        StoreEntity storeEntity = new StoreEntity();
        storeEntity.setAllProductQuantity(0);
        storeEntity.setAllProductsValue(0);
        int[] ID = {0};

        System.out.println("Produtos cadastrados no sistema");
        System.out.println("---------------");
        storage.forEach(singleProduct -> {
            System.out.println("ID: " + ID[0]);
            System.out.println("Produto: " + singleProduct.getProduct());
            System.out.println("Valor: R$ " + singleProduct.getProductValue());
            System.out.println("Quantidade: " + singleProduct.getProductQuantity());
            System.out.println("Valor agregado em estoque: " + singleProduct.getTotalProductValue());
            System.out.println("---------------");
            storeEntity.setAllProductsValue(storeEntity.getAllProductsValue() + (singleProduct.getProductValue()*singleProduct.getProductQuantity()));
            storeEntity.setAllProductQuantity(storeEntity.getAllProductQuantity() + singleProduct.getProductQuantity());
            ID[0]++;
        });

        System.out.println("Valor total dos itens em estoque; R$" + storeEntity.getAllProductsValue());
        System.out.println("Quantiade total de itens em estoque: " + storeEntity.getAllProductQuantity());
    }

    public void findItens (StoreEntity storeEntity) {
        System.out.println("---------------");
        System.out.println("Produto: " + storeEntity.getProduct());
        System.out.println("Valor: R$ " + storeEntity.getProductValue());
        System.out.println("Quantidade: " + storeEntity.getProductQuantity());
        System.out.println("Valor agregado em estoque: " + storeEntity.getTotalProductValue());
    }
}
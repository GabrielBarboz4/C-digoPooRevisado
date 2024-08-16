package br.com.estudo.controller;

import br.com.estudo.entity.StoreEntity;
import br.com.estudo.service.StoreService;

import java.util.List;

public class StoreController {
    StoreService storeService = new StoreService();

    public StoreEntity registerProduct (String product, double productValue, int productQuantity, double totalProductValue) {
        return storeService.registerProduct(product, productValue, productQuantity, totalProductValue);
    }

    public void showProducts(List<StoreEntity> storage) {
        storeService.showProducts(storage);
    }

    public void findItens (StoreEntity storeEntity) {
        storeService.findItens(storeEntity);
    }
}
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

    public void upgradeNewProduct (StoreEntity storeEntity, String newProduct) {
        storeService.upgradeNewProduct(storeEntity, newProduct);
    }

    public void upgradeNewValue (StoreEntity storeEntity, double newProductValue) {
        storeService.upgradeNewValue(storeEntity, newProductValue);
    }

    public void upgradeNewQuantity (StoreEntity storeEntity, int newProductQuantity) {
        storeService.upgradeNewQuantity(storeEntity, newProductQuantity);
    }
}
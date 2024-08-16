package br.com.estudo.entity;

public class StoreEntity {
    private String product;
    private double productValue;
    private int productQuantity;
    private double totalProductValue;
    private double allProductsValue;
    private int allProductQuantity;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAllProductQuantity() {
        return allProductQuantity;
    }

    public void setAllProductQuantity(int allProductQuantity) {
        this.allProductQuantity = allProductQuantity;
    }

    public double getAllProductsValue() {
        return allProductsValue;
    }

    public void setAllProductsValue(double allProductsValue) {
        this.allProductsValue = allProductsValue;
    }

    public double getTotalProductValue() {
        return totalProductValue;
    }

    public void setTotalProductValue(double totalProductValue) {
        this.totalProductValue = totalProductValue;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductValue() {
        return productValue;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }
}
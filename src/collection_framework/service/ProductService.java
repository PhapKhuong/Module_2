package collection_framework.service;

import collection_framework.model.Product;

public interface ProductService {

    void createProduct(Product product);

    void alterProduct(int id, String newName, String newOrigin, String newDateOfManufacture, long newPrice);

    void deleteProduct(int id);

    Product[] displayProduct();

    Product[] findProduct(String name);

    Product[] sortAscendingByPrice();

    Product[] sortDescendingByPrice();

}

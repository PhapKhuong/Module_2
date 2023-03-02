package collection_framework.repository;

import collection_framework.model.Product;

import java.time.LocalDate;

public interface ProductRepository {

    void createProduct(Product product);

    void alterProduct(int id, String newName, String newOrigin, LocalDate newDateOfManufacture, long newPrice);

    void deleteProduct(int id);

    Product[] displayProduct();

    Product[] findProduct(String name);

    Product[] sortAscendingByPrice();

    Product[] sortDescendingByPrice();
}
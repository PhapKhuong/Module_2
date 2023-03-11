package collection_framework.service;

import collection_framework.model.Product;

import java.time.LocalDate;
import java.util.List;

public interface ProductService {

    void createProduct(Product product);

    void alterProduct(int id, String newName, String newOrigin,
                      LocalDate newDateOfManufacture, long newPrice);

    void deleteProduct(int id);

    List<Product> displayProduct();

    List<Product> findProduct(String name);

    List<Product> sortAscendingByPrice();

    List<Product> sortDescendingByPrice();

}

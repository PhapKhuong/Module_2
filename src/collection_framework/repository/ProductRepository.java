package collection_framework.repository;

import collection_framework.model.Product;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public interface ProductRepository {

    void createProduct(Product product) throws IOException;

    void alterProduct(int id, String newName, String newOrigin,
                      LocalDate newDateOfManufacture, long newPrice) throws IOException;

    void deleteProduct(int id) throws IOException;

    List<Product> displayProduct();

    List<Product> findProduct(String name);

    List<Product> sortAscendingByPrice();

    List<Product> sortDescendingByPrice();
}

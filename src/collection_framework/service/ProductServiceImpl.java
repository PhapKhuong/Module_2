package collection_framework.service;

import collection_framework.model.Product;
import collection_framework.repository.ProductRepository;
import collection_framework.repository.ProductRepositoryImpl;

import java.time.LocalDate;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
    }

    ProductRepository repository = new ProductRepositoryImpl();

    @Override
    public void createProduct(Product product) {
        repository.createProduct(product);
    }

    @Override
    public void alterProduct(int id, String newName, String newOrigin, LocalDate newDateOfManufacture, long newPrice) {
        repository.alterProduct(id, newName, newOrigin, newDateOfManufacture, newPrice);
    }

    @Override
    public void deleteProduct(int id) {
        repository.deleteProduct(id);
    }

    @Override
    public List<Product> displayProduct() {
        return repository.displayProduct();
    }

    @Override
    public List<Product> findProduct(String name) {
        return repository.findProduct(name);
    }

    @Override
    public List<Product> sortAscendingByPrice() {
        return repository.sortAscendingByPrice();
    }

    @Override
    public List<Product> sortDescendingByPrice() {
        return repository.sortDescendingByPrice();
    }
}

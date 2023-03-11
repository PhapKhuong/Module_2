package collection_framework.service;

import collection_framework.model.Product;
import collection_framework.repository.ProductRepository;
import collection_framework.repository.ProductRepositoryImpl;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
    }

    ProductRepository repository = new ProductRepositoryImpl();

    @Override
    public void createProduct(Product product) {
        try {
            repository.createProduct(product);
        } catch (IOException e) {
            System.out.println("Lỗi nhập xuất");
        }
    }

    @Override
    public void alterProduct(int id, String newName, String newOrigin, LocalDate newDateOfManufacture, long newPrice) {
        try {
            repository.alterProduct(id, newName, newOrigin, newDateOfManufacture, newPrice);
        } catch (IOException e) {
            System.out.println("Lỗi nhập xuất");
        }
    }

    @Override
    public void deleteProduct(int id) {
        try {
            repository.deleteProduct(id);
        } catch (IOException e) {
            System.out.println("Lỗi nhập xuất");
        }
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
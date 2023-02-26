package ss12_collection_framework.service;

import ss12_collection_framework.model.Product;
import ss12_collection_framework.repository.ProductRepository;
import ss12_collection_framework.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
    }

    ProductRepository repository = new ProductRepositoryImpl();

    @Override
    public void createProduct(Product product) {
        repository.createProduct(product);
    }

    @Override
    public void alterProduct(int id, String newName, String newOrigin, String newDateOfManufacture, long newPrice) {
        repository.alterProduct(id, newName, newOrigin, newDateOfManufacture, newPrice);
    }

    @Override
    public void deleteProduct(int id) {
        repository.deleteProduct(id);
    }

    @Override
    public Product[] displayProduct() {
        return repository.displayProduct();
    }

    @Override
    public Product[] findProduct(String name) {
        return repository.findProduct(name);
    }

    @Override
    public Product[] sortAscendingByPrice() {
        return repository.sortAscendingByPrice();
    }

    @Override
    public Product[] sortDescendingByPrice() {
        return repository.sortDescendingByPrice();
    }
}
package collection_framework.repository;

import collection_framework.database.ProductList;
import collection_framework.model.Product;
import collection_framework.model.ProductSortByPrice;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class ProductRepositoryImpl implements ProductRepository {

    public ProductRepositoryImpl() {
    }

    public static List<Product> products;

    static {
        try {
            products = ProductList.readCSV();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createProduct(Product product) throws IOException {
        ProductList.serialWriteCSV(product);
        products = ProductList.readCSV();
    }

    @Override
    public void alterProduct(int id, String newName, String newOrigin,
                             LocalDate newDateOfManufacture, long newPrice) throws IOException {
        Product product = new Product(id, newName, newOrigin, newDateOfManufacture, newPrice);

        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.set(i, product);
            }
        }

        ProductList.clearCSV();

        for (Product p : products) {
            ProductList.serialWriteCSV(p);
        }

        products = ProductList.readCSV();
    }

    @Override
    public void deleteProduct(int id) throws IOException {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
            }
        }

        ProductList.clearCSV();

        for (Product p : products) {
            ProductList.serialWriteCSV(p);
        }

        products = ProductList.readCSV();
    }

    @Override
    public List<Product> displayProduct() {
        return products;
    }

    @Override
    public List<Product> findProduct(String name) {
        List<Product> sameNameProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getName().equals(name)) {
                sameNameProducts.add(product);
            }
        }

        return sameNameProducts;
    }

    @Override
    public List<Product> sortAscendingByPrice() {
        // Collections.sort(products, new ProductSortByPrice());
        products.sort(new ProductSortByPrice()); // Collections.sort() có thể thay thế bằng hàm này ngắn gọn hơn
        Product[] ascendingArr = new Product[products.size()];

        return products;
    }

    @Override
    public List<Product> sortDescendingByPrice() {
        products.sort(new ProductSortByPrice());
        Collections.reverse(products);
        return products;
    }
}
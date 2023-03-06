package collection_framework.repository;

import collection_framework.model.Product;
import collection_framework.model.ProductSortByPrice;

import java.time.LocalDate;
import java.util.*;

public class ProductRepositoryImpl implements ProductRepository {

    public ProductRepositoryImpl() {
    }

    private static List<Product> products = new ArrayList<>();

    // Giả thiết trong danh mục có sẵn các sản phẩm như sau:
    static {
        Product product1 = new Product(
                1, "A1", "B1", LocalDate.of(2023, 1, 1), 100000);
        Product product2 = new Product
                (2, "A2", "B2", LocalDate.of(2023, 2, 2), 50000);
        Product product3 = new Product
                (3, "A3", "B3", LocalDate.of(2023, 3, 3), 4000);
        Product product4 = new Product
                (4, "A4", "B4", LocalDate.of(2023, 4, 4), 26000);
        Product product5 = new Product
                (5, "A5", "B5", LocalDate.of(2023, 5, 5), 23000);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
    }

    @Override
    public void createProduct(Product product) {
        products.add(product);
    }

    @Override
    public void alterProduct(int id, String newName, String newOrigin, LocalDate newDateOfManufacture, long newPrice) {
        Product product = new Product(id, newName, newOrigin, newDateOfManufacture, newPrice);

        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.set(i, product);
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
            }
        }
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
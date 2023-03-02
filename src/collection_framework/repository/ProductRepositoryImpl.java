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
                1, "A1", "B1", LocalDate.of(2023,1,1), 100000);
        Product product2 = new Product
                (2, "A2", "B2", LocalDate.of(2023,2,2), 50000);
        Product product3 = new Product
                (3, "A3", "B3", LocalDate.of(2023,3,3), 4000);
        Product product4 = new Product
                (4, "A4", "B4", LocalDate.of(2023,4,4), 26000);
        Product product5 = new Product
                (5, "A5", "B5", LocalDate.of(2023,5,5), 23000);

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
    public Product[] displayProduct() {
        Product[] productArr = new Product[products.size()];
        return products.toArray(productArr);
    }

    @Override
    public Product[] findProduct(String name) {
        List<Product> sameNameProducts = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                sameNameProducts.add(products.get(i));
            }
        }

        Product[] sameNameProductArr = new Product[sameNameProducts.size()];
        return sameNameProducts.toArray(sameNameProductArr);
    }

    @Override
    public Product[] sortAscendingByPrice() {
        Collections.sort(products, new ProductSortByPrice());
        Product[] ascendingArr = new Product[products.size()];
        int i = 0;
        for (Product product : products) {
            ascendingArr[i] = product;
            i++;
        }
        return ascendingArr;
    }

    @Override
    public Product[] sortDescendingByPrice() {
        Collections.sort(products, new ProductSortByPrice());
        Product[] descendingArr = new Product[products.size()];
        int i = 0;
        for (Product product : products) {
            descendingArr[products.size() - 1 - i] = product;
            i++;
        }
        return descendingArr;
    }
}
package collection_framework.database;

import collection_framework.model.Product;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public static final String FILE_PATH = "C:\\Dropbox\\Codegym\\Module2\\src\\collection_framework\\database\\product.csv";

    public static List<Product> readCSV() throws IOException {
        // FileNotFoundException được extend từ IOException
        // Method readLine() ném ra ngoại lệ IOException
        // còn khởi tạo fileReader ném ra ngoại lệ FileNotFoundException
        // vì vậy method readCSV() cuối cùng ném ra ngoại lệ IOException

        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        List<Product> productList = new ArrayList<>();
        String line = buff.readLine();
        String[] temp;
        Product product;

        while (line != null) {
            temp = line.split(",");

            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            String origin = temp[2];
            LocalDate dateOfManufacture = LocalDate.of(
                    Integer.parseInt(temp[3].substring(0, 4)), Integer.parseInt(temp[3].substring(5, 7)), Integer.parseInt(temp[3].substring(8, 10))
            );
            long price = Long.parseLong(temp[4]);

            product = new Product(id, name, origin, dateOfManufacture, price);

            productList.add(product);

            line = buff.readLine();
        }
        buff.close();
        return productList;
    }

    public static void overWriteCSV(Product product) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);

        buff.write(product.getId() + "," + product.getName() + "," + product.getOrigin() + "," + product.getDateOfManufacture() + "," + product.getPrice() + "\n");
        buff.close();
    }

    public static void serialWriteCSV(Product product) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);

        buff.write(product.getId() + "," + product.getName() + "," + product.getOrigin() + "," + product.getDateOfManufacture() + "," + product.getPrice() + "\n");
        buff.close();
    }

    public static void clearCSV() throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        buff.flush();
    }
}

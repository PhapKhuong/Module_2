package collection_framework.controller;

import collection_framework.model.Product;
import collection_framework.service.ProductService;
import collection_framework.service.ProductServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class ProductController {

    public static Scanner sc = new Scanner(System.in);

    public static boolean checkID(int id, int[] idArr) {
        for (int i : idArr) {
            if (id == i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ProductService service = new ProductServiceImpl();

        System.out.println("************ CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ************");
        System.out.println("1. Thêm sản phẩm mới");
        System.out.println("2. Sửa thông tin sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Hiện danh mục sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm");
        System.out.println("6. Sắp xếp sản phẩm theo giá thành tăng dần");
        System.out.println("7. Sắp xếp sản phẩm theo giá thành giảm dần");
        System.out.println("8. Thoát chương trình");

        int select = 0;
        do {
            System.out.println("======================================================");
            System.out.println("Xin mời lựa chọn dịch vụ!");

            Product[] productArr = service.displayProduct();
            int[] idArr = new int[productArr.length];
            for (int i = 0; i < productArr.length; i++) {
                idArr[i] = productArr[i].getId();
            }

            select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1: //Thêm sản phẩm
                    System.out.println("THÊM SẢN PHẨM MỚI");
                    int newID;
                    do {
                        System.out.println("Nhập ID sản phẩm (ID sản phẩm là duy nhất)");
                        newID = Integer.parseInt(sc.nextLine());
                    } while (checkID(newID, idArr));

                    System.out.println("Nhập tên sản phẩm");
                    String name = sc.nextLine();

                    System.out.println("Nhập xuất sứ của sản phẩm");
                    String origin = sc.nextLine();

                    System.out.println("Nhập ngày sản xuất của sản phẩm");
                    int dd = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tháng sản xuất của sản phẩm");
                    int mm = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập năm sản xuất của sản phẩm");
                    int yyyy = Integer.parseInt(sc.nextLine());
                    LocalDate dateOfManufacture = LocalDate.of(yyyy, mm, dd);

                    System.out.println("Nhập giá sản phẩm");
                    long price = Long.parseLong(sc.nextLine());

                    Product newProduct = new Product(newID, name, origin, dateOfManufacture, price);

                    service.createProduct(newProduct);
                    break;

                case 2: //Sửa thông tin sản phẩm
                    System.out.println("SỬA THÔNG TIN SẢN PHẨM");
                    System.out.println("Nhập ID sản phẩm cần chỉnh sửa thông tin:");
                    int alterID = Integer.parseInt(sc.nextLine());

                    boolean alterCheck = false;

                    for (int i = 0; i < productArr.length; i++) {
                        if (alterID == productArr[i].getId()) {
                            alterCheck = true;
                            break;
                        }
                    }

                    if (alterCheck) {
                        System.out.println("Nhập tên mới của sản phẩm:");
                        String alterName = sc.nextLine();

                        System.out.println("Nhập xuất sứ mới của sản phẩm:");
                        String alterOrigin = sc.nextLine();

                        System.out.println("Nhập ngày sản xuất của sản phẩm");
                        int alterDD = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập tháng sản xuất của sản phẩm");
                        int alterMM = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập năm sản xuất của sản phẩm");
                        int alterYYYY = Integer.parseInt(sc.nextLine());

                        System.out.println("Nhập đơn giá mới của sản phẩm");
                        long alterPrice = Long.parseLong(sc.nextLine());

                        service.alterProduct(
                                alterID, alterName, alterOrigin, LocalDate.of(alterYYYY, alterMM, alterDD), alterPrice);
                    } else {
                        System.out.println("Sản phẩm này không có trong danh mục!");
                    }
                    break;

                case 3: //Xóa sản phẩm
                    System.out.println("XÓA SẢN PHẨM KHỎI DANH SÁCH");
                    System.out.println("Nhập ID sản phẩm cần xóa:");
                    int deleteID = Integer.parseInt(sc.nextLine());

                    boolean deleteCheck = false;

                    for (int i = 0; i < productArr.length; i++) {
                        if (deleteID == productArr[i].getId()) {
                            deleteCheck = true;
                            break;
                        }
                    }

                    if (deleteCheck) {
                        service.deleteProduct(deleteID);
                    } else {
                        System.out.println("Sản phẩm này không có trong danh mục!");
                    }
                    break;

                case 4: //Hiện danh mục sản phẩm
                    System.out.println("HIỂN THỊ DANH MỤC SẢN PHẨM");

                    if (productArr.length == 0) {
                        System.out.println("Chưa có sản phẩm trong danh mục!");
                    } else {
                        System.out.println("Mã số - Tên sản phẩm - Xuất sứ - Ngày sản xuất - Đơn giá");
                        for (Product product : productArr) {
                            System.out.println(product);
                        }
                    }
                    break;

                case 5: //Tìm kiếm sản phẩm
                    System.out.println("TÌM KIẾM SẢN PHẨM");
                    System.out.println("Nhập tên sản phẩm cần tìm kiếm");
                    String findName = sc.nextLine();
                    boolean checkName = false;

                    for (int i = 0; i < productArr.length; i++) {
                        if (productArr[i].getName().equals(findName)) {
                            checkName = true;
                            break;
                        }
                    }

                    if (checkName) {
                        System.out.println("Mã số - Tên sản phẩm - Xuất sứ - Ngày sản xuất - Đơn giá");
                        Product[] findNameArr = service.findProduct(findName);
                        for (Product product : findNameArr) {
                            System.out.println(product);
                        }
                    } else {
                        System.out.println("Sản phẩm không tồn tại!");
                    }
                    break;

                case 6: //Sắp xếp sản phẩm theo giá tăng dần
                    System.out.println("DANH SÁCH SẢN PHẨM THEO THỨ TỰ ĐƠN GIÁ TĂNG DẦN");
                    if (productArr.length == 0) {
                        System.out.println("Chưa có sản phẩm trong danh mục!");
                    } else {
                        System.out.println("Mã số - Tên sản phẩm - Xuất sứ - Ngày sản xuất - Đơn giá");

                        Product[] ascendingArr = service.sortAscendingByPrice();
                        for (Product product : ascendingArr) {
                            System.out.println(product);
                        }
                    }
                    break;

                case 7: //Sắp xếp sản phẩm theo giá giảm dần
                    System.out.println("DANH SÁCH SẢN PHẨM THEO THỨ TỰ ĐƠN GIÁ GIẢM DẦN");
                    if (productArr.length == 0) {
                        System.out.println("Chưa có sản phẩm trong danh mục!");
                    } else {
                        System.out.println("Mã số - Tên sản phẩm - Xuất sứ - Ngày sản xuất - Đơn giá");

                        Product[] descendingArr = service.sortDescendingByPrice();
                        for (Product product : descendingArr) {
                            System.out.println(product);
                        }
                    }
                    break;

                default:
                    break;
            }
        } while (select != 8);

        System.exit(0);
    }
}
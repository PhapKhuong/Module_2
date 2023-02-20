package ss08_mvc.bai_tap.controller;

import ss08_mvc.bai_tap.model.Worker;
import ss08_mvc.bai_tap.service.WorkerServiceImpl;

import java.util.Scanner;

public class WorkerController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select = 0;

        WorkerServiceImpl service = new WorkerServiceImpl();
        do {
            System.out.println("============= HE THONG QUAN LY CONG NHAN =============");
            System.out.println("1. Hien thi danh sach cong nhan;");
            System.out.println("2. Them moi cong nhan;");
            System.out.println("3. Sua thong tin cong nhan;");
            System.out.println("4. Thoat chuong trinh.");
            System.out.println("------------------------");

            System.out.println("Hay lua chon cong viec:");

            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Danh sach cong nhan: ");
                    for (Worker worker : service.findAll()) {
                        System.out.println(worker);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
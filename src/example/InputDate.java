package example;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class InputDate {
    public static void main(String[] args) {

        // HÀM LẤY THỜI GIAN HIỆN TẠI
        long t1 = System.currentTimeMillis();
        for (int i = 0; i <= 1; i++) {
            System.out.println("KHƯƠNG TƯ THÀNH");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Trước khi chạy for: " + t1);
        System.out.println("Sau khi chạy for: " + t2);

        System.out.println("Thời gian chạy: " + (t2 - t1) + "mls");

        // TIMEUNIT: DÙNG ĐỂ ĐỔI ĐƠN VỊ THỜI GIAN
        // Xem 3000 năm là bao nhiêu giây
        System.out.println("======================================");
        long d = 3000 * 365;
        System.out.println("3000 năm là " + TimeUnit.DAYS.toSeconds(d));

        // CLASS java.sql.Date
        System.out.println("======================================");
        Date myDate = new Date(System.currentTimeMillis());

        System.out.println(myDate.getDate() + "/" + (myDate.getMonth() + 1) + "/" + (myDate.getYear() + 1900));
        // Month được tính bắt đầu từ tháng thứ 0 và năm tính bắt đầu từ năm 1900 nên tháng phải +1 và năm +1900

        // Lớp java.sql.Date là lớp con của java.util.Date nên nó thừa kế các hàm của java.util.Date
        // Các hàm bị gạch ngang đã được thay thế bởi các hàm khác của lớp Calendar
        // Ví dụ: hàm getMonth() được thay thế bởi hàm Calendar.get(Calendar.MONTH)

        System.out.println("Ngày hôm nay là: " + myDate);

        // CALENDAR
        System.out.println("======================================");
        Calendar c = Calendar.getInstance(); // Lấy theo múi giờ hiện tại trên máy tính
        System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));

        c.add(Calendar.HOUR,30);
        System.out.println(c.toString());
        System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));

        c.add(Calendar.DATE,14);
        System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));

        // DATEFORMAT
        System.out.println("======================================");

        DateFormat df = new SimpleDateFormat();

        System.out.println(df.format(myDate));

        df = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(df.format(myDate));

        Date inputDate = new Date(1677614679);

        System.out.println(df.format(inputDate));
    }
}
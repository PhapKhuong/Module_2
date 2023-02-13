package ss07_abstraction_interface.thuc_hanh;

public abstract class Children extends Person {
    public abstract void abc();

    /*
     * Nếu class Children là abstract class thì không cần đè abstract method love()
    của class Person vì cho dù có đưa method này xuống nữa thì class Children
    cũng không thể tạo ra được đối tượng (vì nó là abstract class).
     * Trong trường hợp này, nếu abstract class Children có thêm 1 abstract method
    nữa thì khi một class con của class Children (là Student) mà không phải abstract
    thì phải ghi đè cả 2 abstract method của class ông nội và cha là Person và Children
    (tức cụ thể hóa 2 phương thức trừu tượng này).
     */
}



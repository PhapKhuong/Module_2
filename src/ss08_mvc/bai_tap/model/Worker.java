package ss08_mvc.bai_tap.model;

public class Worker {
    private int id;
    private String name;
    private String address;

    public Worker() {
    }

    public Worker(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public String toString() {
        return "(" + this.id + ", " + this.name + ", " + this.address + ")";
    }
}

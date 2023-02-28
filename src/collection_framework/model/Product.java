package collection_framework.model;

public class Product{
    private int id;
    private String name;
    private String origin;
    private String dateOfManufacture;
    private long price;

    public Product() {
    }

    public Product(int id, String name, String origin, String dateOfManufacture, long price) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id +
                " - " + name +
                " - " + origin +
                " - " + dateOfManufacture +
                " - " + price;
    }
}

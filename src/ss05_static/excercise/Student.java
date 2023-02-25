package ss05_static.excercise;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this("John", "CO2");
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setClasses(String newClasses) {
        this.classes = newClasses;
    }

    public String displayInformation () {
        return this.name + " - " + this.classes;
    }
}

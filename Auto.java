
public class Auto {

    protected int id = 0;
    protected String marca = "";
    protected String model = "";
    protected String color = "";

    public Auto() {
        // Empty constructor
    }

    public Auto(String marca, String model, String color) {
        this.marca = marca;
        this.model = model;
        this.color = color;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters

    public String getBrand() {
        return this.marca;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getId() {
        return id;
    }

    public void info() {
        System.out.println("Nenorra");
    }

}
public class Coche extends Auto {

    private int year;

    public Coche(String marca, String model, String color, int year) {
        super(marca, model, color);
        this.year = year;
    }

    public Coche() {

    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void info() {
        System.out.println("Los Mejores coches a un buen precio");
    }

}
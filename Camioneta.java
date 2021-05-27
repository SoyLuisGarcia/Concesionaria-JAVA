public class Camioneta extends Auto {
    
    public Camioneta(String marca, String model, String color) {
        super(marca, model, color);
    }

    public Camioneta() {

    }

    @Override
    public void info() {// apica polimorfismo
        System.out.print("Las Mejores Camionetas a buen precio" + "\n");
    }

}

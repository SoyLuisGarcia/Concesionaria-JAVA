public class EquipoTrabajo {

    protected int id = 0;
    protected String nombreE = "";
    protected String apellido = "";
    protected String area = "";
    protected String turno;

    public EquipoTrabajo() {
        // Empty constructor
    }

    public EquipoTrabajo(String nombreE, String apellido, String area, String turno) {
        this.nombreE = nombreE;
        this.apellido = apellido;
        this.area = area;
        this.turno = turno;
    }

    // Setters
    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // Getters

    public String getNombreE() {
        return this.nombreE;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getArea() {
        return this.area;
    }

    public int getId() {
        return id;
    }

    public String getTurno() {
        return turno;
    }

}

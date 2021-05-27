public class Cliente {
    private String nombreCliente;
    private String apellidoCliente;
    private String direccion;
    private long telefono;
    private String estado;
    private int numLicencia;
    private String numeroTargeta;
    private int fechaVencimiento1;
    private int fechaVencimiento2;

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getAPellidoCliente() {
        return apellidoCliente;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumeroTargeta(String numeroTargeta) {
        this.numeroTargeta = numeroTargeta;
    }

    public String getNumeroTargeta() {
        return numeroTargeta;
    }

    public void setFechaVencimiento1(int fechaVencimiento1) {
        this.fechaVencimiento1 = fechaVencimiento1;
    }

    public int getFechaVencimiento1() {
        return fechaVencimiento1;
    }

    public void setFechaVencimiento2(int fechaVencimiento2) {
        this.fechaVencimiento2 = fechaVencimiento2;
    }

    public int getFechaVencimiento2() {
        return fechaVencimiento2;
    }
}
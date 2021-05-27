import java.util.Scanner;
import java.util.ArrayList;

public class Venta {
    protected int costoVehiculo;

    Cliente miCliente;
    private static ArrayList<Cliente> dato1 = new ArrayList<Cliente>();

    public Venta() {

    }

    public Venta(int costoVehiculo) {
        this.costoVehiculo = costoVehiculo;

    }

    public void setCostoVehiculo(int costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
    }

    public int getCostoVehiculo() {
        return costoVehiculo;
    }

    public void AddDatosCliente() {

        Scanner sc = new Scanner(System.in);
        String numeroTargeta;
        int cantidad_DigTR = 16;
        miCliente = new Cliente();// instancia
        System.out.println("Ingrese los siguientes datos del cliente.");
        System.out.println("Nombre: ");
        String nombreCliente = sc.nextLine();
        miCliente.setNombreCliente(nombreCliente);
        System.out.println("Apellido: ");
        String apellidoCliente = sc.nextLine();
        miCliente.setApellidoCliente(apellidoCliente);
        System.out.println("Direccion: ");
        String direccion = sc.nextLine();
        miCliente.setDireccion(direccion);
        System.out.println("Estado: ");
        String estado = sc.nextLine();
        miCliente.setEstado(estado);
        System.out.println("Numero de Licencia de conduccion: ");
        int numLicencia = sc.nextInt();
        miCliente.setNumLicencia(numLicencia);
        System.out.println("Telefono: ");
        long telefono = sc.nextLong();
        miCliente.setTelefono(telefono);
        System.out.println("\n");
        System.out.println("-___________________________________________-");
        System.out.println("Agregre los datos de su tarjeta de credito");
        System.out.println("Ingrese el numero de tarjeta 16 digitos: ");
        do {

            numeroTargeta = sc.nextLine();
        } while (numeroTargeta.length() != cantidad_DigTR);
        miCliente.setNumeroTargeta(numeroTargeta);
        System.out.println("Ingrese fecha de vencimiento: ");
        System.out.println("Ingrese Mes");
        int fechaVencimiento1 = sc.nextInt();
        miCliente.setFechaVencimiento1(fechaVencimiento1);
        System.out.println("Ingrese anio");
        int fechaVencimiento2 = sc.nextInt();
        miCliente.setFechaVencimiento2(fechaVencimiento2);
        dato1.add(miCliente);
        System.out.println("\n");

    }

    public void MostrarDatos1() {
        String aux;
        System.out.println("______________________Venta Datos Clientes_____________________");
        for (int i = 0; i < dato1.size(); i++) {
            // System.out.println("id: " + mosPer.get(i).getId());
            System.out.println("Nombre: " + dato1.get(i).getNombreCliente());
            System.out.println("Apellido: " + dato1.get(i).getAPellidoCliente());
            System.out.println("Direccion: " + dato1.get(i).getDireccion());
            System.out.println("Telefono: " + dato1.get(i).getTelefono());
            System.out.println("Estado: " + dato1.get(i).getEstado());
            System.out.println("Numero de Licencia: " + dato1.get(i).getNumLicencia());
            System.out.println("______________________Datos Targeta Credito________________");
            aux = dato1.get(i).getNumeroTargeta();
            System.out.print("Numero de targeta: ");
            for (int m = 0; m < aux.length(); m++) {
                if (m < 12)
                    System.out.print('*');
                else
                    System.out.print(aux.charAt(m));
            }
            // System.out.println("Numero de targeta: " + dato1.get(i).getNumeroTargeta());
            System.out.println("\nFecha Vencimiento: " + dato1.get(i).getFechaVencimiento1() + "/"
                    + dato1.get(i).getFechaVencimiento2());
            System.out.println("_____________________________________________________________");
        }
    }
}
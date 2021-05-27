import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        mainMenu();

    }

    private static void mainMenu() {
        Scanner sc = new Scanner(System.in);

        MantenimientoFrenos mf = new MantenimientoFrenos();
        MantenimientoAceite ma = new MantenimientoAceite();

        Agencia concesionario = new Agencia();
        Auto auto;
        Servicio serv;

        Venta miVenta = new Venta();
        int opc = 0;

        System.out.println("Agencia de autos 'The Devs'");
        do {
            System.out.println("Opciones: \n" + "[1]. Introducir nuevo auto \n" + "[2]. Ver autos \n"
                    + "[3]. vender Auto \n" + "[4]. Servicios \n" + "[5]. Factura choche\n" + "[6]. Factura Camioneta");
            System.out.print("Introducir numero de opcion deseada: ");
            opc = sc.nextInt();
            switch (opc) {
            case 1:
                concesionario.addAuto();
                break;
            case 2:
                System.out.print("[1]. Coches || [2]. Camioneta" + "\nOpcion: ");
                opc = sc.nextInt();
                if (opc == 1) {
                    auto = new Coche();
                    auto.info();
                    concesionario.getAutos();
                } else {
                    auto = new Camioneta();
                    auto.info();
                    concesionario.getAutos2();
                }
                break;
            case 3:
                System.out.print("[1]. Coches || [2]. Camioneta" + "\nOpcion: ");
                opc = sc.nextInt();
                if (opc == 1) {
                    
                    miVenta.AddDatosCliente();
                    concesionario.teamW();
                } else {
                    
                    miVenta.AddDatosCliente();
                    concesionario.teamW2();
                }
                break;
            case 4:

                System.out.print("[1]. Aceite || [2]. Frenos" + "\nOpcion: ");
                opc = sc.nextInt();
                if (opc == 1) {
                    ma.mantenimientoAuto();
                } else {

                    mf.mantenimientoAuto();
                }

                break;

            case 5:
                concesionario.getAutos();
                miVenta.MostrarDatos1();
                concesionario.DatosEmpleado();
                break;

            case 6:
            concesionario.getAutos2();
            miVenta.MostrarDatos1();
            concesionario.DatosEmpleado2();
            break;

            }
            System.out.println();
            System.out.print("Desea volver al menu principal [1]Si || [2] No \n" + "Opcion: ");
            opc = sc.nextInt();
        } while (opc != 2);
    }
}// class
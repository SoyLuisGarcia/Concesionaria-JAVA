import java.util.Scanner;

public class MantenimientoFrenos extends servicioMotor {

    @Override
    public void mantenimientoAuto() {
        Scanner sc = new Scanner(System.in);
        int opc2;
        do {
            System.out.println("Tipos de frenos: ");
            System.out.println("Freno tambor[1]");
            System.out.println("[Freno Disco[2]");
            int opc = sc.nextInt();
            switch (opc) {
            case 1:
                System.out.println("El Freno de tambor tiene un costo de: " + "\t" + "250 $");
                System.out.println("Desea comprarlo: [1].si / [2]. No");
                int opcion = sc.nextInt();
                if (opcion == 1)
                    System.out.println("La compra se ha realizado satisfactoriamente.\n");
                break;

            case 2:
                System.out.println("El Freno de Disco tiene un costo de: " + "\t" + "300 $");
                System.out.println("Desea comprarlo: [1].si / [2]. No");
                int opcion2 = sc.nextInt();
                if (opcion2 == 1)
                    System.out.println("La compra se ha realizado satisfactoriamente.\n");
                break;
            }
            System.out.println("Volver escojer una opcion[1].si / [2].No");
            System.out.println("Opcion: ");
            opc2 = sc.nextInt();
        } while (opc2 != 2);
    }
}
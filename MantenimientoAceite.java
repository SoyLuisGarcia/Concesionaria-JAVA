import java.util.Scanner;

public class MantenimientoAceite extends servicioMotor {

    @Override
    public void mantenimientoAuto() {
        Scanner sc = new Scanner(System.in);
        int opc2;
        do {
            System.out.println("Servicio Aceite");
            System.out.println("Escoja el aceite: ");
            System.out.println("Aceite 10w40[1]");
            System.out.println("Aceite 20w50[2]");
            int opc1 = sc.nextInt();
            switch (opc1) {
            case 1:
                System.out.println("El Aceite 10w40 tiene un costo de: " + "\t" + "250 $");
                System.out.println("Desea comprarlo: [1].si / [2]. No");
                int opcion = sc.nextInt();
                if (opcion == 1)
                    System.out.println("La compra se ha realizado satisfactoriamente.\n");
                break;

            case 2:
                System.out.println("El Aceite 20w50 tiene un costo de: " + "\t" + "300 $");
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

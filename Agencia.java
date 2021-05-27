import java.util.Scanner;
import java.util.ArrayList;

public class Agencia {

    private ArrayList<Coche> listAuto = new ArrayList<Coche>();
    private ArrayList<Camioneta> listAutos = new ArrayList<Camioneta>();
    private ArrayList<EquipoTrabajo> teamE = new ArrayList<EquipoTrabajo>();

    public Agencia() {
    }

    public void addAuto() {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        System.out.println("Seleccione el tipo de coche que desea agregar.");
        System.out.print("[1] Coche\n" + "[2]. Camioneta\n" + "Opcion: ");
        opc = sc.nextInt();
        switch (opc) {
        case 1:

            Coche newAuto;
            do {
                sc.nextLine();
                newAuto = new Coche();
                System.out.print("Marca: ");
                newAuto.setMarca(sc.nextLine());
                System.out.print("Model: ");
                newAuto.setModel(sc.nextLine());
                System.out.print("Color: ");
                newAuto.setColor(sc.nextLine());
                System.out.print("Año: ");
                newAuto.setYear(sc.nextInt());
                listAuto.add(newAuto);

                System.out.println();
                System.out.print("Desea agregar otro auto? 1.si || 2. no \n" + "Opcion: ");
                opc = sc.nextInt();
            } while (opc != 2);

            break;
        case 2:
            Camioneta newAuto2;
            do {
                sc.nextLine();
                newAuto2 = new Camioneta();
                System.out.print("Id: ");
                newAuto2.setMarca(sc.nextLine());
                System.out.print("Marca: ");
                newAuto2.setMarca(sc.nextLine());
                System.out.print("Model: ");
                newAuto2.setModel(sc.nextLine());
                System.out.print("Color: ");
                newAuto2.setColor(sc.nextLine());
                listAutos.add(newAuto2);

                System.out.println();
                System.out.print("Desea agregar otro auto? 1.si || 2. no \n" + "Opcion: ");
                opc = sc.nextInt();

            } while (opc != 2);

        }
    }

    public void getAutos() {
        System.out.println("Lista de Autos");
        for (Coche auto : listAuto) {
            System.out.println("________Dato de los Coches vendidos_________");
            System.out.println("--------------------------------------------");
            System.out.println("Marca: " + auto.getBrand() + "\n" + "Modelo: " + auto.getModel() + "\n" + "Color: "
                    + auto.getColor() + "\n" + "Año: " + auto.getYear());
        }
    }

    public void getAutos2() {
        System.out.println("Lista de Autos");
        for (Camioneta autos : listAutos) {
            System.out.println("________Dato de las Camionetas vendidas_________");
            System.out.println("------------------------------------------------");
            System.out.println("id: " + autos.getId() + "\n" + "Marca: " + autos.getBrand() + "\n" + "Modelo: "
                    + autos.getModel() + "\n" + "Color: " + autos.getColor());
        }
    }

    public void teamW() {

        Scanner sc = new Scanner(System.in);
        EquipoTrabajo equipo;
        equipo = new EquipoTrabajo();
        System.out.println("______________________________________");
        System.out.println("Agregar Datos Empleados");
        System.out.print("Nombre Empleado: ");
        String nombreE = sc.nextLine();
        equipo.setNombreE(nombreE);
        System.out.print("Apellido Empleado: ");
        String apellido = sc.nextLine();
        equipo.setApellido(apellido);
        System.out.print("Area de trabajo[Choche o Camioneta]: ");
        String area = sc.nextLine();
        equipo.setArea(area);
        System.out.print("Turno de trabajo: ");
        String turno = sc.nextLine();
        equipo.setTurno(turno);
        teamE.add(equipo);

    }

    public void DatosEmpleado() {

        System.out.println("Datos de empleado:  ");
        System.out.println("___________________________________________________");
        for (int i = 0; i < teamE.size(); i++) {
            // System.out.println("id: " + mosPer.get(i).getId());
            System.out.println("ID: " + teamE.get(i).getId());
            System.out.println("Nombre Empleado: " + teamE.get(i).getNombreE());
            System.out.println("Apellido Empleado: " + teamE.get(i).getApellido());
            System.out.println("Area de trabajo: " + teamE.get(i).getArea());
            System.out.println("Turno de trabajo: " + teamE.get(i).getTurno());
        }

    }

    public void teamW2() {

        Scanner sc = new Scanner(System.in);
        EquipoTrabajo equipo;
        equipo = new EquipoTrabajo();
        System.out.println("______________________________________");
        System.out.println("Agregar Datos Empleados");
        System.out.print("Nombre Empleado: ");
        String nombreE = sc.nextLine();
        equipo.setNombreE(nombreE);
        System.out.print("Apellido Empleado: ");
        String apellido = sc.nextLine();
        equipo.setApellido(apellido);
        System.out.print("Area de trabajo[Choche o Camioneta]: ");
        String area = sc.nextLine();
        equipo.setArea(area);
        System.out.print("Turno de trabajo: ");
        String turno = sc.nextLine();
        equipo.setTurno(turno);
        teamE.add(equipo);

    }

    public void DatosEmpleado2() {

        System.out.println("Datos de empleado:  ");
        System.out.println("___________________________________________________");
        for (int i = 0; i < teamE.size(); i++) {
            // System.out.println("id: " + mosPer.get(i).getId());
            System.out.println("ID: " + teamE.get(i).getId());
            System.out.println("Nombre Empleado: " + teamE.get(i).getNombreE());
            System.out.println("Apellido Empleado: " + teamE.get(i).getApellido());
            System.out.println("Area de trabajo: " + teamE.get(i).getArea());
            System.out.println("Turno de trabajo: " + teamE.get(i).getTurno());
        }

    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Empleado> listEmpleado = new ArrayList<>();
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("Ingrese el id del empleado: ");
            int idEmpleado = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el nombre del empleado: ");
            String nombreEmpleado = scanner.nextLine();

            System.out.println("Ingrese el apellido del empleado: ");
            String apellidoEmpleado = scanner.nextLine();

            System.out.println("Ingrese el departamento del empleado: ");
            String departamentoEmpleado = scanner.nextLine();

            System.out.println("Ingrese el salario del empleado: ");
            double salarioEmpleado = scanner.nextDouble();
            scanner.nextLine();

            Empleado empleado = new Empleado(idEmpleado, nombreEmpleado, apellidoEmpleado, departamentoEmpleado, salarioEmpleado);
            listEmpleado.add(empleado);

            System.out.println("Desea agregar otro registro? (s/n)");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("Lista de productos registrados:");
        Iterator<Empleado> empleadoIteratorIterator = listEmpleado.iterator();
        while (empleadoIteratorIterator.hasNext()) {
            Empleado empleado = empleadoIteratorIterator.next();
            System.out.println(empleado);
        }

        scanner.close();
    }
}

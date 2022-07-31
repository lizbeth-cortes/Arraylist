package tareaarray;

import java.util.ArrayList;
import java.util.Iterator;

public class Datos {

    public static void main(String[] args) {
        ArrayList<Empleado> lista = new ArrayList();
        lista.add(new Empleado("José García Pérez", "Sistemas", 670, 30, 5));
        lista.add(new Empleado("Diana Herrera Pérez", "Recursos humanos", 450, 25, 0));
        lista.add(new Empleado("Jessica Juarez Días", "Ventas", 400, 28, 0));
        lista.add(new Empleado("Pedro Paz Orozco", "Ventas", 410, 30, 0));
        lista.add(new Empleado("José Marcel Pérez", "Sistemas", 680, 29, 6));
        lista.add(new Empleado("Jesús Días García", "Recursos humanos", 455, 30, 0));
        lista.add(new Empleado("Pedro Xotla Ramirez", "Sistemas", 675, 27, 0));
        lista.add(new Empleado("Javier Medina Blanco", "Ventas", 400, 30, 4));
        lista.add(new Empleado("Elizabeth Villa Sosa", "Sistemas", 670, 30, 3));

        System.out.println("---Datos de los empleados---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("\nEmpleado " + i);
            Empleado e = lista.get(i);
            System.out.println(e);
        }
        System.out.println("\n---Salarios y horas extras---");
        Iterator ite = lista.iterator();
        while (ite.hasNext()) {
            Empleado emp = (Empleado) ite.next();
            System.out.println("\nNombre: " + emp.getNombre());
            System.out.println("Salario mensual: $" + emp.sueldoMensual());
            System.out.println("Monto referente a las horas extras de trabajo: $" + emp.montoHorasE());

        }

        int sumaTotal = 0;
        for (Empleado em : lista) {
            sumaTotal += em.salarioTotal();
        }

        System.out.println("\n----------------------------------------------------------------------------------");
        System.out.println("Suma de todos los sueldos de los trabajadores (+ monto de horas extras): $" + sumaTotal);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Empleado que trabajó menos días en el mes");
        int menor = lista.get(0).getDiasTrabajados();
        String nam = lista.get(0).getNombre();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDiasTrabajados() < menor) {
                menor = lista.get(i).getDiasTrabajados();
                nam = lista.get(i).getNombre();
            }
        }
        System.out.println("Nombre: " + nam);
        System.out.println("Días que trabajó: " + menor);

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Empleado que trabajó más horas extra");
        int mayor = lista.get(0).getHorasExtra();
        String name = lista.get(0).getNombre();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getHorasExtra() > mayor) {
                mayor = lista.get(i).getHorasExtra();
                name = lista.get(i).getNombre();
            }
        }

        System.out.println("Nombre: " + name);
        System.out.println("Horas extra que trabajó: " + mayor);

    }
}

import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {

        CL_Vehiculo vehiculo1 = new CL_Vehiculo(1, "Toyota", "Prado", 2012, "Negro", "Servicio de frenos");
        CL_Vehiculo vehiculo2 = new CL_Vehiculo(2, "Hyundai", "Tucson", 2016, "Azul", "Cambio de aceite");
        CL_Vehiculo vehiculo3 = new CL_Vehiculo(3, "Mazda", "Bt-200", 2015, "Rojo", "Limpieza de injectores");
        CL_Vehiculo vehiculo4 = new CL_Vehiculo(4, "Mitsubishi", "Lancer", 2017, "Negro", "Pulir parte delantera");
        CL_Vehiculo vehiculo5 = new CL_Vehiculo(5, "Fiat", "500", 2014, "Blanco", "Cambio de aceite de caja");

        String nombreDelTaller = "Lopez";
        Scanner seleccion = new Scanner(System.in);
        Mostrar obj = new Mostrar();
        Integer eleccion;
        do {
            System.out.println("Garage " + nombreDelTaller);
            System.out.println("1-Revisar estacionamientos");
            System.out.println("2-Mostrar todos los vehiculos");
            System.out.println("3-Cambiar Vehiculo");
            System.out.println("4-Salir");
            System.out.println("Por favor seleccione una opcion:");
            eleccion = Integer.valueOf(seleccion.next());
            switch (eleccion) {
                case 1:
                    obj.RevisarEstacionamiento(vehiculo1, vehiculo2, vehiculo3, vehiculo4, vehiculo5);
                    break;
                case 2:
                    obj.MostrarTodo(vehiculo1, vehiculo2, vehiculo3, vehiculo4, vehiculo5);
                    break;
                case 3:
                    obj.CambiarVehiculo(vehiculo1, vehiculo2, vehiculo3, vehiculo4, vehiculo5);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
            }
        } while (eleccion != 4);
    }
}
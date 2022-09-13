import java.util.Scanner;
public class Mostrar {
    public Mostrar(){}
    //vehiculo en particular
    public static void RevisarEstacionamiento(CL_Vehiculo vehiculo1, CL_Vehiculo vehiculo2, CL_Vehiculo vehiculo3, CL_Vehiculo vehiculo4, CL_Vehiculo vehiculo5){

        CL_Vehiculo[] garaje ={vehiculo1,vehiculo2,vehiculo3,vehiculo4,vehiculo5};
        Scanner sc =new Scanner(System.in);
        System.out.println("Consultar estacionamiento:");
        Integer estacionamiento = sc.nextInt();

        System.out.println("Vehiculo en el estacionamiento "+(estacionamiento)+": ");
        System.out.println("  "+garaje[estacionamiento-1].getNombre());
        System.out.println("  "+garaje[estacionamiento-1].getModelo());
        System.out.println("  "+garaje[estacionamiento-1].getColor());
        System.out.println("  "+garaje[estacionamiento-1].getAnho());
        System.out.println("  "+garaje[estacionamiento-1].getServico());
    }
    //todos los vehiculos
    public static void MostrarTodo(CL_Vehiculo vehiculo1, CL_Vehiculo vehiculo2, CL_Vehiculo vehiculo3, CL_Vehiculo vehiculo4, CL_Vehiculo vehiculo5){
          for(int i=0;i<5;i++){
            CL_Vehiculo[] garaje ={vehiculo1,vehiculo2,vehiculo3,vehiculo4,vehiculo5};
            System.out.println("Vehiculo en el estacionamiento "+(i+1)+": ");
            System.out.println("  "+garaje[i].getNombre());
            System.out.println("  "+garaje[i].getModelo());
            System.out.println("  "+garaje[i].getColor());
            System.out.println("  "+garaje[i].getAnho());
            System.out.println("  "+garaje[i].getServico());
        }
    }
    public static void  CambiarVehiculo(CL_Vehiculo vehiculo1, CL_Vehiculo vehiculo2, CL_Vehiculo vehiculo3, CL_Vehiculo vehiculo4, CL_Vehiculo vehiculo5){
        CL_Vehiculo[] garaje ={vehiculo1,vehiculo2,vehiculo3,vehiculo4,vehiculo5};
        Scanner sc =new Scanner(System.in);
        System.out.println("Numero de estacionamiento a editar:");
        Integer estacionamiento = sc.nextInt();
        System.out.println("Vehiculo en el estacionamiento "+(estacionamiento-1)+": ");
        System.out.println("--------------------------------");

        Scanner sc2 =new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre =sc2.nextLine();
        garaje[estacionamiento-1].setNombre(nombre);

        Scanner sc3 =new Scanner(System.in);
        System.out.println("Modelo:");
        String modelo =sc3.nextLine();
        garaje[estacionamiento-1].setModelo(modelo);

        Scanner sc4 =new Scanner(System.in);
        System.out.println("Color");
        String color=sc4.nextLine();
        garaje[estacionamiento-1].setColor(color);

        Scanner sc5 =new Scanner(System.in);
        System.out.println("Año");
        Integer anho =sc5.nextInt();
        garaje[estacionamiento-1].setAnho(anho);

        Scanner sc6 =new Scanner(System.in);
        System.out.println("Servicio a realizar");
        String servicio =sc6.nextLine();
        garaje[estacionamiento-1].setServico(servicio);
    }
}

package cocacolaCompany;
import java.util.Scanner;

public class Trabajador {
    //Atributos
    String nombre;
    int añosServicio;
    int claveDepartamento;
    Scanner dimelo = new Scanner(System.in);

    //Metodo constructor
    public Trabajador(){
        System.out.println("Escribe tu nombre");
        nombre = dimelo.nextLine();
        System.out.println("Escribe tus años de servicio");
        añosServicio = dimelo.nextInt();
        System.out.println("Escribe tu departamento");
        claveDepartamento = dimelo.nextInt();
    }

    public void prueba (){
        System.out.println(nombre + " es un trabajador del departamento " + claveDepartamento + " con " + añosServicio + " años de servicio");
    }
}

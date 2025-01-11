package cocacolaCompany;

public class Main {
    public static void main(String[] args) {

        boolean ejecution = true;
        String desicion;

        Inicio pantalla1 = new Inicio();
        pantalla1.arranque();

        while (ejecution == true){
            Trabajador trabajador1 = new Trabajador();
            trabajador1.prueba();

            Vacaciones diaSipin = new Vacaciones();
            diaSipin.diasVacaciones(trabajador1.claveDepartamento, trabajador1.añosServicio, trabajador1.nombre);
            System.out.println("Quieres consultar sobre otro usuario? si o no");
            desicion = pantalla1.dimeloo.nextLine();
            switch (desicion){
                case "si": ejecution = true;
                break;
                case "no": ejecution = false;
                break;
            }
        }
    }
}

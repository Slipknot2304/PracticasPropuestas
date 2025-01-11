package cocacolaCompany;

public class Vacaciones {

    public Vacaciones(){

    }

    public void diasVacaciones(int clave, int antiuedad, String nombre){
        switch (clave){
            case 1 :
                if (antiuedad == 1){
                    System.out.println(nombre + " tiene 6 dias de vacaciones");
                } else if (antiuedad >=2 && antiuedad <=6){
                    System.out.println(nombre + " tiene 14 dias de vacaciones");
                } else if (antiuedad == 7) {
                    System.out.println(nombre + " tiene 20 dias de vacaciones");
                } else System.out.println("Aun no tiene dereco a vacaciones");
                break;
            case 2 :
                if (antiuedad == 1){
                    System.out.println(nombre + " tiene 7 dias de vacaciones");
                } else if (antiuedad >=2 && antiuedad <=6){
                    System.out.println(nombre + " tiene 15 dias de vacaciones");
                } else if (antiuedad == 7) {
                    System.out.println(nombre + " tiene 22 dias de vacaciones");
                } else System.out.println("Aun no tiene dereco a vacaciones");
                break;
            case 3 :
                if (antiuedad == 1){
                    System.out.println(nombre + " tiene 10 dias de vacaciones");
                } else if (antiuedad >=2 && antiuedad <=6){
                    System.out.println(nombre + " tiene 20 dias de vacaciones");
                } else if (antiuedad == 7) {
                    System.out.println(nombre + " tiene 30 dias de vacaciones");
                } else System.out.println("Aun no tiene dereco a vacaciones");
                break;
            default:
                System.out.println("Error, la clave de departamento no existe");
                break;
        }
    }
}

package ejercicio3;

public class Inviertelo {

    public void Inviertelo(){

    }

    public void convers(String cadena){
        StringBuilder newCadena = new StringBuilder();

        char []newcadena= cadena.toCharArray();
        for (int i = cadena.length(); i == 0; i--) {
            newCadena.append(newcadena[i]);
            System.out.println(newcadena[i]);
        }
        System.out.println(newCadena.toString());
    }
}

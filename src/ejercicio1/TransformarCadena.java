package ejercicio1;

public class TransformarCadena {

    public void TransformarCadena(){

    }

    public String lower(String nombre) {
        return nombre.toLowerCase();
    }

    public String upper(String nombre) {
        return nombre.toUpperCase();
    }

    public int amound(String nombre) {
        return nombre.length();
    }

    public String trim(String nombre) {
        return nombre.trim();
    }

    public String replace(String nombre){
        return nombre.replace(nombre, "Fnonose");
    }
}

package ejercicio3;

public class Palindromos {
    public Palindromos(){

    }

    public boolean esUnPalindromo(String palabra){
        String reconstruction = palabra.replaceAll("\\s+", "").toLowerCase();
        return reconstruction.equals(new StringBuilder(reconstruction).reverse().toString());
    }
}

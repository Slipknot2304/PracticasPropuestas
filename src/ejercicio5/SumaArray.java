package ejercicio5;

public class SumaArray {

    public int sumaElementos(int [] numeros){
        int suma = 0;
        for (int numero : numeros){
            suma += numero;
        }
        return suma;
    }
}

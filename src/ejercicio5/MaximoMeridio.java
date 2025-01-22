package ejercicio5;

public class MaximoMeridio {

    public int encontrarMaximo(int[] numeros){
        int vencedor = 0;
        int i = 1;
        for (int numero : numeros){
            if (numero > numeros[i]){
                numeros[i] = numero;
                vencedor = numeros[i];
            }
        }
        return vencedor;
    }
}

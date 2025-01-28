package ejercicio5;

import java.util.ArrayList;

public class InvierteArrelo {

    public void inviertelo(int[] numeros){

        ArrayList arrayList = new ArrayList();
        int lonitud = numeros.length;

        for (int i = 0; i < lonitud/2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[lonitud -1 - i];
            numeros[lonitud -1 - i] = temp;
        }
    }
}

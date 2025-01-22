package ejercicio5;

public class MainImprime {
    public static void main(String[] args) {

        ImprimirArrays imprimirArrays = new ImprimirArrays();
        int [] numeros = {19, 67, 56, 76, 9, 78};
        imprimirArrays.imprimirElementos(numeros);

        SumaArray sumaArray = new SumaArray();
        int resultado = sumaArray.sumaElementos(numeros);
        System.out.println("El resultado de la suma de los numeros es: " + resultado);

        MaximoMeridio maximoMeridio = new MaximoMeridio();
        int vencedor = maximoMeridio.encontrarMaximo(numeros);
        System.out.println("El numero mayor de entre todo ese arrelo es: " + vencedor);
    }
}

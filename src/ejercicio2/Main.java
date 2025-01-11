package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Areas areas = new Areas();

        System.out.println( Math.round(areas.areaCuadrado(3.4)) + "m.");
        System.out.println(areas.areaRectangulo(34, 15) + "m.");
        System.out.println(areas.areaTriagulo(8, 4) + "m.");
    }
}

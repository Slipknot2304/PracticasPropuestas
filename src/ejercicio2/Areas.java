package ejercicio2;


public class Areas {

    public void Areas(){

    }

    public double areaCuadrado(double lado){
        double areaC = lado * lado;
        return areaC;
    }

    public double areaTriagulo(double B, double H) {
        double areaT = B * H /2;
        return areaT;
    }

    public double areaRectangulo(double B, double H){
        double areaR = B * H;
        return areaR;
    }
}

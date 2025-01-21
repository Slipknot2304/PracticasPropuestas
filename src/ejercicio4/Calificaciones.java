package ejercicio4;

public class Calificaciones {

    public double promedioCalificaciones(double... calificaciones){
        if (calificaciones.length == 0){
            return 0.0;
        }
        double suma = 0.0;

       for (double calificacion : calificaciones){
           suma += calificacion;
       }
       return Math.floor(suma /calificaciones.length);
    }
}

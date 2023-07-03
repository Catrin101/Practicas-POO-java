package actividad.hilos;

public class ActividadHilos {

    public static void main(String[] args){
       
        Hilos h1 = new Hilos(1);
        Hilos h2 = new Hilos(2);
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        t1.start();
        t2.start();
    }
    
}

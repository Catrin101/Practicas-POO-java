package practica.pkg4.hilos;

public class JavaThread_R implements Runnable{
    int delay = 250;
    int N = 10;
    
    public JavaThread_R (int delay, int N){
        this.delay = delay;
        this.N = N;
    }
    
    public void run(){
        int i = 0;
        while(i<=N){
            System.out.println("soy juan, implementado Runnable y escribo el numero:"+i);
            i++;
            try{
                Threand.sleep(delay);
            }
            catch(InterruptedException e){
                System.exit(0);
            }
        }
    }
}

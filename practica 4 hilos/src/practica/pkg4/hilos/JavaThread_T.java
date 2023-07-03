package practica.pkg4.hilos;

public class JavaThread_T extends Thread{
    int delay = 250;
    int N = 10;
    
    public JavaThread_T (int delay, int N){
        this.delay = delay;
        this.N = N;
    }
    
    public void run(){
        int i = 0;
        while(N == 0 || i <= N){
            System.out.println("soy pepe, heredando de Threand y escribo el numero:"+i);
            i++;
            try{
                sleep(delay);
            }
            catch(InterruptedException e){
                System.exit(0);
            }
        }
    }
}

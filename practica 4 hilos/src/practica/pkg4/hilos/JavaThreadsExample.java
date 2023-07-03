package practica.pkg4.hilos;

public class JavaThreadsExample {
    
    public static void reference(){
        JavaThread_T thread_T;
        JavaThread_R task;
        
        thread_T = new JavaThread_T();
        task = new JavaThread_R();
        
        thread_T.start();
        Thread thread_R = new Thread(task);
        thread_R.start();
        try{
            thread_T.join(100);
            thread_R.join(100);
        }
        catch(InterruptedException e){
            System.exit(0);
        }
    }
    
    public static void main(String args[]) throws Exception{
        reference();
    }
}

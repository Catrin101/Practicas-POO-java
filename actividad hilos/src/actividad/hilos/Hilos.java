package actividad.hilos;

public class Hilos implements Runnable{
    
    private int tipo;
    
    public Hilos (int tipo){
        this.tipo = tipo;
    }
    
    @Override
    public void run() {
        while(true){
            switch(tipo){
                case 1:
                    for (int i = 1; i < 30; i++) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (char a = 'a'; a < 'z'; a++) {
                        System.out.println(a);
                    }
                    break;
            }
        }
    }
}
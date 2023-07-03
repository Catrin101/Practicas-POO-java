package examen.pkg2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Examen2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opc = 1, numca, numcli,arti, n;
        System.out.println("cuantas cajas estaran aviertas: ");
        numca = sc.nextInt();
        numcli = (int)(1+Math.random()*20);
        arti = (int)(1+Math.random()*20);
        ArrayList<Cliente>clientes = new ArrayList<Cliente>();
        for(int i = 0; i < numcli; i ++){
            int [] narti = new int[arti];
            for(int o = 0; o < arti; o++){
                narti[o] = n = (int)(2+Math.random()*5);
            }
            clientes.add(new Cliente("Cliente"+ i+1, narti));
        }
        
        long initialTime = System.currentTimeMillis();
        
        ExecutorService executor = Executors.newFixedThreadPool(numca);
        for(Cliente cliente: clientes){
            Runnable cajera = new Cajera(cliente, init);
            executor.execute(cajera);
        }
        executor.shutdown();
        while(!executor.isTerminated()){
            
        }
        
        long fin = System.currentTimeMillis();
        System.out.println("tiempo total de procesamiento: "+(fin-init)/1000+"segundos");
    }
    
}

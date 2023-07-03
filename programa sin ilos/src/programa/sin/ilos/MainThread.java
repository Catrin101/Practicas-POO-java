package programa.sin.ilos;

public class MainThread {
    
        Cliente cliente1 = new Cliente("cliente 1", new int[] {2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("cliente 2", new int[] {1,3,5,1,1});
        
        Cajera cajera1 = new Cajera("cajera 1");
        Cajera cajera2 = new Cajera("cajera 2");
        
        long initialTime = System.currentTimeMillis();
        
        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
        
        cajera1.star();
        cajera2.star();
}

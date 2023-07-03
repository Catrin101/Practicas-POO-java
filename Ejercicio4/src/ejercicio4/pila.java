package ejercicio4;

public class pila{
    private Automovil inicio;
    int tope;
    
    public pila(int size){
        inicio = null;
        tope = -1;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTope(){
        return tope;
    }
    
    public void apilar(int placa, int movimientos){
        Automovil nuevo = new Automovil();
        nuevo.setPlaca(placa);
        nuevo.setMovimientos(movimientos);
        if(esVacia()){
            inicio = nuevo;
        }
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tope++;
    }
    
    public int desapilar(){
        if(!esVacia()){
            inicio = inicio.getSiguiente();
            tope--;
            inicio.movimientos++;
        }
        return inicio.placa;
    }
    
    public void mostrarPila(){
        Automovil aux = inicio;
        while(aux != null){
            System.out.println("{"+"\"Placa\": "+aux.getPlaca());
            aux = aux.getSiguiente();
        }
    }
}

package ejercicio4;

public class Automovil {
    int placa,movimientos;
    Automovil siguiente;
    
    public Automovil(int placa, int mivimientos){
        this.placa = placa;
        this.movimientos = movimientos;
        this.siguiente = siguiente;
    }
    
    public Automovil(){
    
    }
    
    public int getPlaca(){
        return placa;
    }
    
    public void setPlaca(int placa){
        this.placa = placa;
    }
    
    public int getMovimientos(){
        return movimientos;
    }
    
    public void setMovimientos(int movimientos){
        this.movimientos = movimientos;
    }
    
    public Automovil getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Automovil siguiente){
        this.siguiente = siguiente;
    }
}

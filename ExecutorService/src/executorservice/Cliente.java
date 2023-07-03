package executorservice;

public class Cliente {
    
    private String nombre;
    private int[] carroCompra;

    Cliente(String nombre_in, int[] carroCompra_in){
        nombre = nombre_in;
        carroCompra = carroCompra_in;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
}

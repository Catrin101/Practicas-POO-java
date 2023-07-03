import java.util.ArrayList;
import java.util.ListIterator;

public class Persona {
    private String nombre;
    private int edad;
    
    private static ArrayList listeners;
    
    Persona(String nombre_in, int edad_in){
        nombre = nombre_in;
        edad = edad_in;
        
        listeners = new ArrayList();
    }
    
    public void addEventListener(CambioInterfaceListener listener) {
        listeners.add(listener);
    }
    
    
    private void triggerNameEvent() { 
        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            CambioInterfaceListener listener = (CambioInterfaceListener) li.next();
            CambiosEvento readerEvObj = new CambiosEvento(this, this);
            (listener).onNombreCambia(readerEvObj);
        }
    }
    
    private void triggerAgeEvent() {
 
        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            CambioInterfaceListener listener = (CambioInterfaceListener) li.next();
            CambiosEvento readerEvObj = new CambiosEvento(this, this);
            (listener).onEdadCambia(readerEvObj);
        }
    }
    
    
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.triggerNameEvent();
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
        this.triggerAgeEvent();
    }
}

import java.util.EventObject;

public class CambiosEvento extends EventObject{
    Persona persona;
    public CambiosEvento(Object source, Persona persona) {
        super(source);
        this.persona = persona;
        System.out.println("Entro al Evento!!!!");
    }
}

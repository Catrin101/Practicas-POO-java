import java.util.EventListener;

public interface CambioInterfaceListener extends EventListener {

    public abstract void onNombreCambia(CambiosEvento ev);

    public abstract void onEdadCambia(CambiosEvento ev);   
}
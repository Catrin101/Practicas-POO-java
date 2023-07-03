
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis.martinez
 */
public class Adaptador_Vieja_a_Nueva implements Interface_PersonaNueva{
    
    
    private Interface_PersonaVieja vieja;
    
    public Adaptador_Vieja_a_Nueva (Interface_PersonaVieja vieja){
        this.vieja = vieja;
    }

    @Override
    public String getNombre() {
        return vieja.getNombre() + " "+vieja.getApellido();
    }

    @Override
    public void setNombre(String nombre) {
        String [] nombre_apellido = nombre.split(" "); // "Luis Martinez"
        String firstName = nombre_apellido[0];
        String lastName = nombre_apellido[1];
        vieja.setNombre(firstName);
        vieja.setApellido(lastName);
    }

    @Override
    public int getEdad() {
       GregorianCalendar calendar_1 = new GregorianCalendar(); 
       GregorianCalendar calendar_2 = new GregorianCalendar();
       calendar_2.setTime(vieja.getFechaNacimiento());
       return calendar_1.get(Calendar.YEAR) - calendar_2.get(Calendar.YEAR);
    }

    @Override
    public void setEdad(int edad) {
        GregorianCalendar cal = new GregorianCalendar(); 
        int current_year = cal.get(Calendar.YEAR);
        cal.set(Calendar.YEAR, current_year - edad);
        vieja.setFechaNacimiento(cal.getTime());
    }
   
}

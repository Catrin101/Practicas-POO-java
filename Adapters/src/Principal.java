
import java.util.Date;
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
public class Principal {
    public static void main(String[] args) {
        
        //Persona Vieja
        PersonaVieja personaVieja = new PersonaVieja();
        personaVieja.setApellido("Perez");
        personaVieja.setNombre("Jose");
        
        GregorianCalendar g = new GregorianCalendar();
        g.set(2000,01,01);
        Date d = g.getTime();
        personaVieja.setFechaNacimiento(d);
        
        
        //Persona vieja a persona nueva        
        Adaptador_Vieja_a_Nueva personaNueva = new Adaptador_Vieja_a_Nueva(personaVieja);
        System.out.println("Edad: "+personaNueva.getEdad());
        System.out.println("Nombre: "+personaNueva.getNombre());
        
        personaNueva.setEdad(20);
        personaNueva.setNombre("Juan Rivera");
        
        System.out.println("Edad: "+personaNueva.getEdad());
        System.out.println("Nombre: "+personaNueva.getNombre());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis.martinez
 */
public class PersonaNueva implements Interface_PersonaNueva{
    private String nombre;
    private int edad;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;       
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}

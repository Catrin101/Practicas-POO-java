package practica8;
import java.lang.reflect.*;

public class Practica8 {

    public static void main(String[] args) {
        Class clase;
        Field campo, campos[];
        Method metodo, metodos[];
        try{
            clase = Class.forName("Carros");
            System.out.println("lista de campo:\n");
            campos = clase.getFields();
            for(int i=0; i<campos.length; i++){
                campo = campos[i];
                System.out.println("\t" + campo.getName());
            }
            System.out.println("\nlista de metodos:\n");
            metodos = clase.getMethods();
            for(int i=0; i<metodos.length; i++){
                metodo = metodos[i];
                System.out.println("\t" + metodo.getName());
            }
        }catch(ClassNotFoundException e){
            System.out.println("no se ha encontrado la clase:"+e);
        }
    }
    
}

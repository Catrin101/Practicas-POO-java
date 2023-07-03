package practica.pkg9;
import java.net.*;
import java.util.Date;
import java.io.*;
public class Practica9 {
    public static void main(String[] args) {
        String cadena;
        try{
            URL url = new URL("http://yaqui.mx.uabc.mx");
            URLConnection conexion = url.openConnection();
            BufferedReader paginaHtml = new BufferedReader(new InputStreamReader(url.openStream()));
            while((cadena = paginaHtml.readLine())!=null){
                System.out.println(cadena);
            }
            System.out.println("DIRECCION:"+conexion.getURL());
            Date fecha = new Date(conexion.getLastModified());
            System.out.println("FECHA DE ULTIMA MODIFICACION:"+fecha);
            System.out.println("TIPO DE CONTENIDO:"+conexion.getContentType());
        }
        catch(MalformedURLException e){
            System.out.println("Error al crear el URL"+e);
        }
        catch(IOException e){
            System.out.println("Error de I/O"+e);
        }
    }
    
}

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class URLexample {

    public static void main(String[] args) {

        String url_str = "http://www.google.com:80";

        readURL(url_str);
        parseURL(url_str);
        lectura_URLConnection();
        lectura_escritura();

    }

    public static void readURL(String url_str) {
        URL url;
        try {

            url = new URL(url_str);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();

            System.out.println("\n\n\n\n\n");
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLexample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(URLexample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void parseURL(String url) {

        if (url.isEmpty()) //The first argument is a URL object that specifies the base of the new URL. The second argument is a String that specifies the rest of the resource name relative to the base. 
        {
            url = "http://example.com:80/docs/books/tutorial" + "/index.html?name=networking#DOWNLOADING";
        }

        try {
            URL aURL = new URL(url);
            //Returns the protocol identifier component of the URL.
            System.out.println("protocol = " + aURL.getProtocol());
            //Returns the authority component of the URL. (component preceded by two slashes)
            System.out.println("authority = " + aURL.getAuthority());
            //Returns the host name component of the URL.
            System.out.println("host = " + aURL.getHost());
            //Returns the port number component of the URL. The getPort method returns an integer that is the port number. If the port is not set, getPort returns -1.
            System.out.println("port = " + aURL.getPort());
            //Returns the path component of this URL.
            System.out.println("path = " + aURL.getPath());
            //Returns the query component of this URL.
            System.out.println("query = " + aURL.getQuery());
            //Returns the filename component of the URL. The getFile method returns the same as getPath, plus the concatenation of the value of getQuery, if any.
            System.out.println("filename = " + aURL.getFile());
            //Returns the reference component of the URL.
            System.out.println("ref = " + aURL.getRef());
            
            System.out.println("\n\n\n\n\n");
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLexample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //1. Crear un objeto URL “http://nereida.deioc.ull.es/~cleon/in.dat”
    //2. Abrir la conexión, obteniendo un objeto URLConnection a través del método openConnection()de la clase URL
    //3. Obtener un InputStream a partir del método getInputStream() de la clase URLConnection
    //4. Crear un BufferedReader para sacar por pantalla el contenido del recurso al que nos hemos conectado.
    public static void lectura_URLConnection() {
        try {
            URL url = new URL("https://www.oracleimg.com/us/assets/metrics/ora_docs.js");
            //conecta a esa URL
            URLConnection urlconnection = url.openConnection();
            //Asocia un flujo de entrada a la conexión URL
            InputStream is = (urlconnection.getInputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String data;
            while ((data = in.readLine()) != null) {
                System.out.println(data);
            }

            in.close();
            
            System.out.println("\n\n\n\n\n");
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLexample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(URLexample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void lectura_escritura(){         

        String stringToReverse;
        try {
            stringToReverse = URLEncoder.encode("Tu cadena", "UTF-8");
        

        URL url = new URL("http://www.javasoft.com/cgi-bin/backwards");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        OutputStreamWriter out = new OutputStreamWriter(
                                         connection.getOutputStream());
        out.write("string=" + stringToReverse);
        out.close();

        BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    connection.getInputStream()));
        String decodedString;
        while ((decodedString = in.readLine()) != null) {
            System.out.println(decodedString);
        }
        in.close();
        
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(URLexample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLexample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(URLexample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

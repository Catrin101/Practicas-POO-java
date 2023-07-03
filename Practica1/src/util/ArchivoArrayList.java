package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoArrayList <T>{
    private String archivo_name = "";
    public ArchivoArrayList(String archivo_name) {
        this.archivo_name = archivo_name;
    }
    
    public boolean existeArchivo() {
        File archivo = new File(archivo_name);
        return archivo.exists();
    }
    
    public ArrayList<T> leerArchivo() {
        ArrayList<T> arrayList = new ArrayList<>();
        if (existeArchivo()) {
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            try {
                fis = new FileInputStream(archivo_name);
                ois = new ObjectInputStream(fis);
                arrayList = (ArrayList<T>) ois.readObject();
            } catch (FileNotFoundException ex) {
                System.out.println("Error: " + ex.getMessage());
                ex.printStackTrace();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                System.out.println("Error: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return arrayList;
    }
    public void actualizarArchivo(ArrayList<T> arrayList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            File archivo = new File(archivo_name);
            archivo.createNewFile(); //crear el archivo si no existe
            fos = new FileOutputStream(archivo_name);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(arrayList);
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

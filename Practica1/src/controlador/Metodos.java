package controlador;

import java.util.ArrayList;
import modelo.Ventas;
import util.ArchivoArrayList;

public class Metodos {
    
    private ArrayList<Ventas> ventasArray;
    private ArchivoArrayList<Ventas> arch_univ = new ArchivoArrayList<>("ventas.dat");

    
    public Metodos(){
        ventasArray = new ArrayList<>();
        ventasArray = arch_univ.leerArchivo();
    }

    public void actualizar_datos(){
        arch_univ.actualizarArchivo(ventasArray);
    }
    
    public void crearventas(String tarjeta, float dinero, String tipMoneda, int numTar, String nom, String direccion, String cp, int codSegu, String pais) {
        Ventas a = new Ventas(tarjeta, dinero, tipMoneda, numTar, nom, direccion, cp, codSegu, pais);
        ventasArray.add(a);
    }
    
    public String show() {
        System.out.println(ventasArray);
	String info = "";
	for (Ventas cli : ventasArray) {
		info += cli.toString() + '\n';
	}
	return info;
    }
}

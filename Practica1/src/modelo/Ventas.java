package modelo;

import java.util.ArrayList;

public class Ventas {
    private String tarjeta;
    private float dinero;
    private String tipMoneda;
    private int numTar;
    private String nom;
    private String direccion;
    private String cp;
    private int codSegu;
    private String pais;
    
    public Ventas(){
        
    }
    
    public Ventas(String tarjeta, float dinero, String tipMoneda, int numTar, String nom, String direccion, String cp, int codSegu, String pais) {
        this.tarjeta = tarjeta;
        this.dinero = dinero;
        this.tipMoneda = tipMoneda;
        this.numTar = numTar;
        this.nom = nom;
        this.direccion = direccion;
        this.cp = cp;
        this.codSegu = codSegu;
        this.pais = pais;
    }
  
    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public String getTipMoneda() {
        return tipMoneda;
    }

    public void setTipMoneda(String tipMoneda) {
        this.tipMoneda = tipMoneda;
    }

    public int getNumTar() {
        return numTar;
    }

    public void setNumTar(int numTar) {
        this.numTar = numTar;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public int getCodSegu() {
        return codSegu;
    }

    public void setCodSegu(int codSegu) {
        this.codSegu = codSegu;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String toString() {
	String texto =super.toString() + "\nDatos de venta\n"
        + "\ntarjeta: " + tarjeta
                + "\ndinero: " + dinero
                + "\ntipo de moneda: " + tipMoneda
                + "\nnomero de tarjeta: " + numTar
                + "\nnombre: " + nom
                + "\ndireccion: " + direccion
                + "\nC.P: " + cp
                + "\ncodigo de seguridad: " + codSegu
                + "\npais: " + pais
                + "..........................................................."; 
	return texto;
    }
}

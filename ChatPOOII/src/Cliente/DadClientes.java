package Cliente;

import java.util.ArrayList;

public class DadClientes {
    private String nom;
    
    public DadClientes(){
        
    }
    
    public DadClientes(String nom) {
        this.nom = nom;
    }
  
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

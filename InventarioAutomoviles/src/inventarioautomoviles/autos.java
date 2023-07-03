package inventarioautomoviles;

import java.io.Serializable;

public class autos implements Comparable<InventarioAutomoviles>{
    private int id,puertas,anno;
    private String color,marca;
    
    public autos(int id,int puertas,int anno,String color,String marca){
        this.id = id;
        this.puertas = puertas;
        this.anno = anno;
        this.color = color;
        this.marca = marca;
    }
    
    public autos(){
    
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getPuertas(){
        return puertas;
    }
    
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    
    public int getAnno(){
        return anno;
    }
    
    public void setAnno(int anno){
        this.anno = anno;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String toString(){
        return  "\nID:"+id
                +"\nMarca:"+marca
                +"\nAnno:"+anno
                +"\nColor:"+color
                +"\nPuertas:"+puertas;
    }

    @Override
    public int compareTo(InventarioAutomoviles o) {
        return color.compareTo(o.getColor());
    }
}

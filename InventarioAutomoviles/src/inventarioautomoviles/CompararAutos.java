package inventarioautomoviles;

import java.util.Comparator;

public class CompararAutos implements Comparator<autos>{
    public int compare(autos a1, autos a2){
        if(a1.getId() < a2.getId()){
            return -1;
        }else{
            if(a1.getId() < a2.getId()){
                return 0;
            }else{
                return 1;
            }
        }
    }
}

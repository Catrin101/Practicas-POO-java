public class Principal {
    
    static CambioInterfaceListener events = new CambioInterfaceListener() {
        @Override
        public void onNombreCambia(CambiosEvento ev) {            
            System.out.println("Se hizo un cambio de nombre a "+ev.persona.getNombre());
        }

        @Override
        public void onEdadCambia(CambiosEvento ev) {
            System.out.println("Se hizo un cambio de edad "+ev.persona.getEdad());
        }
    
    };
    
    public static void main(String[] args) {                
        Persona persona = new Persona("Jose", 20);
        
        persona.addEventListener(events);
        
        persona.setNombre("Pedro");
    }
}

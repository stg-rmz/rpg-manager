package co.edu.udistrital.rpgmanager.servicio;
import co.edu.udistrital.rpgmanager.modelo.Personaje;

public class PersonajeServicio {
    public boolean validarPersonaje(String nombre, int nivel, String clase){
        if(nivel<=1 || nivel>=100){
            return false;
        }
        if (nombre==null || nombre.trim().isEmpty()){
            return false;
        }
        if ((clase.toLowerCase().equals("mago"))||(clase.toLowerCase().equals("arquero"))||(clase.toLowerCase().equals("guerrero"))){
            return true;
        }
        return false;
    }
}

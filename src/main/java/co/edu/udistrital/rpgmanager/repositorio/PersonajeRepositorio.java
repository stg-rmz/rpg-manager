package co.edu.udistrital.rpgmanager.repositorio;

import co.edu.udistrital.rpgmanager.modelo.Personaje;
import java.util.List;
import java.util.ArrayList;

public class PersonajeRepositorio {
    private List<Personaje> listaPersonajes = new ArrayList<>();
    public void guardar (Personaje personaje) {
        listaPersonajes.add(personaje);
    }
    public List<Personaje> obtenerTodos() {
        return listaPersonajes;
    }
}

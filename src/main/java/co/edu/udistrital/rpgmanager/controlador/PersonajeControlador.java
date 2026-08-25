package co.edu.udistrital.rpgmanager.controlador;

import io.javalin.http.Context;
import co.edu.udistrital.rpgmanager.repositorio.PersonajeRepositorio;

public class PersonajeControlador {
    private PersonajeRepositorio repositorio = new PersonajeRepositorio();
    
    public void listar(Context ctx) {
        ctx.json(repositorio.obtenerTodos());
    }
}

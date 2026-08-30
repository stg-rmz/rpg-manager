package co.edu.udistrital.rpgmanager.controlador;

import io.javalin.http.Context;
import co.edu.udistrital.rpgmanager.modelo.Personaje;
import co.edu.udistrital.rpgmanager.repositorio.PersonajeRepositorio;

public class PersonajeControlador {
    private PersonajeRepositorio repositorio = new PersonajeRepositorio();
    
    public void listar(Context ctx) {
        ctx.json(repositorio.obtenerTodos());
    }
    public void guardar(Context ctx) {
        String nombre = ctx.formParam("nombre");
        String tipo = ctx.formParam("tipo");
        int nivel = Integer.parseInt(ctx.formParam("nivel"));
        int vida = 100;

        Personaje nuevo = new Personaje(nombre, tipo, nivel,vida);
        repositorio.guardar(nuevo);

        ctx.redirect("/index.html");
    }
}

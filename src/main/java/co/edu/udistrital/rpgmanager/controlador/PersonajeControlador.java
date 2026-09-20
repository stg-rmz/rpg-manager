package co.edu.udistrital.rpgmanager.controlador;

import io.javalin.http.Context;
import co.edu.udistrital.rpgmanager.modelo.Personaje;
import co.edu.udistrital.rpgmanager.repositorio.PersonajeRepositorio;
import co.edu.udistrital.rpgmanager.servicio.PersonajeServicio;

public class PersonajeControlador {
    private PersonajeRepositorio repositorio = new PersonajeRepositorio();
    private PersonajeServicio servicio = new PersonajeServicio();
    
    public void listar(Context ctx) {
        ctx.json(repositorio.obtenerTodos());
    }
    public void guardar(Context ctx) {
        String nombre = ctx.formParam("nombre");
        String tipo = ctx.formParam("tipo");
        int nivel = Integer.parseInt(ctx.formParam("nivel"));
        int vida = 100;
        if(servicio.validarPersonaje(nombre, nivel, tipo)){
            Personaje nuevo = new Personaje(nombre, tipo, nivel,vida);
            repositorio.guardar(nuevo);
            ctx.redirect("/index.html");
        }
        ctx.html("<h2>Error: Datos ingresados invalidos</h2>" +
            "<p>Recuerda que el nivel debe estar entre 1 y 100 y la clase debe ser valida.</p>" +
            "<a href='/index.html'><button>Volver al formulario</button></a>");
    }
}

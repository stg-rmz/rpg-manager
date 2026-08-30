package co.edu.udistrital.rpgmanager;

import io.javalin.Javalin;
import co.edu.udistrital.rpgmanager.controlador.PersonajeControlador;

public class RpgManager {

    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.staticFiles.add("/public");
        }).start(7070);
        PersonajeControlador controlador = new PersonajeControlador();
        
        app.get("/", ctx -> ctx.result("RPG Manager iniciado correctamente"));
        app.get("/personajes", controlador::listar);
        app.post("/personajes", controlador::guardar);
        
        app.post("/personajes", ctx -> {
            String nombre = ctx.formParam("nombre");
            String tipo = ctx.formParam("tipo");
            int nivel = Integer.parseInt(ctx.formParam("nivel"));
            
        ctx.redirect("/index.html");
        });
    }
}

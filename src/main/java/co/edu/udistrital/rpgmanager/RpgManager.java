package co.edu.udistrital.rpgmanager;

import io.javalin.Javalin;
import co.edu.udistrital.rpgmanager.controlador.PersonajeControlador;

public class RpgManager {

    public static void main(String[] args) {
        var app = Javalin.create().start(7070);
        PersonajeControlador controlador = new PersonajeControlador();
        
        app.get("/", ctx -> ctx.result("RPG Manager iniciado correctamente"));
        app.get("/personajes", controlador::listar);
    }
}

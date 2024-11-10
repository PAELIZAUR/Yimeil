package edu.unsada.yimeil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Esto asegura que todas las rutas de este controlador comiencen con /api
public class TestController {

    // Endpoint para probar la conexión CORS
    @GetMapping("/test")
    public String test() {
        return "Conexión exitosa";  // Respuesta simple para probar la conexión
    }
}

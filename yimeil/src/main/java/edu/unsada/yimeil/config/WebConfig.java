package edu.unsada.yimeil.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        // Permitir solicitudes CORS desde tu frontend React
        registry.addMapping("/api/**")  // Rutas del backend que permitirán CORS
                .allowedOrigins("http://localhost:3000")  // Aquí se especifica la URL del frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos HTTP permitidos
                .allowedHeaders("*")  // Encabezados permitidos
                .allowCredentials(true);  // Permitir credenciales (cookies, headers de autenticación)
     }
}

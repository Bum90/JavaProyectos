package com.example.demo.runner;

import com.example.demo.marketing.Campana;
import com.example.demo.marketing.Plataforma;
import com.example.demo.marketing.RegistroConversion;
import com.example.demo.comunidad.Usuario;
import com.example.demo.comunidad.Publicacion;
import com.example.demo.comunidad.Reaccion;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class AcademiaRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        // EJERCICIO 1: Gestión de Campañas de Marketing Digital
        Campana campana1 = new Campana(LocalDate.of(2026, 1, 10), 1, "Verano 2026", 5000.0);

        Plataforma plataforma1 = new Plataforma(1, "Google Ads", "https://ads.google.com");

        RegistroConversion conversion1 = new RegistroConversion(
                1, "venta", 250.0, LocalDateTime.now(), campana1, plataforma1
        );

        System.out.println("Campaña: " + campana1.getNombreCampana());
        System.out.println("Plataforma: " + plataforma1.getNombrePlataforma());
        System.out.println("Conversión de tipo: " + conversion1.getTipoConversion()
                + " por valor: " + conversion1.getValor()
                + " en campaña: " + conversion1.getCampana().getNombreCampana()
                + " vía plataforma: " + conversion1.getPlataforma().getNombrePlataforma());

        // EJERCICIO 2: Gestión de Contenido de una Comunidad de Videojuegos
        Usuario usuario1 = new Usuario("Juan123", 1, LocalDate.of(2025, 3, 15));

        Publicacion publicacion1 = new Publicacion(1, "¡Terminé el juego!", LocalDateTime.now(), usuario1);

        Reaccion reaccion1 = new Reaccion(1, "like", LocalDateTime.now(), usuario1, publicacion1);

        System.out.println("Usuario: " + usuario1.getNombreUsuario());
        System.out.println("Publicación: " + publicacion1.getContenido()
                + " (autor: " + publicacion1.getAutorDePost().getNombreUsuario() + ")");
        System.out.println("Reacción de tipo: " + reaccion1.getTipoReaccion()
                + " por usuario: " + reaccion1.getUsuarioQueReacciona().getNombreUsuario()
                + " sobre publicación: " + reaccion1.getPublicacion().getContenido());
    }
}
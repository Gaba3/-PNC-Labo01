package org.example.labo01.common;

import org.example.labo01.domain.model.Especimen;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListaEspecimenes {
    private final List<Especimen> especimenes;

    public ListaEspecimenes(){
        this.especimenes = new ArrayList<>();

        this.especimenes.add(Especimen.builder()
                .nombre("Licker")
                .virusBase("T-virus")
                .nivelPeligro(3)
                .puntoDebil("Cabeza")
                .estado("Contenido")
                .ubicacion("Laboratorio")
                .posibleBrote("Magna 3")
                .build()
        );

        this.especimenes.add(Especimen.builder()
                .nombre("Hunter")
                .virusBase("G-virus")
                .nivelPeligro(2)
                .puntoDebil("Cuello")
                .estado("Eliminado")
                .ubicacion("Comisaria")
                .posibleBrote("Aulas B")
                .build()
        );

        this.especimenes.add(Especimen.builder()
                .nombre("Tyrant")
                .virusBase("Las Plagas")
                .nivelPeligro(5)
                .puntoDebil("Corazon")
                .estado("En libertad")
                .ubicacion("Pueblo")
                .posibleBrote("Cafeteria")
                .build()
        );

        this.especimenes.add(Especimen.builder()
                .nombre("Licker")
                .virusBase("Cadou")
                .nivelPeligro(1)
                .puntoDebil("Torso")
                .estado("Contenido")
                .ubicacion("Mansion")
                .posibleBrote("Biblioteca")
                .build()
        );

        this.especimenes.add(Especimen.builder()
                .nombre("Hunter")
                .virusBase("T-virus")
                .nivelPeligro(4)
                .puntoDebil("Cabeza")
                .estado("Contenido")
                .ubicacion("Pueblo")
                .posibleBrote("Aulas D")
                .build()
        );

        this.especimenes.add(Especimen.builder()
                .nombre("Tyrant")
                .virusBase("G-virus")
                .nivelPeligro(3)
                .puntoDebil("Corazon")
                .estado("En libertad")
                .ubicacion("Mansion")
                .posibleBrote("Aulas B")
                .build()
        );

        this.especimenes.add(Especimen.builder()
                .nombre("Licker")
                .virusBase("G-virus")
                .nivelPeligro(3)
                .puntoDebil("Torso")
                .estado("En libertad")
                .ubicacion("Pueblo")
                .posibleBrote("ICAS")
                .build()
        );
    }

    public List<Especimen> getEspecimenes(){
        return especimenes;
    }
 }

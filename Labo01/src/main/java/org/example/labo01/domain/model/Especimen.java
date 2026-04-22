package org.example.labo01.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Especimen {
    private String Nombre;
    private String Virus_base;
    private int nivel_peligro;
    private String Punto_debil;
    private String Estado;
    private String Ubicacion;
    private String Posible_brote;

}

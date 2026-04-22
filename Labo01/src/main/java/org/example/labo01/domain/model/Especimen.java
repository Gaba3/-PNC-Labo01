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
    private String nombre;
    private String virusBase;
    private int nivelPeligro;
    private String puntoDebil;
    private String estado;
    private String ubicacion;
    private String posibleBrote;

}

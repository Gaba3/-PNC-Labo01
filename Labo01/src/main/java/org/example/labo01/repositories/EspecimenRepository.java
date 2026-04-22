package org.example.labo01.repositories;

import lombok.RequiredArgsConstructor;
import org.example.labo01.common.ListaEspecimenes;
import org.example.labo01.domain.model.Especimen;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EspecimenRepository {
    private final ListaEspecimenes listaEspecimenes;

    public List<Especimen> findAll(){
        return listaEspecimenes.getEspecimenes();
    }
}

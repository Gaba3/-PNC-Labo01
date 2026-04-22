package org.example.labo01.services;

import lombok.RequiredArgsConstructor;
import org.example.labo01.domain.model.Especimen;
import org.example.labo01.repositories.EspecimenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilterByEstatus {
    private final EspecimenRepository especimenRepository;

    public List<Especimen> filterbyestatus(String estado){
        return especimenRepository.findAll().stream()
                .filter(e-> e.getEstado().equalsIgnoreCase(estado))
                .toList();
    }
}

package org.example.labo01.services;

import lombok.RequiredArgsConstructor;
import org.example.labo01.domain.model.Especimen;
import org.example.labo01.repositories.EspecimenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EspecimenService {
    private final EspecimenRepository especimenRepository;

    public List<Especimen> getAllEspecimen(){
        return especimenRepository.findAll();
    }
}

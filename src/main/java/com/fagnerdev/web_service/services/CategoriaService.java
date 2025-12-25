package com.fagnerdev.web_service.services;

import com.fagnerdev.web_service.entities.Categoria;
import com.fagnerdev.web_service.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {


    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria findById(Long id) {
        Optional<Categoria> category = categoriaRepository.findById(id);
        return category.get();
    }
}

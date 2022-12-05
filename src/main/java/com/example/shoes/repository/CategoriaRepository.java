package com.example.shoes.repository;

import com.example.shoes.entity.Categoria;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    public List<Categoria> findByDescripcion(String descripcion);
}

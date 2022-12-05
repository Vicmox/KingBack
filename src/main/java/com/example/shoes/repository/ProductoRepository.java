package com.example.shoes.repository;

import com.example.shoes.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}

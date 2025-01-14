package com.nicolas.literalura.repository;

import com.nicolas.literalura.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iLibroRepository extends JpaRepository<Libro, Long> {

    boolean existsByTitulo(String titulo);

    Libro findByTituloContainsIgnoreCase(String titulo);

    List<Libro> findByIdioma(String idioma);

    List<Libro> findTop10ByOrderByCantidadDescargasDesc();
}


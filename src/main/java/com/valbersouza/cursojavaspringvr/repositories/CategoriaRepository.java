package com.valbersouza.cursojavaspringvr.repositories;

import com.valbersouza.cursojavaspringvr.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}

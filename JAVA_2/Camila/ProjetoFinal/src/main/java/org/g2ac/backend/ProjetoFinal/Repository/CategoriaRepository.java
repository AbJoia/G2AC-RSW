package org.g2ac.backend.ProjetoFinal.Repository;

import org.g2ac.backend.ProjetoFinal.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}

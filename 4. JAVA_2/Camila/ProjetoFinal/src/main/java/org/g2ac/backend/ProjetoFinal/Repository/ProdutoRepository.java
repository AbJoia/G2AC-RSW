package org.g2ac.backend.ProjetoFinal.repository;

import org.g2ac.backend.ProjetoFinal.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}

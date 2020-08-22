package org.g2ac.java2backend.ProjetoFinal.repository;

import org.g2ac.java2backend.ProjetoFinal.entities.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}

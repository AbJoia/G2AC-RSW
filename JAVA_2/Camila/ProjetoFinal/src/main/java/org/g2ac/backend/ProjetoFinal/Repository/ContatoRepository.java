package org.g2ac.backend.ProjetoFinal.repository;

import org.g2ac.backend.ProjetoFinal.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer>{
	
	

}

package org.g2ac.backend.ProjetoFinal.Repository;

import org.g2ac.backend.ProjetoFinal.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}

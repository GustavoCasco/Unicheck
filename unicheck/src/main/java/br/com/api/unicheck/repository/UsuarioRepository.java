package br.com.api.unicheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.unicheck.model.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}

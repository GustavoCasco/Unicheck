package br.com.api.unicheck.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.unicheck.model.Usuario;
import br.com.api.unicheck.model.dto.UsuarioDTO;
import br.com.api.unicheck.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public UsuarioDTO salvar(UsuarioDTO newUser) {
		return this.repository.save(newUser.toEntity()).toDto();
	}
	
	public List<UsuarioDTO> getall()
	{
		List<Usuario> usuario = this.repository.findAll();
		return usuario.stream().map(user -> user.toDto()).collect(Collectors.toCollection(ArrayList::new));
	}

}

package br.com.api.unicheck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.api.unicheck.model.dto.UsuarioDTO;
import br.com.api.unicheck.service.UsuarioService;

@Controller
@RequestMapping("/unicheck")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<UsuarioDTO>> getAll()
	{
		return ResponseEntity.ok(this.usuarioService.getall());
	}
	
	@PostMapping("/saveusuario")
	public ResponseEntity<UsuarioDTO> save(@RequestBody UsuarioDTO newUser)
	{
		return ResponseEntity.ok(this.usuarioService.salvar(newUser));
	}
}

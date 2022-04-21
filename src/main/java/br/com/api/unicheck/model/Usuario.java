package br.com.api.unicheck.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import br.com.api.unicheck.model.dto.UsuarioDTO;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	private String nome;
	private String cpf;
	
	
	public UsuarioDTO toDto() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(this, UsuarioDTO.class);
	}
}

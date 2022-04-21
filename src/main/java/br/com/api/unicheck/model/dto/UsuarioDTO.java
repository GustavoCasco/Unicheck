package br.com.api.unicheck.model.dto;

import org.modelmapper.ModelMapper;

import br.com.api.unicheck.model.Usuario;
import lombok.Data;

@Data
public class UsuarioDTO {

	private String nome;
	private String cpf;
	
	public Usuario toEntity()
	{
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(this, Usuario.class);
	}
}

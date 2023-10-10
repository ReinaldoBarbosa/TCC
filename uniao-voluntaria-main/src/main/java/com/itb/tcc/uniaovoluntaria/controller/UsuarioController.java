package com.itb.tcc.uniaovoluntaria.controller;

import java.util.ArrayList;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.uniaovoluntaria.model.Usuario;
import com.itb.tcc.uniaovoluntaria.repository.UsuarioRepository;

@Controller
@RequestMapping("/uniao-voluntaria/usuario")
public class UsuarioController {
	List<Usuario> listUsuario = new ArrayList<Usuario>();
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	
	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@GetMapping("/listar-usuario")
	public String ListarUsuario(Model model) {
		
		model.addAttribute("usuario" , usuarioRepository.findAll());
		return "crud-user";
		
	}
	
	//Carregar o formulario cadastro 
	
	@GetMapping("/novo-usuario")
	public String CadastrarUsuario(Usuario usuario, Model model) {
		model.addAttribute("usuario", usuario);
		return "novo-usuario";
		
	}
	
	
	//Cadastrar (inserir) 
	
	@PostMapping("/add-usuario")
	public String gravarUsuario(Usuario usuario, BindingResult result ,Model model) {
		if(result.hasErrors()) {
			return "novo-usuario";
		}
		Usuario usuarioDb = usuarioRepository.save(usuario);
		usuario.setStatus(true);
		return "redirect:/uniao-voluntaria/usuario/listar-usuario";
		
	}
	
	@GetMapping("/todos")
	public List<Usuario> listUsuario(){
		return usuarioRepository.findAll();
		
	}
	
	
	
}
 
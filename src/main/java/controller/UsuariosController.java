package controller;

import java.util.List;

import javax.inject.Inject;

import model.Usuario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import dao.UsuarioRepository;

@Controller
@Path("/usuarios")
public class UsuariosController {
	
	@Inject private Result result;
	@Inject private UsuarioRepository repository;

	@Get("/form")
	public void form() {
		
	}
	
	@Get("")
	public List<Usuario> listar() {
		List<Usuario> list = (List<Usuario>) repository.list();
		return list;
	}
	
	@Post("/save")
	public void save(Usuario usuario) {
		repository.save(usuario);
		result.redirectTo(this).listar();
	}
	
	@Path("/editar/{id}")
	public void editar(Long id) {
		Usuario u = null;
		if (id != null) {
			u = repository.find(id);
			result.include("usuario", u);
		}
	}
	
	@Get("/remover/{id}")
	public void remover(Long id) {
		if (id != null) {
			repository.delete(id);
		}
		result.redirectTo(this).listar();
	}
	
}

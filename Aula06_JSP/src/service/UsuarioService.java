package service;

import model.Usuario;
import dao.UsuarioDAO;

public class UsuarioService {
	UsuarioDAO dao = new UsuarioDAO();
	
	public int cadastrar(Usuario usuario) {
		return dao.cadastrar(usuario);
	}
	
	public void atualizar(Usuario usuario){
		dao.atualizar(usuario);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Usuario carregar(int id){
		return dao.carregar(id);
	}

}//end class UsuarioService
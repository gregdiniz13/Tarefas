package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import model.Usuario;
import model.Criptografia;
import service.UsuarioService;

@WebServlet("/CadastrarUsuario.do")
public class ManterUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int id = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Criptografia cripto = new Criptografia();
		String pNome = request.getParameter("nome");
		String pLogin = request.getParameter("login");
		int pSenha = cripto.cifrar(Integer.parseInt(request.getParameter("senha")));
		int pTipo = Integer.parseInt(request.getParameter("tipo"));
		String pRg = request.getParameter("rg");
		String pCpf = request.getParameter("cpf");
		
		// instanciar o javabean
		Usuario usuario = new Usuario();
		usuario.setNome(pNome);
		usuario.setLogin(pLogin);
		usuario.setSenha(pSenha);
		usuario.setTipo(pTipo);
		usuario.setRg(pRg);
		usuario.setCpf(pCpf);
		// instanciar o service
		UsuarioService us = new UsuarioService();
		id = us.cadastrar(usuario);
		usuario = us.carregar(usuario.getId());
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Usuário Cadastrado</title></head><body>");
		out.println("id: " + usuario.getId() + "<br>");
		out.println("Nome: " + usuario.getNome() + "<br>");
		out.println("Login: " + usuario.getLogin() + "<br>");
		out.println("Tipo: " + usuario.getTipo() + "<br>");
		out.println("RG: " + usuario.getRg() + "<br>");
		out.println("CPF: " + usuario.getCpf() + "<br>");
		out.println("</body></html>");
	}
}//end class
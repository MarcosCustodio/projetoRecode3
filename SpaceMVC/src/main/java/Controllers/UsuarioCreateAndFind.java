package Controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UsuarioDAO;
import model.Usuario;


@WebServlet("/CreateAndFind")
public class UsuarioCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public UsuarioCreateAndFind() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa == null) {
			pesquisa="";
		}
		
		List<Usuario> usuarios = UsuarioDAO.find(pesquisa);
		
		request.setAttribute("usuario", usuarios);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("lista.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		
		usuario.setNome_usuario(request.getParameter("nome_usuario"));
		usuario.setCpf_usuario(request.getParameter("cpf_usuario"));
		usuario.setTelefone_usuario(request.getParameter("telefone_usuario"));
		usuario.setEmail_usuario(request.getParameter("email_usuario"));
		usuario.setSenha_usuario(request.getParameter("senha_usuario"));
		
		UsuarioDAO.create(usuario);
		
		doGet(request, response);
	}

}

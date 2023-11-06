package Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UsuarioDAO;
import model.Usuario;


@WebServlet("/UsuarioUpdate")
public class UsuarioUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UsuarioUpdate() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int usuarioId = Integer.parseInt(request.getParameter("usuarioId"));
		Usuario usuario = UsuarioDAO.findByPk(usuarioId);
		
		request.setAttribute("usuario", usuario);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Usuario usuario = new Usuario();
		
		usuario.setId_usuario(Integer.parseInt(request.getParameter("id_usuario")));
		usuario.setNome_usuario(request.getParameter("nome_usuario"));
		usuario.setCpf_usuario(request.getParameter("cpf_usuario"));
		usuario.setTelefone_usuario(request.getParameter("telefone_usuario"));
		usuario.setEmail_usuario(request.getParameter("email_usuario"));
		usuario.setSenha_usuario(request.getParameter("senha_usuario"));
		
		UsuarioDAO.update(usuario);
		
		UsuarioCreateAndFind usuarioCreateAndFind = new UsuarioCreateAndFind();
		usuarioCreateAndFind.doGet(request, response);
	}

}

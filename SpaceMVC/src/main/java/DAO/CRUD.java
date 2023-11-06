package DAO;

import java.util.List;

import model.Usuario;

public interface CRUD {

	public static void create(Usuario usuario) {};
	public static void delete(int clienteId) {};
	public static List<Usuario> find(String pesquisa){return null;}
	public static Usuario findByPk(int clienteId) {return null;}
	public static void update(Usuario usuario) {};
}
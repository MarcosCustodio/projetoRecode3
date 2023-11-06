package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Usuario;

public class UsuarioDAO implements CRUD{
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(Usuario usuario) {
		sql = "INSERT INTO usuario VALUES (null, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, usuario.getNome_usuario());
			preparedStatement.setString(2, usuario.getCpf_usuario());
			preparedStatement.setString(3, usuario.getTelefone_usuario());
			preparedStatement.setString(4, usuario.getEmail_usuario());
			preparedStatement.setString(5, usuario.getSenha_usuario());
			
			
			preparedStatement.executeUpdate();
			
			System.out.println("--Correct insert on database");
			
		} catch (Exception e) {
			System.out.println("--Incorret insert on database. " + e.getMessage());
		}
	}
	
	public static void delete(int clienteId) {
	
		sql = "DELETE FROM usuario WHERE id_usuario = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, clienteId);
			preparedStatement.executeUpdate();
			
			System.out.println("--Correct delete on usuario");
			
		} catch (SQLException e) {
			System.out.println("--Incorrect delete on usuario"+ e.getMessage());
		}
	}
	
	public static List<Usuario> find(String pesquisa){
		
		sql = String.format("SELECT * FROM usuario WHERE nome_usuario LIKE '%s%%' OR cpf_usuario LIKE '%s%%' ", pesquisa, pesquisa);
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Usuario usuario = new Usuario();
				usuario.setId_usuario(resultSet.getInt("id_usuario"));
				usuario.setNome_usuario(resultSet.getString("nome_usuario"));
				usuario.setCpf_usuario(resultSet.getString("cpf_usuario"));
				usuario.setTelefone_usuario(resultSet.getString("telefone_usuario"));
				usuario.setEmail_usuario(resultSet.getString("email_usuario"));
				usuario.setSenha_usuario(resultSet.getString("senha_usuario"));
				
				usuarios.add(usuario);
				
			}
			System.out.println("--Correct find usuarios");
			return usuarios;
			
		} catch (SQLException e) {
			System.out.println("--Incorrect find usuarios" + e .getMessage());
		}
		
		return null;
		}
	
	public static Usuario findByPk(int usuarioId) {
		sql = String.format("SELECT * FROM usuario WHERE id_usuario = %d ", usuarioId);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Usuario usuario = new Usuario();
			
			while (resultSet.next()) {
				
				
				usuario.setId_usuario(resultSet.getInt("id_usuario"));
				usuario.setNome_usuario(resultSet.getString("nome_usuario"));
				usuario.setCpf_usuario(resultSet.getString("cpf_usuario"));
				usuario.setTelefone_usuario(resultSet.getString("telefone_usuario"));
				usuario.setEmail_usuario(resultSet.getString("email_usuario"));
				usuario.setSenha_usuario(resultSet.getString("senha_usuario"));	
			}
			
			System.out.println("--Correct find by pk usuarios");
			return usuario;
			
		}catch (SQLException e) {
			System.out.println("--Incorrect find by pk usuarios" + e .getMessage());
		}
		
		return null;
		}
	
	public static void update(Usuario usuario) {
		
		sql = "UPDATE usuario SET nome_usuario=?, cpf_usuario=?, telefone_usuario=?, email_usuario=?, senha_usuario=? WHERE id_usuario=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, usuario.getNome_usuario());
			preparedStatement.setString(2, usuario.getCpf_usuario());
			preparedStatement.setString(3, usuario.getTelefone_usuario());
			preparedStatement.setString(4, usuario.getEmail_usuario());
			preparedStatement.setString(5, usuario.getSenha_usuario());
			preparedStatement.setInt(6, usuario.getId_usuario());
			
			
			preparedStatement.executeUpdate();
			
			System.out.println("--Correct update on database");
			
		} catch (Exception e) {
			System.out.println("--Incorret update on database. " + e.getMessage());
		}
	}
}
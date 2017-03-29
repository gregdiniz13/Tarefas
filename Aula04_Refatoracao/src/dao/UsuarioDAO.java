package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuario;

public class UsuarioDAO {
	public int cadastrar(Usuario usuario){
		String sqlInsert = "INSERT INTO usuario(idusuario, nome, login, senha, rg, cpf, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setInt(1, usuario.getId());
			stm.setString(2, usuario.getNome());
			stm.setString(3, usuario.getLogin());
			stm.setInt(4, usuario.getSenha());
			stm.setString(5, usuario.getRg());
			stm.setString(6, usuario.getCpf());
			stm.setInt(7, usuario.getTipo());
			stm.execute();
			/*String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
					ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					usuario.setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}*/
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario.getId();
	}//end cadastrar
	
	public void atualizar(Usuario usuario) {
		String sqlUpdate = "UPDATE usuario SET nome=?, login=?, senha=?, rg=?, cpf=?, tipo=? WHERE id=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, usuario.getNome());
			stm.setString(2, usuario.getLogin());
			stm.setInt(3, usuario.getSenha());
			stm.setString(4, usuario.getRg());
			stm.setString(5, usuario.getCpf());
			stm.setInt(6, usuario.getTipo());
			stm.setInt(7, usuario.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end atualizar
	
	public void excluir(int id) {
		String sqlDelete = "DELETE FROM usuario WHERE id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, id);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end excluir
	
	public Usuario carregar(int id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		String sqlSelect = "SELECT idusuario, nome, login, senha, rg, cpf, tipo FROM usuario WHERE usuario.id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, usuario.getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					usuario.setId(rs.getInt("idusuario"));
					usuario.setNome(rs.getString("nome"));
					usuario.setLogin(rs.getString("login"));
					usuario.setSenha(rs.getInt("senha"));
					usuario.setRg(rs.getString("rg"));
					usuario.setCpf(rs.getString("cpf"));
					usuario.setTipo(rs.getInt("tipo"));
				} else {
					usuario.setId(-1);
					usuario.setNome(null);
					usuario.setLogin(null);
					usuario.setSenha(0);
					usuario.setRg(null);
					usuario.setCpf(null);
					usuario.setTipo(0);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return usuario;
	}//end carregar
}//end class UsuarioDAO
package ex.jbcd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ex.jbcd.entidades.Dog;
import ex.jbcd.interfaces.ICrud;
import ex.jbcd.utilidades.Conexao;

public class DaoDog implements ICrud<Dog> {

	@Override
	public boolean salvar(Dog obj) {
		String sql = "insert into dog (nome, raca, idade) values(?, ?, ?)";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getRaca());
			stm.setString(3, obj.getIdade());
			stm.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			Conexao.fechar();
		}
		return true;
	}

	@Override
	public boolean alterar(Dog obj) {
		String sql = "update dog set " + "nome = ?," + "raca = ?," + "idade = ?" + "where id = ?";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getRaca());
			stm.setString(3, obj.getIdade());
			stm.setInt(4, obj.getId());
			stm.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			Conexao.fechar();
		}
		return true;
	}

	@Override
	public void excluir(int id) {
		String sql = "delete from dog where id = " + id;
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			Conexao.fechar();
		}
	}

	@Override
	public Dog consultar(int id) {
		Dog dog = new Dog();
		String sql = "select * from dog where id = " + id;
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				dog.setId(rs.getInt("id"));
				dog.setNome(rs.getString("nome"));
				dog.setRaca(rs.getString("raca"));
				dog.setIdade(rs.getString("idade"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			Conexao.fechar();
		}
		return dog;
	}

	@Override
	public List<Dog> consultar() {
		List<Dog> dogs = new ArrayList<>();
		String sql = "select * from dog";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Dog dog = new Dog();
				dog.setId(rs.getInt("id"));
				dog.setNome(rs.getString("nome"));
				dog.setRaca(rs.getString("raca"));
				dog.setIdade(rs.getString("idade"));
				dogs.add(dog);

			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} finally {
			Conexao.fechar();
		}

		return dogs;
	}

}

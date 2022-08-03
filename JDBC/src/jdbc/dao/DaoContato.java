package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import jdbc.entidades.Contato;
import jdbc.interfaces.ICrud;
import jdbc.utilidades.Conexao;

public class DaoContato implements ICrud<Contato>{

	@Override
	public boolean salvar(Contato obj) {
		String sql = "insert into contato (nome, fone, email) values(?,?,?)";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getFone());
			stm.setString(3, obj.getEmail());
			stm.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public boolean alterar(Contato obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contato consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

}

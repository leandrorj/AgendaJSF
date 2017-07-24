package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.modelo.Evento;


public class EventoDAO {
	PreparedStatement pstm;
	ResultSet rs;
	private Connection conexao;

	// metodo inserir
	public void salvar(Evento evento) throws SQLException {
		String sql = "INSERT INTO evento(titulo_evento, inicio_evento, fim_evento, desc_evento, status_evento) VALUES (?, ?, ?, ?, ?)";

		conexao = FabricaConexao.conectar();
		pstm = conexao.prepareStatement(sql);

		pstm.setString(1, evento.getTituloDoEvento());
		pstm.setDate(2, new java.sql.Date(evento.getInicioDoEvento().getTime()));
		pstm.setDate(3, new java.sql.Date(evento.getFimDoEvento().getTime()));
		pstm.setString(4, evento.getDescricaoDoEvento());
		pstm.setBoolean(5, evento.isStatusDoEvento());

		pstm.executeUpdate();

	}

	// metodo atualizar
	public void atualizar(Evento evento) throws SQLException {
		String sql = "UPDATE evento SET titulo_evento=?, inicio_evento=?, fim_evento=?, desc_evento=?, status_evento=? WHERE id_evento=?";

		conexao = FabricaConexao.conectar();
		pstm = conexao.prepareStatement(sql);

		pstm.setString(1, evento.getTituloDoEvento());
		pstm.setDate(2, new java.sql.Date(evento.getInicioDoEvento().getTime()));
		pstm.setDate(3, new java.sql.Date(evento.getFimDoEvento().getTime()));
		pstm.setString(4, evento.getDescricaoDoEvento());
		pstm.setBoolean(5, evento.isStatusDoEvento());
		pstm.setLong(6, evento.getIdDoEvento());

		pstm.executeUpdate();

	}
	
	//metodo listar
	public List<Evento> todosEventos() throws SQLException{
		List<Evento> eventos = new ArrayList<Evento>();
		
		String sql = "SELECT * FROM evento";
		
		conexao = FabricaConexao.conectar();
		pstm = conexao.prepareStatement(sql);
		
		rs = pstm.executeQuery();
		
		while(rs.next()){
			Evento e = new Evento();
			e.setIdDoEvento(rs.getLong(1));
			e.setTituloDoEvento(rs.getString(2));
			e.setInicioDoEvento(rs.getDate(3));
			e.setFimDoEvento(rs.getDate(4));
			e.setDescricaoDoEvento(rs.getString(5));
			e.setStatusDoEvento(rs.getBoolean(6));
			
			eventos.add(e);
			
		}
		
		return eventos;
	}

}

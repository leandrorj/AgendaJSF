package br.com.agenda.test.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import br.com.agenda.dao.FabricaConexao;

public class FabricaConexaoTest {

	@Test
	public void test() throws SQLException {
		try {
			FabricaConexao.conectar();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

//Aula111 - JDBC Insert, Batch, add e executeBatch() 

package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirDados {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "insert into pessoa values(?, ?, ?, ?)";
		
		String[] pessoas = {"Sandra", "Camila", "Juliana", "Fatima", "Veranda", "Tereza", "Leila"};
		
		try(Connection con = DriverManager.getConnection(url, "emersondms", "Oracle2013")) {
			try(PreparedStatement stm = con.prepareStatement(sql)) {
				for (int i = 0; i < pessoas.length; i++) {
					stm.setInt(1, i + 4);
					stm.setString(2, pessoas[i]);
					stm.setString(3, "f");
					stm.setString(4, pessoas[i].toLowerCase() + "@xti.com.br");
					stm.addBatch();
				}
				stm.executeBatch();
			} catch(SQLException e) {}
			
			sql = "select nome, email from pessoa";
				
			try(PreparedStatement stm2 = con.prepareStatement(sql);
				ResultSet rs = stm2.executeQuery()) {
					while(rs.next()) {
							System.out.println(rs.getString(1) + " : " + rs.getString(2));
					}
				}
		}
		
	}
	
}

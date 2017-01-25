//Aula110 - JDBC Select, Driver, Connection, Statement e Resultset 

package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcessoBanco {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "select codigo, nome, sexo, email from pessoa";
				
		try (
		Connection con = DriverManager.getConnection(url, "emersondms", "Oracle2013");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery()) {	
			while(rs.next()) {
				String s = rs.getString("codigo") + " ; " + rs.getString("nome") + " ; " + rs.getString("sexo") + " ; " + rs.getString("email") + ".";                                                               
				System.out.println(s);
			}
		}				
	}	
}


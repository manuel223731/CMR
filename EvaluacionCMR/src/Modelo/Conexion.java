package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	public Connection conectar() {
		Connection bd	= null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriverS");
			bd = DriverManager.getConnection("jdbc:sqlserver://localhost:8080:DatabaseName=usuarios_login", "DESKTOP-EQS03A5\Manuel", "");
			
		}catch(Exception ex) {
			
		}
		return bd;
	}
}

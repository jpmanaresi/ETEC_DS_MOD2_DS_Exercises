package conexaobd.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import conexaobd.persistencia.Conexao;


public class App {
	public static void main (String[] args) {
	
		Connection instanciaValidaCon = Conexao.getInstance();
		System.out.println(instanciaValidaCon);
		try {
			PreparedStatement stmt = instanciaValidaCon.prepareStatement("insert into cliente (nome) values ('hugo');");
			stmt.execute();
		}
		catch (SQLException el)
		{
			el.printStackTrace();
		}
		try {
			PreparedStatement stmt = instanciaValidaCon.prepareStatement("update cliente set nome = 'huguinho' where nome = 'hugo'");
			stmt.execute();
		} catch (SQLException el) {
			el.printStackTrace();
		}
		try {
			Statement stmt = instanciaValidaCon.createStatement();
			ResultSet rs = stmt.executeQuery("select * from cliente");
			
			while (rs.next()) {
				String n = rs.getString("nome");
				System.out.println(n);
			}
		} catch (SQLException e){
			
			e.printStackTrace();
		}
	}
}

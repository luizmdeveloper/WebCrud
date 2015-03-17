package br.com.luizmario.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Conexao {

	private static ResourceBundle config = ResourceBundle.getBundle(ConstantesDb.CONEXAO_PROPERTIES);
	
	public static Connection getInstance() throws ClassNotFoundException, SQLException{
		Class.forName(config.getString(ConstantesDb.CONEXAO_DRIVER));
		return DriverManager.getConnection("jdbc:"+config.getString(ConstantesDb.CONEXAO_BANCO)+"://"+config.getString(ConstantesDb.CONEXAO_IP)+":"+config.getString(ConstantesDb.CONEXAO_PORTA)+"/"+config.getString(ConstantesDb.CONEXAO_SCHEMA),config.getString(ConstantesDb.CONEXAO_USER),config.getString(ConstantesDb.CONEXAO_PASSWORD));
	}

}

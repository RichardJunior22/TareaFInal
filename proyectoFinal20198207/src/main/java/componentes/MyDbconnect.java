/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Richard Fortunato
 */
public class MyDbconnect {
    Connection conectar = null;

	public Connection conexion() {
		
	   try {
		conectar = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/almacenitla8341?characterEncoding=utf8&useSSL=false&useUnicode=true", "estuditla8341", "itla123.");//Establishing connection
		System.out.println("Se establecio la conexion a la base de datos");
		
	} catch (SQLException e) {
		
		System.out.println("Error al conectara a la base de datos " + e.getMessage());
	
		}
	return conectar;
}			
}

package com.valsatech.bdd.libraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBDriver {
	
	
	public static Map<String,String> readDBData(String sqlQuery,String[] columns) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		Map<String,String> data = new HashMap<String,String>();
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bitnami_sugarcrm","dbuser","admin");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);
		
		while(rs.next())
		{
			for(String column:columns)
			{
				data.put(column, rs.getString(column));
			}
		}
	
	   
		con.close();
		return data;
	}

}

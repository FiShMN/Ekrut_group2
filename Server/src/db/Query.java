package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Query {

	public static String checkLogin(String userName,String password) {
		StringBuilder result = new StringBuilder();  
		String id = null;
		PreparedStatement stmt;
		String query = "";
		try {
			if (mysqlConnection.conn != null) {
				stmt = mysqlConnection.conn.prepareStatement("SELECT * FROM users WHERE userName = ? AND password = ?");
				stmt.setString(1, userName);
				stmt.setString(2, password);
				ResultSet rs  = stmt.executeQuery();
				while (rs.next()) {
					if((rs.getString("isLoggedIn")).equals("1")) {
						return "Already_logged_in"; 
					}
					id=rs.getString(1);
					result.append(rs.getString(1));
					result.append("#");
					result.append(rs.getString(2));
					result.append("#");
					result.append(rs.getString(3));
					result.append("#");
					result.append(rs.getString(4));
					result.append("#");
					result.append(rs.getString(5));
					result.append("#");
					result.append(rs.getString(6));
					result.append("#");
					result.append(rs.getString(7));
					result.append("#");
					result.append(rs.getString(8));
					result.append("#");
					result.append(rs.getString(9));
					}
				
				rs.close();
				//empty result
				if(result.length() == 0)
					return "Wrong_Input";
				
				stmt = mysqlConnection.conn.prepareStatement("UPDATE users SET isLoggedIn='1' where id=?");
				stmt.setString(1, id);
				stmt.executeUpdate();
		}
			}
			catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result.toString();
	}

public void name() {
	
}
}


		


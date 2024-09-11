package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MuOperation {
	
	Connection con=null;
	
	public MuOperation() {
		
	}
public MuOperation(Connection conn) {
		this.con=conn;
	}


//........REGISTRATION...................//


	
public void createTable() throws SQLException {
	try(Statement st=con.createStatement()){
		st.execute("create table if not exists musicdb(username varchar(20),"
				+ "Dob date,"
				+ "gender varchar(10),"
				+ "email varchar(255),"
				+ "Phone_no bigint,"
				+ "password varchar(20))");
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	
	
public void insertData(String username,String dob,String gender,String email,String Phone_no,String password) throws SQLException {
	
	try(PreparedStatement pt=con.prepareStatement("insert into musicdb(username,dob,gender,email,Phone_no,password) values(?,?,?,?,?,?)")){
		pt.setString(1, username);
		pt.setString(2, dob);
		pt.setString(3, gender);
		pt.setString(4, email);
		pt.setString(5, Phone_no);
		pt.setString(6, password);
		
		
		pt.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

public void createTab() throws SQLException {
    String createTableSQL = "CREATE TABLE IF NOT EXISTS musicdb (" +
                             "username VARCHAR(25), " +
                             "dob DATE" + 
                             "Gender VARCHAR(25),"+
                             "email VARCHAR(255), " +
                             "phone_number BIGINT" + 
                             "password VARCHAR(25))";
    try (Statement st = con.createStatement()) {
        st.execute(createTableSQL);
    } catch (SQLException e) {
        e.printStackTrace();
        throw e; // Re-throwing exception after logging it
    }
}
public void insertDa(String username,String dob,String gender,String email,String Phone_no,String password) throws SQLException {
    String insertSQL = "INSERT INTO musicdb (username,dob,gender,email,Phone_no,password) VALUES ( ?, ?, ?,?,?,?)";
    try (PreparedStatement pt = con.prepareStatement(insertSQL)) {
		pt.setString(1, username);
		pt.setString(2, dob);
		pt.setString(3, gender);
		pt.setString(4, email);
		pt.setString(5, Phone_no);
		pt.setString(6, password);
        pt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
        throw e;
    }
}


//........LOGIN...................//


public boolean logindata(String username,String password)throws SQLException,NullPointerException{
	String query="select * from musicdb where username=? and password=?";
	try {
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, password);
		try(ResultSet rs = ps.executeQuery()) {
	        return rs.next();
	    }
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return false;
}



//.............CONTACT.....................//

public void createTable1() throws SQLException {
	try(Statement st=con.createStatement()){
		st.execute("create table if not exists contacts("
				+ "name varchar(20),"
				+ "phone bigint,"
				+ "email varchar(255),"
				+ "comment varchar(20))");
	}catch(Exception e) {
		e.printStackTrace();
	}
}

	
	
public void insertData(String name,String phone,String email,String comment) throws SQLException {
	
	try(PreparedStatement pt=con.prepareStatement("insert into contacts(name,phone,email,comment) values(?,?,?,?)")){
		pt.setString(1, name);
		pt.setString(2, phone);
		pt.setString(3, email);
		pt.setString(4, comment);
		
		
		pt.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

public void createTab1() throws SQLException {
    String createTableSQL = "CREATE TABLE IF NOT EXISTS contacts(" +
                             "name VARCHAR(25), " +  
                             "phone BIGINT" + 
                             "email VARCHAR(25),"+
                             "comment VARCHAR(255))" ;
                            
    try (Statement st = con.createStatement()) {
        st.execute(createTableSQL);
    } catch (SQLException e) {
        e.printStackTrace();
        throw e; // Re-throwing exception after logging it
    }
}
public void insertDa(String name,String phone,String email,String comment) throws SQLException {
    try (PreparedStatement pt = con.prepareStatement( "INSERT INTO contacts (name,phone,email,comment) VALUES (?,?,?,?)")) {
		pt.setString(1, name);
		pt.setString(2, phone);
		pt.setString(3, email);
		pt.setString(4, comment);
        pt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
        throw e;
    }
}
}



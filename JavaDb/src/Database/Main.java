package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//connect and create table, post and select
		createTable();  
		post();
		get();		

	}
	public static void createTable() throws Exception {
		try {
			Connection con = getConnection();                   
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS cars(id int NOT NULL AUTO_INCREMENT, Mark varchar(255), Owner varchar(255), PRIMARY KEY(id))");   // we are getting sql statement to be ready to use | pick java.sql not com.sql
			
			create.executeUpdate();
			
		}catch(Exception e) {System.out.println(e);}
		
		finally{System.out.println("Function complete");};
	}

	public static void post() throws Exception{

		final String var1 = "Lamborghini";
		final String var2 = "Mark";
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO cars (Mark, Owner) VALUES ('"+var1+"', '"+var2+"')"); // "' trick
			
			posted.executeUpdate();                 //query - receive | update - manipulate
		} catch(Exception e){System.out.println(e);}
		finally {
			System.out.println("Insert Completed.");
		}
	}
	
	public static ArrayList<String> get() throws Exception{ //import from java.util  we call out info so we need to put it somewhere - arrlist
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT Mark, Owner FROM cars LIMIT 1");  // * also selects id
						
			ResultSet result = statement.executeQuery();
						
			ArrayList<String> array = new ArrayList<String>(); //return to func that called us
			while(result.next()) {
				System.out.println(result.getString("Mark")+" "+result.getString("Owner"));
/*!!*/				array.add(result.getString("Owner")); //Repeat about this returning
            System.out.println(array); //arifm prog because of statement and that we adding new stuff everytime(fixed by Limit 1)
			}
			System.out.println("All info was selected");
			return array;
		} catch(Exception e) {System.out.println(e);}
		return null;
	}
	
	public static Connection getConnection() throws Exception{ //need to import connections from "Connection java.sql
		try {
			String driver = "com.mysql.jdbc.Driver";              //define variables how we ll connect to db. 
			String url = "jdbc:mysql://localhost/database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";  //where is db located and 
			//unicode an compliant timezone and legacy date time code helped to establish connection
			String username ="WolfusFlow";                        
			String password ="123";                     
			Class.forName(driver);                                
			
			Connection conn = DriverManager.getConnection(url, username, password); 
			System.out.println("Connection complite");            
			return conn; //if it worked
		}
		catch(Exception e){
			System.out.println(e);} 
		
		return null;		//or return conn
	}
}

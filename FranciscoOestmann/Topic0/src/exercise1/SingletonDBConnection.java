package exercise1;
import java.sql.*;

public class SingletonDBConnection {
	
	//state
	private static SingletonDBConnection sDBConn = null;
	private static Connection conn = null;
	
	//private constructor so  the Class can't be instantiated from outside Classes
	private SingletonDBConnection(){
		conn = getConnection();
	}
	
	//public method to instantiation of the class
	public static SingletonDBConnection getInstance(){
		if(sDBConn==null){
			sDBConn = new SingletonDBConnection(); 
		}
		System.out.println("Connected.");
		return sDBConn;
	}
	
	//method to set a connection 
	public Connection getConnection(){
		return conn;
	}
	
	
}

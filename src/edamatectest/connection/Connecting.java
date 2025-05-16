package edamatectest.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.SQLException;

public class Connecting {
   
    private static final String URL = "jdbc:mysql://localhost:3306/customer_register";
    private static final String USER = "root";
    private static final String PASSWORD = "Jholly1577.564";
    
    public static Connection connect() throws SQLException{
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
//            ResultSet rsClient = conn.createStatement().executeQuery("SELECT * FROM customer");;
//            while(rsClient.next()){
//                System.out.println("Nome: " + rsClient.getString("customer_name"));
//            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados nao localizado");
        } catch (SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        }
        return conn;
    }
}

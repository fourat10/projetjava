
package ig;

import java.sql.*;



public class Connecteur {
    
    Connection con;
    public Connecteur (){  

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/best_cars";
            String user="root";
            String pass="16122003";
            con=DriverManager.getConnection(url,user, pass);
            System.out.println("connexion disponible");
        }
        catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e);
        }
    }       
        public Connection connecttodb(){

                       return con; 
        }  
}

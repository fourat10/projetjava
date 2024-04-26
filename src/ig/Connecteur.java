
package ig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connecteur {
    
    Connection con;
    public Connecteur (){  

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/best_cars";
            String user="root";
            String pass="foufoufourat123";
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

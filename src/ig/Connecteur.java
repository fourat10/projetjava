
package ig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connecteur {
    
    Connection con;
    public Connecteur (){  

                try{
                    //driver mta3na
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    //url fiih el base de donnes w user w password
                    String password="foufoufourat123";
                    String url ="jdbc:mysql://localhost:3306/best_cars";
                    String user="root";
                    con=DriverManager.getConnection(url,user,password);
                    System.out.println("CONNEXION DISPONIBLE");
                }
                catch(ClassNotFoundException | SQLException e){
                System.out.println("PAS DE CONNEXION");
                
                }
        }       

        public Connection connecttodb(){
                       return con; 
        }
       
    
}

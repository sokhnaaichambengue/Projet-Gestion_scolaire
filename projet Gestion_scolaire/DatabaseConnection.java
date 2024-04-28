
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String[] args) throws ClassNotFoundException {
        Connection  connection=null;
        try{
            //charger le driver jdbc
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Etablir la connexion avec la base de donnees
            String url ="jdbc:mysql://localhost:3306/gestion_scolaire";
            String username="sokhna";
            String password="sokhna";
            connection = DriverManager.getConnection(url, username, password);
            if(connection!=null){

                System.out.println("connexion reussie");
            }
            
        }catch (ClassNotFoundException e){
            
        System.out.println("DRIVER jdbc non trouvee");
        e.printStackTrace();
    }catch(SQLException e){
    System.out.println("Echec de la connexion a la base de donnees");
    e.printStackTrace();

    }finally{
        try{
            if(connection !=null){
                connection.close();

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
}


            





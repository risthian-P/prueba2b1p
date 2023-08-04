import java.sql.*;
public class Cconection {
    String DB_URL="jdbc:mysql://localhost/Registro";
    String USER="root";
    String password="root_bas3";

    public void establecerCon(){
        try {
            Connection conn = DriverManager.getConnection(DB_URL,USER,password);
            System.out.println("coneccion exitosa");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}

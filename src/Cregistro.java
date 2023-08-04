import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Cregistro {
    String DB_URL="jdbc:mysql://localhost/Registro";
    String USER="root";
    String password="root_bas3";
    Cconection objetoingreso = new Cconection();
    String codigo,cedula,nombre,fecha,signo;
    public void ingresarReg(String cod,String ced,String nom, String f, String sig){
        //('12345678','0909552655','Ana Casillas',"2000-02-10",'piscis')
        String sql="insert into informacion values (" +"'"+codigo+"'"+","+"'"+cedula+"'"+","+"'"+nombre+"'"+","+"'"+fecha+"'"+","+"'"+signo+"'"+")";
        try {
            objetoingreso.establecerCon();
            Connection conn = DriverManager.getConnection(DB_URL,USER,password);
            codigo = cod;
            cedula = ced;
            nombre = nom;
            fecha = f;
            signo = sig;
            System.out.println("ingreso exitoso");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void buscarcodigo(String cod){ String sql="select * from informacion where codigo = "+"'"+codigo+"'"+")";
        try {
            objetoingreso.establecerCon();
            Connection conn = DriverManager.getConnection(DB_URL,USER,password);
            codigo = cod;
            System.out.println("ingreso exitoso");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
}
}
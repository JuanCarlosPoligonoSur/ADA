
/*Ejercicio 1

Crea la base de datos tienda. Esta base de datos tiene una tabla de nombre clientes que dispone de los campos password, usuario, dirección y teléfono, todos ellos de tipo texto, por ello deben escribirse  entre comillas. El campo usuario será la clave. Realiza desde Java la inserción de los siguientes datos registros: 

password  usuario    direccion                    telefono
333        Juan    Paseo de Roma 34               333444555
222        lola    Av. Alemania                   222333444
555        María   Avda. París, 7                 555666777
444        Pedro  Plaza de la Constitución, 1     444555666
111        pepe        Av. París                  111222333



Una vez creada la tabla anterior, crea tres métodos, uno para insertar datos en la tabla, otro para  actualizar datos de una tabla y, por último, uno para borrar datos de la tabla. Los datos deberán  insertarse por teclado. 
 */
package com.ada;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorEjercicio1 {


    private String url="jdbc:mysql://localhost:8000/tienda";
    private String user="root";
    private String password="1234";
    private Connection con;

    public  GestorEjercicio1() throws SQLException{
        con = DriverManager.getConnection(url, user,password);
    }


    public boolean realizarOperacionInsertar(String password, String usuario, String direccion, String telefono) throws SQLException{


        Statement st = con.createStatement();

        return st.execute("INSERT INTO cliente VALUES ("+password+","+usuario+","+direccion+","+telefono+");");

    }

       public boolean realizarOperacionModificar(String columna, valor) throws SQLException{


      
        Statement st = con.createStatement();

        return st.execute("UPDATE cliente SET"+columna+"WHERE"+valor+";");

    }


       public boolean realizarOperacionBorrar(String usuario) throws SQLException{


        Statement st = con.createStatement();

        return st.execute("DELETE FROM cliente WHERE usuario like"+usuario+";");

    }


    public void cerrarConection() throws SQLException{
        con.close();
    }



}






    

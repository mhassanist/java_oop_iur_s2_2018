/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package wafflecity.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MSAUDI
 */
public class DatabaseManager {
    
    static String dbName 	= "wafflecity";
    static String dbUrl 	= "jdbc:mysql://127.0.0.1:3306/"+dbName;
    static String user		= "root"; //change the user if you have another user
    static String password	= "";//write your password if you have
    private static Connection connection;
    
    
    public static int saveMenuItem(MenuItem i){
        
        try{
            //open connection
            connection = DriverManager.getConnection(dbUrl,user,password);
            System.out.println("Connected");
            
            Statement  s = connection.createStatement();
            s.execute("INSERT INTO menuitem (name, description, price) VALUES ('"+
                    i.getName()+"','"+
                    i.getDescription()+"',"+
                    i.getPrice()+")");
            System.out.println("Inserted");
            
            connection.close();
            
        } catch (Exception ex){
            
            System.out.println("Error:"+ ex.getMessage());
            
        }
        return 0;
    }
    
    public static ArrayList<MenuItem> getMenuItems(){
        ArrayList<MenuItem> menuitems = new  ArrayList<>();
        try{
            //open connection
            connection = DriverManager.getConnection(dbUrl,user,password);
            System.out.println("Connected");
            
            Statement  s = connection.createStatement();
            
            ResultSet r = s.executeQuery("select * from menuitem");
            
            while (r.next()) {
                
                int id              = r.getInt(1); // id
                String name         = r.getString(2);
                String description  = r.getString(3);
                double price        = r.getDouble(4);
                
                MenuItem m = new  MenuItem();
                m.setId(id);
                m.setName(name);
                m.setDescription(description);
                m.setPrice(price);
                
                menuitems.add(m);
                
            }
            
            connection.close();
            
        } catch (Exception ex){
            
            System.out.println("Error:"+ ex.getMessage());
            
        }
        
        return menuitems;
        
    }
}

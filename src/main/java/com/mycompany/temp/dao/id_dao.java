/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.temp.dao;

import com.mycompany.temp.model.id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author AGI03
 */
public class id_dao {
      public id getId(int aid )
    {
        id a = new id();
        System.out.println("***");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://agn.db.mysql.agnieindia.com:3306/agnieportal","db_user","AgnChennai@2021");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Login_Master where LOGINID=" + aid);
           if( rs.next())
           {
               a.setId(rs.getInt("LOGINID"));
               a.setUsername(rs.getString("USERNAME"));
               a.setPassword(rs.getString("PASSWORD"));
                System.out.println("***");
               System.out.println(rs.getInt("LOGINID"));
           }
           
        }
        catch(Exception e)
        {   System.out.println("eeeeeeeeeeeeeeerrrrrrrrrrrrrrrooooooooooooooorrrrrrrrrrrrrr");
            System.out.println(e);
                    }
        return a;
    }
      
}

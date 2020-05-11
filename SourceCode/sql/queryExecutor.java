package SourceCode.sql;

import SourceCode.config.mysql;
import java.sql.*;
import java.util.*;


public class queryExecutor {
    public static List<List<String> > getData(String cmd,int attributeCount) {
        List<List<String> > entries = new ArrayList<>();
        try(Connection con = DriverManager.getConnection(mysql.getUrl(),mysql.getUser(),mysql.getPassword())) {
//            System.out.println("Connection Established");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(cmd);

            while(resultSet.next())
            {
                List<String> temp = new ArrayList<>();
                for(int i=1 ; i <= attributeCount ; i++) {
                    temp.add(resultSet.getString(i));
                }
                entries.add(temp);
            }
        }
        catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return entries;

    }

    public static void addData(String cmd)
    {
        try(Connection con = DriverManager.getConnection(mysql.getUrl(),mysql.getUser(),mysql.getPassword())) {

            Statement statement = con.createStatement();
            statement.executeUpdate(cmd);
//            System.out.println(cmd);
        }
        catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
    
}

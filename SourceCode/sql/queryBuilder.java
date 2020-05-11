package SourceCode.sql;

import java.util.HashMap;
import java.util.Map;

public class queryBuilder {
    public static String getDataFromSingle(String tableName, String[] attributes, HashMap<String,String> conditionForSelect)
    {
        String statement = "SELECT ";
        int cnt = 0;
        for(String attribute : attributes){
            if(cnt!=0)
                statement = statement + ", ";
            statement = statement+ attribute;
            cnt=1;
        }
        cnt=0;
        statement = statement +" FROM "+ tableName;
        for(Map.Entry mapElement : conditionForSelect.entrySet())
        {
            if(cnt!=0)
                statement = statement + " AND ";
            else
                statement = statement + " WHERE ";
            statement = statement + mapElement.getKey()+"="+mapElement.getValue();
            cnt=1;
        }
        statement = statement + ";";
        return statement;

    }
    public static String addDataToSingle(String tableName,String[] attributes,String[] values,String[] type)
    {
        String statement = "INSERT INTO ";
        statement = statement + tableName+" VALUES(";
        int cnt=0;
        for(String value : values){
            if(cnt!=0)
                statement = statement + ", ";
            if(type[cnt].equals("int"))
                statement = statement + value;
            else
                statement = statement + "'"+value+"'";
            cnt++;
        }
        statement = statement + ");";
        return statement;
    }
}

package SourceCode.sql;

public class queryBuilder {
    public static String getDataFromSingle(String tableName, String[] attributes)
    {
        String statement = "SELECT ";
        int cnt = 0;
        for(String attribute : attributes){
            if(cnt==1)
                statement = statement + ", ";
            statement = statement+ attribute;
            cnt=1;
        }
        statement = statement +" FROM "+ tableName+";";
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

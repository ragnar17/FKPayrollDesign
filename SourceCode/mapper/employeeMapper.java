package SourceCode.mapper;

/* Map the Object Variables to Table Columns */

import java.util.*;

public class employeeMapper {
    private static final String[] memberVariableName = new String[]{"id","firstName","lastName","mobileNo",
            "email","address","type"};
    private static final String[] columnName = new String[]{"id","firstName","lastName","mobileNo",
            "email","address","type"};
    private static final String tableName = "employee";

    public static String mappedTo(String key)
    {
        String value = "";
        for(int i=0 ; i<columnName.length ; i++)
        {
            if(memberVariableName[i].equals(key))
            {
                value = columnName[i];
                break;
            }
        }
        return value;
    }
    public static String[] getField()
    {
        return memberVariableName;
    }
    public static String[] getColumn()
    {
        return columnName;
    }
    public static String getTableName()
    {
        return tableName;
    }
}

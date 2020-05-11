package SourceCode.mapper;

import java.util.HashMap;
import java.util.Map;

public class mapper {
    public static HashMap<String,String> getFieldValue(String[] memberVariableName)
    {
        HashMap< String,String> fieldValue = new HashMap< String,String>();
        for(String variable : memberVariableName) {
            fieldValue.put(variable,null);
        }
        return fieldValue;
    }
    public static HashMap<String,String> getColumnValue(String[] columnName)
    {
        HashMap< String,String> columnValue = new HashMap< String,String>();
        for(String variable : columnName) {
            columnValue.put(variable,null);
        }
        return columnValue;
    }

    public static HashMap<String,String> getFieldColumn(String[] memberVariableName,String[] columnName)
    {
        HashMap< String,String> fieldColumn = new HashMap< String,String>();
        for(int i=0;i<columnName.length;i++) {
            fieldColumn.put(memberVariableName[i],columnName[i]);
        }
        return fieldColumn;
    }
}

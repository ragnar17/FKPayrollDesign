package SourceCode.feature;

import SourceCode.mapper.mapper;
import SourceCode.sql.queryBuilder;
import SourceCode.sql.queryExecutor;
import SourceCode.entity.Employee;
import SourceCode.mapper.employeeMapper;
import SourceCode.ui.getInputFromUser;

import java.lang.reflect.*;
import java.util.*;

public class insert {

    public static void insertEmployee() {
        Map<String, String> fieldValue = mapper.getFieldValue(employeeMapper.getField());
        fieldValue = getInputFromUser.getValues(fieldValue);
        Map<String, String> fieldColumn = mapper.getFieldColumn(employeeMapper.getField(),employeeMapper.getColumn());
        Field[] fields = Employee.class.getDeclaredFields();
        insertIntoDb(employeeMapper.getTableName(),fields,fieldColumn,fieldValue);
    }

    /* It takes TableName , Fields in object , Map of Field : Column ,Map of Field : Value
    *  And then it insert into the Database*/
    public static void insertIntoDb(String tableName,Field[] fields,Map<String, String> fieldColumn,Map<String, String> fieldValue){
        String[] columnName = new String[fields.length];
        String[] value = new String[fields.length];
        String[] type = new String[fields.length];
        int i=0;
        for(Field field : fields)
        {
            value[i]        =   fieldValue.get(field.getName());
            columnName[i]   =   fieldColumn.get(field.getName());
            type[i]         =   field.getType().getSimpleName();
            i++;
        }
        String sqlCommand = queryBuilder.addDataToSingle(tableName,columnName,value,type);
        queryExecutor.addData(sqlCommand);
    }
}

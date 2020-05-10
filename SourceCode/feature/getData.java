package SourceCode.feature;

import SourceCode.mapper.employeeMapper;
import SourceCode.sql.queryBuilder;
import SourceCode.sql.queryExecutor;
import SourceCode.ui.writer;

import java.util.*;

import java.util.ArrayList;

public class getData {

    public static List<List<String> > getEmployees(HashMap<String,String> conditionForSelect)
    {
        String[] fields = employeeMapper.getField();
        String sqlCommand = queryBuilder.getDataFromSingle(employeeMapper.getTableName(),fields,conditionForSelect);
        List<List<String> > rows = new ArrayList<>();
        rows = queryExecutor.getData(sqlCommand,(int)employeeMapper.getField().length);
        return rows;
    }
    public static void showAllEmployees()
    {
        HashMap<String,String> conditionForSelect = new HashMap<>();
        writer.printMultiple(getEmployees(conditionForSelect),employeeMapper.getField());
    }

    public static void searchEmployees(HashMap<String,String> conditionForSelect)
    {
        writer.printMultiple(getEmployees(conditionForSelect),employeeMapper.getField());
    }

}

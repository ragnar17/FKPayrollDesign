package SourceCode.mapper;

/* Map the Object Variables to Table Columns */

import SourceCode.entity.Employee;

import java.util.*;
import java.lang.reflect.*;

public class employeeMapper {
    private static final String[] memberVariableName = new String[]{"id","firstName","lastName","mobileNo",
            "email","address","type"};
    private static final String[] columnName = new String[]{"id","firstName","lastName","mobileNo",
            "email","address","type"};
    private static final String tableName = "employee";


    public static String[] getField() { return memberVariableName; }
    public static String[] getColumn()
    {
        return columnName;
    }
    public static String getTableName()
    {
        return tableName;
    }

    public static Employee getEmployeeMapped(List<String> values) {
        Employee employee = new Employee();
        Field[] fields = Employee.class.getDeclaredFields();
        HashMap<String, String> fieldValue = mapper.getFieldColumn(employeeMapper.getField(), values.toArray(new String[0]));
        for (Field field : fields) {
            if (field.getType().getSimpleName().equals("int")) {
                try {
                    field.set(employee, Integer.parseInt(fieldValue.get(field.getName())));
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } else {
                try {
                    field.set(employee, fieldValue.get(field.getName()));
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }

        }
        return employee;
    }
}

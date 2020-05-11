package SourceCode.mapper;

/* Map the Object Variables to Table Columns */

import SourceCode.entity.Employee;
import SourceCode.entity.TimeCard;

import java.util.*;
import java.lang.reflect.*;

public class timeCardMapper {
    private static final String[] memberVariableName = new String[]{"empId","date","hoursWorked"};
    private static final String[] columnName = new String[]{"empid","date","hoursWorked"};
    private static final String tableName = "timeCard";

    public static String[] getField() { return memberVariableName; }
    public static String[] getColumn()
    {
        return columnName;
    }
    public static String getTableName()
    {
        return tableName;
    }

    public static TimeCard getTimeCardMapped(List<String> values) {

        TimeCard timeCard = new TimeCard();
        Field[] fields = TimeCard.class.getDeclaredFields();

        HashMap<String, String> fieldValue = mapper.getFieldColumn(timeCardMapper.getField(), values.toArray(new String[0]));
        for (Field field : fields) {
            if (field.getType().getSimpleName().equals("int")) {
                try {
                    field.set(timeCard, Integer.parseInt(fieldValue.get(field.getName())));
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } else {
                try {
                    field.set(timeCard, fieldValue.get(field.getName()));
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }

        }
        return timeCard;
    }
}

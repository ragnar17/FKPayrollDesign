package SourceCode.ui;

import java.util.*;
public class writer {
    public static void printMultiple(List<List<String>> rows,String[] fields)
    {
        int separator_count = 100;
        printCharXtimes(separator_count,'*');
        for(String attribute : fields)
        {
            System.out.print(attribute+"    ");
        }
        System.out.println();
        printCharXtimes(separator_count,'*');
        for(List<String> row : rows)
        {
            for(String entry : row)
            {
                System.out.print(entry+"    ");
            }
            System.out.println();
            printCharXtimes(separator_count,'-');
        }
    }
    public static void printSingle(List<List<String>> rows,String[] fields)
    {
        printMultiple(rows,fields);
    }

    public static void printCharXtimes(int cnt,char c)
    {
        for(int i=0;i<cnt;i++)
        {
            System.out.print(c);
        }
        System.out.println();
    }

}

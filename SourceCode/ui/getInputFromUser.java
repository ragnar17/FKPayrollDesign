package SourceCode.ui;

import java.util.*;

public class getInputFromUser {

    public static HashMap< String,String> getValues(HashMap< String,String> fieldValue)
    {
        for(Map.Entry mapElement : fieldValue.entrySet())
        {
            String key = (String)mapElement.getKey();
            if(fieldValue.get(key)!=null) {
                continue;
            }
            System.out.print("INSERT "+key.toUpperCase()+" : ");
            String value = reader.get();
            fieldValue.put(key,value);
//            System.out.println(key+" "+fieldValue.get(key));
        }

        return fieldValue;
    }
}

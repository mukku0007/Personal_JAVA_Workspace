package collection;

import java.util.HashMap;
import java.util.Map;

public class Map_To_String 
{
	public static void main(String[] args) 
	{
        Map map = new HashMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
       
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        map.forEach((key, value) -> {
            sb.append(key).append("=").append(value).append(", ");
        });
        sb.setLength(sb.length() - 2);
        sb.append("}");
       
        String result = sb.toString();
        System.out.println(result);
    }
}
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Generic {


    @Test
    public void test3(){

        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("tom",89);
        map.put("jerry",88);
        map.put("mark",89);


        //泛型的嵌套
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entry.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+"------"+value);
        }

    }
}

package primary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 1613. 最高频率的IP
 * 给定一个字符串数组lines, 每一个元素代表一个IP地址，找到出现频率最高的IP。
 * <p>
 * 给定数据只有一个频率最高的IP
 */
public class Class1613 {
    public static void main(String[] args) {

    }

    public String highestFrequency(String[] ipLines) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();
        for (String ip : ipLines) {
            if (map.containsKey(ip)) {
                map.put(ip, map.get(ip) + 1);
            } else {
                map.put(ip, 1);
            }
        }
        Iterator iterator=map.entrySet().iterator();
        int tempValue=0;
        String ip=null;
        while(iterator.hasNext()){
            Map.Entry<String,Integer> next = (Map.Entry<String, Integer>) iterator.next();
            if(next.getValue()>tempValue){
               ip=next.getKey();
               tempValue=next.getValue();
            }
        }
        return ip;
    }
}

package primary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 1910. 数组中出现次数最多的值
 * 在给定的数组中，找到出现次数最多的数字。
 * 出现次数相同时，返回数值最小的数字。
 * <p>
 * 数组长度不超过100000。
 * 0 <= a[i] <= 2147483647
 */
public class Class1910 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2, 3, 3, 3, 4, 5};
        System.out.println(findNumber(array));
    }

    public static int findNumber(int[] array) {
        // Write your code here.
        Map<Integer, Integer> map = new HashMap<>(array.length / 2);
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        int number = 0;
        int tempValue = 0;
        boolean first = true;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) iterator.next();
            if (first) {
                number = entry.getKey();
                tempValue = entry.getValue();
                first = false;
            }
            if (tempValue < entry.getValue()) {
                number = entry.getKey();
                tempValue=entry.getValue();
            } else if (tempValue == entry.getValue()) {
                number = number <= entry.getKey() ? number : entry.getKey();
            }
        }
        return number;
    }
}

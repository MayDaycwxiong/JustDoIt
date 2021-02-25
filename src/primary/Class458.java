package primary;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回
 * 485. 生成给定大小的数组
 * 给你一个大小size,生成一个元素从1 到 size的数组
 *
 * 样例
 * 样例 1:
 * 	输入:  size = 4
 * 	输出: [1, 2, 3, 4]
 *
 * 	样例解释:
 * 	 返回一个顺序填充1到4的数组。
 *
 * 样例 2:
 */
public class Class458 {

    public List<Integer> generate(int size) {
        // write your code here
        List<Integer> integerList=new ArrayList<>(size);
        for(int i=1;i<=size;i++){
            integerList.add(i);
        }
        return integerList;
    }
}

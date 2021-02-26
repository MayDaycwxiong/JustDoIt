package primary;

import java.util.ArrayList;
import java.util.List;

/**
 * 366. 斐波纳契数列
 * 查找斐波纳契数列中第 N 个数。
 *
 * 所谓的斐波纳契数列是指：
 *
 * 前2个数是 0 和 1 。
 * 第 i 个数是第 i-1 个数和第i-2 个数的和。
 * 斐波纳契数列的前10个数字是：
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 *
 * 在测试数据中第 N 个斐波那契数不会超过32位带符号整数的表示范围
 *
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 样例  1:
 * 	输入:  1
 * 	输出: 0
 *
 * 	样例解释:
 * 	返回斐波那契的第一个数字，是0.
 *
 * 样例 2:
 * 	输入:  2
 * 	输出: 1
 *
 * 	样例解释:
 * 	返回斐波那契的第二个数字是1.
 */
public class Class336 {

//    public int fibonacci(int n) {
//        // write your code here
//        if(n<=1){
//            return 0;
//        }else if(n==2){
//            return 1;
//        }
//        return fibonacci(n-1)+fibonacci(n-2);
//    }


    public static int fibonacci(int n) {
        // write your code here
        if(n<=1){
            return 0;
        }else if(n==2){
            return 1;
        }
        int[] list=new int[n];
        list[0]=0;
        list[1]=1;
        for(int i=3;i<=n;i++){
            list[i-1]=list[i-2]+list[i-3];
        }
        return list[n-1];


//        if(n<=1){
//            return 0;
//        }else if(n==2){
//            return 1;
//        }
//        List<Integer> list=new ArrayList<>(n-1);
//        list.add(0);
//        list.add(1);
//        for(int i=3;i<=n;i++){
//            list.add(list.get(i-2)+list.get(i-3));
//        }
//        return list.get(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}

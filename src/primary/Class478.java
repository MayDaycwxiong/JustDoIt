package primary;

/**
 * 478. 简单计算器
 * 给出两个整数 a , b ,以及一个操作符 opeator
 *
 * +, -, *, /
 * 返回结果 a<operator>b
 *
 * 使用switch语法
 *
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 样例 1:
 * 	输入:  a = 1, b = 2, operator = +
 * 	输出: 3
 *
 * 	样例解释:
 * 	返回 1 + 2 的结果.
 *
 * 样例 2:
 * 	输入:  a = 10, b = 20, operator = *
 * 	输出: 200
 *
 * 	样例解释:
 * 	返回10 * 20的结果.
 *
 * 样例 3:
 * 	输入:  a = 3, b = 2, operator = /
 * 	输出: 1
 *
 * 	样例解释:
 * 	返回 3 / 2的结果.
 *
 * 样例 4:
 * 	输入:  a = 10, b = 11, operator = -
 * 	输出: -1
 *
 * 	样例解释:
 * 	返回 10 - 11的结果.
 */
public class Class478 {

    public int calculate(int a, char operator, int b) {
        // write your code here
        // +, -, *, /
        switch (operator){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }
}
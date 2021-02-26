package primary;

/**
 * 454. 矩阵面积
 * 实现一个矩阵类Rectangle，包含如下的一些成员变量与函数：
 *
 * 两个共有的成员变量 width 和 height 分别代表宽度和高度。
 * 一个构造函数，接受2个参数 width 和 height 来设定矩阵的宽度和高度。
 * 一个成员函数 getArea，返回这个矩阵的面积。
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 样例1:
 * Java:
 *     Rectangle rec = new Rectangle(3, 4);
 *     rec.getArea(); // should get 12，3*4=12
 *
 * Python:
 *     rec = Rectangle(3, 4)
 *     rec.getArea()
 *
 * 样例2:
 * Java:
 *     Rectangle rec = new Rectangle(4, 4);
 *     rec.getArea(); // should get 16，4*4=16
 *
 * Python:
 *     rec = Rectangle(4, 4)
 *     rec.getArea()
 */
public class Class454 {

    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    private int width;
    private int height;
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public Class454(int width,int height){
        this.width=width;
        this.height=height;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return this.width*this.height;
    }
}

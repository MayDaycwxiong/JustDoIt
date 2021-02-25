package primary;

/**
 * 463. 整数排序
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 *
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 样例  1:
 * 	输入:  [3, 2, 1, 4, 5]
 * 	输出:  [1, 2, 3, 4, 5]
 *
 * 	样例解释:
 * 	返回排序后的数组。
 *
 * 样例 2:
 * 	输入:  [1, 1, 2, 1, 1]
 * 	输出:  [1, 1, 1, 1, 2]
 *
 * 	样例解释:
 * 	返回排好序的数组。
 */
public class Class463 {

    public void sortIntegers(int[] A) {
        // write your code here
        for(int i=1;i<A.length;i++){
            int targetValue=A[i];
            int currentEmptyIndex=i;
            int currentIndex=i-1;

            while(currentIndex>-1){
                if(A[currentIndex]>targetValue){
                    A[currentEmptyIndex]=A[currentIndex];
                    currentEmptyIndex=currentIndex;
                }
                currentIndex--;
                if(currentIndex>0&&A[currentIndex]<targetValue){
                    break;
                }
            }
            if(currentEmptyIndex<i){
                A[currentEmptyIndex]=targetValue;
            }
        }
    }
}

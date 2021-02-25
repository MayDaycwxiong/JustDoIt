public class Class2 {
    public static void main(String[] args) {
        System.out.println(trailingZeros(625));
    }

    public static long trailingZeros(long n) {
        long result =n/5;
        long count=result;
        while(result >0){
            count += result /5;
            result=result/5;
        }
        return count;
    }
}

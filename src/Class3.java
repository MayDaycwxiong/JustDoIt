public class Class3 {

    public static void main(String[] args) {
        System.out.println(digitCounts(1,12));
    }

    public static int digitCounts(int k, int n) {
        // write your code here
        int base=10;
        int total=0;
        if((n%base)>=k){
            total+=1;
        }
        while(n/base>0){
            total+=(n/base)*(base/10);
            base*=10;
        }
        return total;
    }
}

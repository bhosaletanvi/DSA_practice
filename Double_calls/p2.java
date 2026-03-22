public class p2 {
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
    static void fun(int n){
        if(n==0 || n==1){
            return;
        }
        fun(n-1);
        System.out.println("100");
        fun(n-1);
        return;
    }
}

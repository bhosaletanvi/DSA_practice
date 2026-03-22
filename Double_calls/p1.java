public class p1 {
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
    static void fun(int n){
        if(n==0 || n==1){
            System.out.println("500");
            return;
        }
        System.out.println("100");
        fun(n-2);
        System.out.println("200");
        fun(n-2);
        System.out.println("300");
        return;
    }
}

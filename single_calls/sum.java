import java.util.*;
class sum{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        int ans=0;
        fun(n,ans);
    }
    static void fun(int n,int sum){
        if(n==0){
            System.out.print("Sum : "+sum);
            return;
        }
        sum=sum+n;
        fun(n-1,sum);
    }
}
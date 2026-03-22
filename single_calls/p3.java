// N to 1 without using count
import java.util.*;
class p3{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        fun(n);
    }
    static void fun(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        
        fun(n-1);
    }
}
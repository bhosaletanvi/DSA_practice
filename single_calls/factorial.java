import java.util.*;
class factorial{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        int fact=fun(n);
        System.out.print("Factorial : "+fact);
    }
    static int fun(int n){
        if(n==1){
            return 1;
        }
        int val=fun(n-1);
        
        return val*n;
    }
}
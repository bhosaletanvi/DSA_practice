import java.util.*;
class fibonacci_series{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        System.out.print("0 1 ");
        fun(n,0,1,2);
        } 
        static void fun(int n,int fisrt,int second,int pos){
            int c=fisrt+second;
           if(pos>n){
            return;
           }
           System.out.print(c+" ");
           fun(n,second,c,(pos+1));
        }   
    }
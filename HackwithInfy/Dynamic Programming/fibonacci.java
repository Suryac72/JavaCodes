import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int qb[] = new int[n+1];
        // int res = fibo(n);
        int res1 = fiboDynamic(n, qb);
        System.out.println(res1);
        // System.out.println(res);
    }
    //Using Recursion
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        System.out.println("Value " + n);
        int fibom = fibo(n-1);
        int fibon = fibo(n-2);
        return fibom + fibon;
    }
    //Using Memoization (Dynamic Programming)
    public static int fiboDynamic(int n,int qb[]){
        if(n==0||n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
     
        System.out.println("Value " + n);
        int fibom = fiboDynamic(n-1,qb);
        int fibon = fiboDynamic(n-2,qb);
        int f = fibom + fibon;
        qb[n] = f;
        return f;
    }
}

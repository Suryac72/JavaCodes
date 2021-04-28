import java.io.*;
import java.util.*;
import java.lang.Math;
class Solution {
    public static int beautifulFunction(int N){
      N = N+1;
      if(N%10!=0){
        return N;
      }
      String str = Integer.toString(N);
      for(int i = 1;i<str.length();i++){
        N = N/10;
      }    
      return N;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int result = beautifulFunction(N);
        System.out.println(result);
        
      
    }
}
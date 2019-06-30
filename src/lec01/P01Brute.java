package lec01;

import java.util.Arrays;

//用1~9组成3个三位数a,b,c满足 `a:b:c=1:2:3`
public class P01Brute {
    public static void main(String[] args) {
        for(int a=100;a<=999;a++)
            for(int b=100;b<=999;b++)
                for(int c=100;c<=999;c++){
            int A[]=new int[9];
            A[0]=a/100;A[1]=a%100/10;A[2]=a%10;
            A[3]=b/100;A[4]=b%100/10;A[5]=b%10;
            A[6]=c/100;A[7]=c%100/10;A[8]=c%10;
            Arrays.sort(A);
            if(ok(A) && b==2*a && c==3*a){
                System.out.println(a+" "+b+" "+c);

            }
                }
    }

    private static boolean ok(int[] a) {
        for(int i=0;i<a.length;i++){
            if(a[i]!=i+1)
                return false;
        }
        return true;
    }
}

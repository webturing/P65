package lec01;

/**
 * - 在1-100中找到六个数a,b,c,d,e,f满足
 - a^5+b^5+c^5+d^5+e^5=f^5
 assume 1<=a<=b<=c<=d<=e<f<=N
 store h(i) into array H
 */
public class P02Step2Array {
    public static final int N = 100;
    static long H[];
    static void fill(){
        H=new long[N+1];
        for(int i=1;i<=N;i++)H[i]=1L*i*i*i*i*i;
    }

    public static void main(String[] args) {
       // System.out.println(100^5);//xor
        //System.out.println(100*100*100*100*100);//int overflow
        long start=System.currentTimeMillis();
        solve();
        long end=System.currentTimeMillis();
        System.out.println(String.format("%.3f Second(s)",(end-start)/1000.0));
    }

    private static void solve() {
        fill();
        for(int a=1;a<N;a++)
            for(int b=a;b<N;b++)
                for(int c=b;c<N;c++)
                    for(int d=c;d<N;d++)
                        for(int e=d;e<N;e++)
                            for(int f=e+1;f<=N;f++){
                                if(H[a]+H[b]+H[c]+H[d]+H[e]==H[f]){
                                    System.out.println(
                                            String.format("%d %d %d %d %d %d",a,b,c,d,e,f));
                                }



                            }
    }

}
